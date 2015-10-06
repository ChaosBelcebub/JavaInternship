/**
* Test class for sort
*
* @author Michael Kotzjan
* @version 1.0
*/
public class SortTest
{
  
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    Integer[] a = new Integer[8];
    for (int i = 0; i < 8; i++) {
      a[i] = (int)(100 * Math.random());
    }
    Sort.mergesort(a);
    System.out.print("a: ");
    for (int i = 0; i < a.length; ++i)
    {
      System.out.print(a[i] + "; ");
    }
    System.out.println();

    Fraction[] b = new Fraction[8];
    for (int i = 0; i < 8; i++) {
      b[i] = new Fraction((int)(100 * Math.random()),
          (int)(100 * Math.random()));
    }
    Sort.mergesort(b);
    System.out.print("b: ");
    for (int i = 0; i < b.length; i++) {
      System.out.print(b[i].get() + "; ");
    }
    System.out.println();
  }
}
