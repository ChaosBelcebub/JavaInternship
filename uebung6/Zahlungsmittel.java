/**
* abstract java class
*
* @author Michael Kotzjan
* @version 1.0
*/
public abstract class Zahlungsmittel implements Comparable<Zahlungsmittel>
{
  public abstract String getWaehrung();
  public abstract double getWert();
  public abstract boolean wertIstGueltig();
  public abstract int compareTo(Zahlungsmittel z);
}
