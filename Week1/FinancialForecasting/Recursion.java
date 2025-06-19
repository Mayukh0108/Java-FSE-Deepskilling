package FinancialForecasting;

public class Recursion {

    public static double recursion(double principal, double rate,int time) {
        if (time == 0) {
            return principal;
        }
        double interest = (principal * rate) ;
        return recursion(principal + interest, rate, time - 1);
    }

    public static double recursionOptimized(double principal, double rate,int time) {
        double result = principal;
        for(int i = 0; i < time; i++) {
            result *= (1+rate);
        }
        return result;
    }
    
}
