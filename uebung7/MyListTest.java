/**
* Test class for MyList
*
* @author Michael Kotzjan
* @version 1.0
*/
public class MyListTest
{
  
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    MyList<Integer> l = new MyList<Integer>();
    for (int i = 1; i <= 10; ++i) {
      l.add(8 * i);
    }
    l.remove(3);
    for (int i = l.size() - 1; i >= 0; --i) {
      System.out.print(" " + l.get(i));
    }
    System.out.println();

    MyList<Fraction> f = new MyList<Fraction>();
    for (int i = 1; i <= 10; ++i) {
      f.add(new Fraction(1, i));
    }
    f.remove(3);
    for (int i = f.size() - 2; i >= 0; --i) {
      System.out.print(f.get(i).get() + " | ");
    }
    System.out.println();
  }
}
