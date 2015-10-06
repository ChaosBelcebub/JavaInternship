/**
* Contains two ways to calculate the power of a number
*
* @author Michael Kotzjan
* @version 1.0
*/
public class PowerFunctions
{
  private static Counter countPower = new Counter();
  private static Counter countFastPower = new Counter();

  public static double power(double x, int n)
  {
    double result = 1;
    for (int i = 0; i < n; i++)
    {
      result *= x;
      countPower.increment();
    }
    return result;
  }

  public static double fastPower(double x, int n)
  {
    double result = 1;
    String b = Integer.toBinaryString(n);
    for (int i = 0; i < b.length(); i++)
    {
      result = (result * result);
      countFastPower.increment();
      if (b.charAt(i) == '1')
      {
        result = result * x;
        countFastPower.increment();
      }
    }
    return result;
  }

  public static void resetCounters()
  {
    countPower.reset();
    countFastPower.reset();
  }

  public static int getCountPower()
  {
    return countPower.get();
  }

  public static int getCountFastPower()
  {
    return countFastPower.get();
  }
}
