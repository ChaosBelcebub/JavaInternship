/**
* A EUR note
*
* @author Michael Kotzjan
* @version 1.0
*/
public class EUR_Schein extends EUR implements Schein
{
  // Private
  private boolean isValid = true;
  private double laenge;
  private double breite;
  private double value;

  public EUR_Schein(double v)
  {
    value = v;
    
    if(value == 5.0)
    {
      laenge = 12.0;
      breite = 6.2;
    }
    else if(value == 10.0)
    {
      laenge = 12.7;
      breite = 6.7;
    }
    else if(value == 20.0)
    {
      laenge = 13.3;
      breite = 7.2;
    }
    else if(value == 50.0)
    {
      laenge = 14.0;
      breite = 7.7;
    }
    else if(value == 100.0)
    {
      laenge = 14.7;
      breite = 8.2;
    }
    else if(value == 200.0)
    {
      laenge = 15.3;
      breite = 8.2;
    }
    else if(value == 500.0)
    {
      laenge = 16.0;
      breite = 8.2;
    }
    else
    {
      laenge = 0.0;
      breite = 0.0;
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
    return "EUR";
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
