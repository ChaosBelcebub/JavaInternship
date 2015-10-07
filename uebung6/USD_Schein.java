/**
* A USD note
*
* @author Michael Kotzjan
* @version 1.0
*/
public class USD_Schein extends USD implements Schein
{
  // Private
  private boolean isValid;
  private double laenge = 15.5956;
  private double breite = 6.6294;
  private double value;

  public USD_Schein(double v)
  {
    value = v;
    
    if(value == 1.0 || value == 5.0 || value == 10.0 || value == 20.0 || value == 50.0 || value == 100.0)
    {
      isValid = true;
    }
    else
    {
      isValid = false;
    }
  }

  // Interface
  public double getLaenge()
  {
    return laenge;
  }

  public double getBreite()
  {
    return breite;
  }

  // Class
  public String getWaehrung()
  {
    return "USD";
  }

  public double getWert()
  {
    return value;
  }

  public boolean wertIstGueltig()
  {
    return isValid;
  }
}
