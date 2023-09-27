package Java.IfAndElse;
import java.util.Scanner;

public class Main {

  public static  void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter your age : ");
    
    //String input = scanner.next();
    //int age = Integer.parseInt(input);
    int age = scanner.nextInt();
    
    if(age>=60){
      
      System.out.println("You are a Senior Citizen");
      
    }
    else if (age>=18){
      System.out.println("You are an Adult");
    
    }
    else if(age>=14){
      System.out.println("You are a Teenager");
    }
    else{
      System.out.println("You are a boy");
    }
    
    Shoe shoe = new Shoe("Black",8);
    
    System.out.println("Search shoe by Colour");
    String input = scanner.next();
    
    if(shoe.getColour().equals(input)){
      
      System.out.println("Other attribute of of that shoe are "+shoe.getColour()+","+shoe.getSize());
    }
    else {
      System.out.println("there is no "+input+" shoe"+shoe.getColour());
    }
  }
}
