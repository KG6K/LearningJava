package Java.Datatype;

public class Customer {

  private String text;
  
  public Customer(String text){
    
    this.text=text;
  }
  //method to Get
  public String getText(){
    return  this.text;
  }
  //method to set
  public void setText(String text){
    this.text=text;
  }
}
