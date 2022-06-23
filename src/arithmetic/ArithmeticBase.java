/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

import java.util.Scanner;

/** This class takes String input plus,minus,divide and times
 * from user and execute the arithmetic operation
 * change the code to use enum instead String and mention the advantage of enum.
 * @author sivagamasrinivasan
 * enums help to avoid string errors as enums 
 * are special classes for constants and it makes the code reusable.
 */
public class ArithmeticBase 
{
 public double x,y;
 public enum Operators {PLUS, MINUS, DIVIDE, TIMES};
        
    private Operators operators;

    double calculate(double x, double y) 
        {
        
        public Operators(operators o){
            
            this.operators = o;        
            Scanner sc =new Scanner(System.in);
            System.out.println("Enter arithmetic operation to Perform: ");
            enums = in.next();
        
        }
     
        switch (enums) 
        {
            case "PLUS":
                return x + y;
            case "MINUS":
                return x - y;
            case "TIMES":
                return x * y;
            case "DIVIDE":
                return x / y;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
   
    }
}
