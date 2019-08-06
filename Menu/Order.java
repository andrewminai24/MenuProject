import java.util.Scanner;

public class Order{
 
  
  public static double[] price = new double[]{5.25,5.75,5.95,5.95,5.95};
  public static int[] items = new int[]{};
  public static String[] qan = new String[]{"De Anza Burger","Bacon Cheese","Mushroom Swiss", "Western Burger","Don Cali Burger"};
  public static double total_price = 0;
  public static double total_tax = 0;
  public static double t = 9;
  public static double d = 0;

//This the method where I am displaying the list of
//De Anza burgers.
  public static void displayMenu(){
  
  
  System.out.println("1. De Anza Burger 5.25");
  System.out.println("2. Bacon Cheese 5.75");
  System.out.println("3. Mushroom Swiss 5.95");
  System.out.println("4. Western Burger 5.95");
  System.out.println("5. Don Cali Burger 5.95");
  System.out.println("6.Exit to see your recipt");
  

  System.out.println("Please choose your choice");
  } 


  //This the method where I am getting the inputs from the user and pushing the data into a array.
  public static void getInputs(){
   boolean end = false;
   Scanner in = new Scanner(System.in); 
    
    while(!end){

    int choice= in.nextInt();
   
    if(choice == 1)
    {
      displayMenu();
      items=push(items,0);
      continue;
    } else if(choice == 2){
      displayMenu();
      items=push(items,1);
      continue;
    } else if(choice == 3){
     displayMenu();
     items=push(items,2);
      continue;
    } else if(choice == 4){
      items=push(items,3);
      displayMenu();
      continue;
    } else if(choice == 5){
      items=push(items,4);
      displayMenu();
    } else if(choice == 6){
      end=true;
      }else{
        System.out.println("Invalid"); 
        System.out.println("Incorrect input please input numbers 1-6");
        displayMenu();
      }

      }


    System.out.println("Are you a student or Staff?");
    
    System.out.println("1.student");
    System.out.println("2. Staff");
    int user = in.nextInt();
    if(user == 1){
     t=0;
    }
    //calculate();
  }


  //calculate the bill with tax included.
  public static void calculate() {
    for (int i = 0; i < items.length; i++){
      //add discount below and 
      total_price+=price[items[i]];
    }
    total_tax = total_price*((t)/100);
    total_price=total_price+total_tax;
  } 

  //prints the bill with all the details using variables we stored
  public static void printBill() {
    for (int i = 0; i < qan.length; i++){
      //add discount below and 
      int ccc = arrayCount(items,i);
      if(ccc!=0){
        
        System.out.println(qan[i]+"  ---- quantity: "+ccc+" Price:$"+ ccc*price[i]);
      }
    }
    System.out.println("Sub Total:$"+(total_price-total_tax)+"");
    System.out.println("Total percentages:"+ t+"%");
   System.out.println("Taxes:$"+total_tax+"");
    System.out.println("Total DUE:$"+total_price+"");
    
  }

//counts how many times item occur in the array
  public static int arrayCount(int[] array, int item) {
    int amt = 0;
    for (int i = 0; i < array.length; i++) {
        if (array[i] == item) {
            amt++;
        }
        else {
            amt = amt;
        }
    }
    return amt;
}

  //push items to the array, so we don't need to use arraylist
  public static int[] push(int[] array, int push) {
    int[] longer = new int[array.length + 1];
    for (int i = 0; i < array.length; i++)
        longer[i] = array[i];
    longer[array.length] = push;
    return longer;
  } 
  //push item to the array, so we don't need to use arraylist
  public static String[] push(String[] array, String push) {
    String[] longer = new String[array.length + 1];
    for (int i = 0; i < array.length; i++)
        longer[i] = array[i];
    longer[array.length] = push;
    return longer;
  } 


}
  //Get users choice

  //Display the title of the choose module
  //calculate()
//Use array in this method.

