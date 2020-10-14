/**
 *
 * @author 
 */
public class Main {

//method here
  public static int firstDigit(int number){
    //divides number by 10 until its smaller then 10 
    while(number > 10){
      number = number / 10;
    }
    return number;
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    
    //calls the method
    int numberTwo = firstDigit(698745);
    System.out.println(numberTwo);
  }
}
