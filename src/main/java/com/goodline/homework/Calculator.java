package com.goodline.homework;

public class Calculator {
    public static double Addition(double a, double b) {
        double result =a+b;
        return result;
    }
    public static double Multiplication(double a, double b){
        double result=a*b;
    return result;
    }
    public static double Subtraction(double a, double b){
        double result=a-b;
        return result;
    }
    public static double Division(double a,double b){
        double result=a/b;
        return result;
    }
    public static double Sqrt(double a){
        double result=Math.sqrt(a);
        return result;
    }

    public static double Percent(double a,double b){
        double result=(a/100.0)*b;
        return result;
    }
}
