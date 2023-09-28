package Java.Arrays;
import Java.Arrays.Magie;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {
    
    //Array is type of collection
    //one way to use Array
    String[] names = {"Ashiq","Alim","Sadiq"};
    
    //2nd way to use Array
    int[] age = new int[3];
    age[0] = 23;
    age[1] = 21;
    age[2] = 21;
    
    //to print Array we have use forloop or toString() method
    System.out.println(Arrays.toString(names));
    
    for(int i:age){
      System.out.print(i+",");
    }
    
    Magie[] magies = {new Magie("Ashiq",12),new Magie("Alim",10),new Magie("Faizan",5)};
    
    for(Magie c:magies){
      
      System.out.println(c.getName());
      System.out.println(c.getQuantity());
    }
    System.out.println(Arrays.toString(magies));
    
  }

}
