import java.util.Random;
  
class Jar{
  private String itemName;
  private int MAXNUM_ITEMS; 
  //how many items are actually in the jar
  private int currentNumItems;
  
  
  public Jar(String itemName, int MAXNUM_ITEMS){
    this.itemName = itemName;
    this.MAXNUM_ITEMS = MAXNUM_ITEMS; 
    currentNumItems = 0; 
  }
  
  public void fill(){
    Random random = new Random();
    
    int randomNumber = random.nextInt(MAXNUM_ITEMS) + 1;
    this.currentNumItems = randomNumber;
    
    System.out.printf("The random number is %d. %n", currentNumItems);
  }
  
  String getName(){
    return itemName;
  }
  int getItems(){
    return MAXNUM_ITEMS; 
  }
  int getRandomNumber(){
    return currentNumItems;
  }
}