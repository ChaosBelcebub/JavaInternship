/**
* A simple java text analyze class
*
* @author Michael Kotzjan
* @version 1.0
*/
public class Analyze
{
  
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    int[] a = new int[140];
    System.out.println("Es wurden " + args.length +
        " Argumente eingegeben.");
    System.out.println("Die Länge der einzelnen Argumente:");

    for (int i = 0; i < args.length; i++) {
      System.out.println(String.valueOf(i + 1)
          + ".: " + args[i].length());
      for (int j = 0; j < args[i].length(); j++) {
        a[(int)args[i].toUpperCase().charAt(j)]++;
      }
    }

    for (int i = 0; i < a.length; i++) {
      if (a[i] > 0)
      {
        System.out.println((char)i + ": " + a[i]);
      }
    }
  }
}
