/**
* A SFR note
*
* @author Michael Kotzjan
* @version 1.0
*/
public class SFR_Schein extends SFR implements Schein
{
  // Private
  private boolean isValid = true;
  private double laenge;
  private double breite = 7.4;
  private double value;

  public SFR_Schein(double v)
  {
    value = v;
    
    if(value == 10.0)
    {
      laenge = 12.6;
    }
    else if(value == 20.0)
    {
      laenge = 13.7;
    }
    else if(value == 50.0)
    {
      laenge = 14.8;
    }
    else if(value == 100.0)
    {
      laenge = 15.9;
    }
    else if(value == 200.0)
    {
      laenge = 17.0;
    }
    else if(value == 1000.0)
    {
      laenge = 18.1;
    }
    else
    {
      laenge = 0.0;
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
    return "SFR";
  }

  public double getWert()
  {
    return value;
  }

  public boolean wertIstGueltig()
  {
    return isValid;
  }

  public int compareTo(Zahlungsmittel z)
  {
    if (this.value == z.getWert())
    {
      return 0;
    }
    else if (this.value > z.getWert())
    {
      return 1;
    }
    else
    {
      return -1;
    }
  }
}
