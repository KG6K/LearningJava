package Java.ConditionAndBoolean;

public class Mobile {
 
  private String name;
  private int storage;
  
  public Mobile(String name,int storage){
    
    this.name=name;
    this.storage=storage;
  }
  //always make settter and getter ,and remove unused method after coding is done
  public void setName(String name){
    this.name=name;
  }
  public String getName(){
    
    return this.name;
  }
  public void setStorage(int rom){
    
    this.storage=rom;
  }
  public int getStorage(){
    
    return this.storage;
  }

}
