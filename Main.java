/* Simple Java Calculator Script by Humza Ali
   Currently looking to improve script to mimic a more complex scientific 
   calculator (i.e. more parameters and functions, however still a work in progress. */      

import java.util.Arrays;
import java.util.Scanner;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
	    System.out.println("Syntax: value1 operand value2");
	    System.out.println("operand commands below");
	    System.out.print("Note: If you are only performing an operation on one variable, ");
	    System.out.println("please enter 0 for the value2 parameter");
	    System.out.println("'+' = add, '-' = subtract, '*' = multiply, '/' = divide, '2' = square, '^' = power");
	    System.out.println("'s' = sine, 'c' = cosine, 't' = tangent");
	    System.out.println("'e' = e^x, 'l' = log base 10, 'n' = natural log (ln)");
	    System.out.print("Enter your command here: ");
	    
	    Scanner scanner = new Scanner(System.in);
		String[] tokens = scanner.nextLine().split(" ");
		scanner.close();
		double x = Double.parseDouble(tokens[0]);
	    char o = tokens[1].charAt(0);
		double y = Double.parseDouble(tokens[2]);
		Calculator c = new Calculator(x, o, y);
		
		switch(o) {
		    case '+':
		        System.out.println(c.addition(x, y));
		        break;
		        
		    case '-':
		        System.out.println(c.subtraction(x,y));
		        break;
		        
		    case '*': 
		        System.out.println(c.product(x,y));
		        break;
		        
		    case '/':
		        System.out.println(c.quotient(x, y));
		        break;
		        
		    case 's':
		        System.out.println(c.sine(x));
		        break;
		    
		    case 'c': 
		        System.out.println(c.cosine(x));
		        break;
		        
		    case 't': 
		        System.out.println(c.tan(x));
		        break;
		    
		    case '^':
		        System.out.println(c.raise(x, y));
		        break;
		    
		    case 'e':
		        System.out.println(c.exp(x));
		        break;
		    
		    case 'n':
		        System.out.println(c.ln(x));
		        break;
		        
		    case 'l':
		        System.out.println(c.log10(x));
		        break;
		    
		    case '2':
		        System.out.println(c.square(x));
		        break;
		        
		    default:
		        System.out.println("Error: Invalid Operand");
		        break;
		}
		
	}
}
