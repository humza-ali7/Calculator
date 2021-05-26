// Calculator class by Humza Ali

import java.lang.Math;

public class Calculator {
    private double x1;
    private double x2;
    private char operand;
    
    public Calculator(double x1, char operand, double x2) {
        this.x1 = x1;
        this.x2 = x2;
        this.operand = operand;
    }
    
    public double addition(double x1, double x2) {
        return x1 + x2;
    }
    
    public double subtraction(double x1, double x2) {
        return x1 - x2;
    }
    
    public double product(double x1, double x2) {
        return x1 * x2;
    }
    
    public double quotient(double x1, double x2) {
        return x1 / x2;
    }
    
    public double sine(double x1) {
        return Math.sin(x1);
    }
    
    public double cosine(double x1) {
        return Math.cos(x1);
    }
    
    public double tan(double x1) {
        return Math.cos(x1);
    }
    
    public double square(double x1) {
        return x1 * x1;
    }
    
    public double exp(double x1) {
        return Math.exp(x1);
        
    }
    
    public double raise(double x1, double x2) {
        return Math.pow(x1, x2);
    }
    
    public double ln(double x1) {
        return Math.log(x1);
    }
    
    public double log10(double x1) {
        return Math.log10(x1);
    }
    
}