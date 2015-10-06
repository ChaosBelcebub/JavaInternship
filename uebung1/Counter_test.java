/**
* A simple java class
*
* @author Michael Kotzjan
* @version 1.0
*/
public class Counter_test
{
  
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    Counter a = new Counter();
    
    for (int i = 0; i < 5; i++) {
      a.increment();
    }

    System.out.println("a = " + a.get());

    for (int i = 0; i < 3; i++) {
      a.decrement();
    }

    System.out.println("a = " + a.get());
    a.restore();
    a.store();
    
    for (int i = 0; i < 4; i++) {
      a.decrement();
    }

    System.out.println("a = " + a.get());
    a.restore();
    System.out.println("a = " + a.get());
  }
}
