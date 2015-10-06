public class Counter
{
  protected int x;
  private int s = -1;

  public Counter() {x = 0;}
  public void increment() {x++;}
  public int get() {return x;}
  public void reset() {x=0;}
  public void decrement()
  {
    if (x > 0)
    {
      x--;
    }
  }
  public void store()
  {
    s = x;
  }
  public void restore()
  {
    if (s >= 0) 
    {
      x = s;
    }
    else
    {
      System.out.println("Bitte zuerst Wert speichern!");
    }
  }
}
