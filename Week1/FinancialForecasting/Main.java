package FinancialForecasting;

public class Main {
    public static void main(String[] args) {
        double principal = 1000.0; 
        double rate = 0.05; 
        int time = 10; 
        double resultRecursion = Recursion.recursion(principal, rate, time);
        System.out.printf("Final amount using recursion: Rs %.2f\n", resultRecursion);
        double resultOptimized = Recursion.recursionOptimized(principal, rate, time);
        System.out.printf("Final amount using optimized recursion: Rs %.2f\n", resultOptimized);
    }
}
