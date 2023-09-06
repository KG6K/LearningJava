package Java.BasicOperator;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    int x =737;
    int y = 27;
    
    int add = x+y-4;
    int multiply = x*y;
    //changing data type by casting
    double divide = x/(double)y;
    int reminder = x%y;
    double power =Math.pow(x,y);
    
    System.out.println("Add : "+add+
"\nMultiply : "+multiply+
"\nDivide : "+divide+
"\nReminder : "+reminder+
"\nPower : "+power);
    
    //post increament
    System.out.println("x before post-increament = "+x);
    x++;
    System.out.println("x after post-increament = "+x);
    //post-decreament
    System.out.println("x before post-decreament = "+x);
    x--;
    System.out.println("x after post-increament = "+x);
    x *= 2;
    System.out.println("x *="+x);
    x /= 2;
    System.out.println("x /="+x);
    
    //pre increament
    System.out.println("y before pre-increament = "+y);
    ++y;
    System.out.println("y after pre-increament = "+y);
    
    //pre decreament
    System.out.println("y brefor pre-decreament ="+y);
    --y;
    System.out.println("y after pre-decreament ="+y);
    
  }

}
