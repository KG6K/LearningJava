package Java.Datatype;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
     
    //Primitive numeric type
    short s = 2762;
    int i = 3625;
    long l = 82672627367376l;
    double d = 383.873;
    byte b = 'Z';
    float f = 867f;
    
    //primitive textual type;
    char c = '1';
    
    //non-primitive type ;
    String string = "You can put anything here";
    Scanner scanner = new Scanner(System.in);
    
    //any class can be used as object ,datatype
    Customer customer = new Customer("Any data type You want to put");
    
    
    System.out.println(s+"\n"+i+"\n"+l+"\n"+d+"\n"+b+"\n"+f+"\n"+c+"\n"+string+"\n"+customer.getText());
    scanner.close();
  }
}
