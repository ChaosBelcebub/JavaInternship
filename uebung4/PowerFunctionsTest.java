/**
* Test for PowerFunctions.class
*
* @author Michael Kotzjan
* @version 1.0
*/
public class PowerFunctionsTest
{ 
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    int countExponent = 0;
    int countMultiplications1 = 0;
    int countMultiplications2 = 0;
    double x;
    int n;
    
    for (int i = 0; i < 10000; i++)
    {
      PowerFunctions.resetCounters();
      x = Math.random();
      n = (int)(1000 * Math.random());
      countExponent += n;
      PowerFunctions.power(x, n);
      PowerFunctions.fastPower(x, n);
      countMultiplications1 += PowerFunctions.getCountPower();
      countMultiplications2 += PowerFunctions.getCountFastPower();
    }

    System.out.println("Durchschnittlicher Exponent: "
        + Integer.toString(countExponent / 10));
    System.out.println("Durchschnittliche Anzahl Multiplikationen:");
    System.out.println("power(x, n)     => "
        + Integer.toString(countMultiplications1 / 10000));
    System.out.println("fastPower(x, n) => "
        + Integer.toString(countMultiplications2 / 10000));
  }
}
