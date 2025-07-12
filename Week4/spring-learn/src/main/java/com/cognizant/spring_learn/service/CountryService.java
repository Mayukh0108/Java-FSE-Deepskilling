package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

    public Country getCountry(String code) {
        List<Country> countries = (List<Country>) context.getBean("countryList");
        return countries.stream()
                .filter(country -> country.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }

    public List<Country> getAllCountries() {
        return (List<Country>) context.getBean("countryList");
    }
}