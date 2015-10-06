/**
* A simple java class
*
* @author Michael Kotzjan
* @version 1.0
*/
public class RestrictedCounter extends Counter
{
  private int c;
  public RestrictedCounter(int v) {c = v;}
  public void increment()
  {
    if (x < c)
    {
      x++;
    }
    else
    {
      System.out.println("Counter is full");
    }
  }
  public int freeCapacity()
  {
    return c - x;
  }
}
