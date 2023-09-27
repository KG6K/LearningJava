package Java.ConditionAndBoolean;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    int x =262;
    int y =737;
    //these comparison can be done with numeric data type 
    boolean a =x>y;
    boolean b =x<y;
    boolean c = x<=y;
    boolean d = x>=y;
    boolean e = x==y;
    boolean f = x!=y;
    
    boolean g = x<y&&x==y;
    boolean h = x==y||x!=y;
    
    String Name = "Ashiq";
    String name = "Ashiq";
    
    //these comparison can be done with String
    
    Scanner sc = new Scanner(System.in);
    String input = sc.next();
    boolean i = Name.equals(input);
    boolean j = !Name.equals(name);
    
    System.out.println(a+","+b+","+c+","+d+","+e+","+f+","+g+","+h+",i ="+i+","+j);
    
    Mobile tecno = new Mobile("Tecno Spark 8",32);
    Mobile redmi = new Mobile("Redmi 5A",16);
    
    System.out.println("Checking if two object is equal or not ="+tecno.equals(redmi));
    
    System.out.println("Checking if there attributes are equals or not ="+name.equals(redmi.getName()));

  }

}
