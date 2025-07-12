package com.cognizant.spring_learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.cognizant.spring_learn.Country;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class SpringLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

    public void displayCountry() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country singleCountry = context.getBean("country", Country.class);
        LOGGER.debug("Country : {}", singleCountry.toString());
    }
    public void displayDate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);
        try {
            Date date = format.parse("31/12/2018");
            LOGGER.info("Parsed Date: {}", date);
        } catch (ParseException e) {
            LOGGER.error("Date parsing failed", e);
        }
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringLearnApplication.class, args);

        // Demo purposes
        SpringLearnApplication app = new SpringLearnApplication();
        app.displayCountry();
        app.displayDate();
    }
}