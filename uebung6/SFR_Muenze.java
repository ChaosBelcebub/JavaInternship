/**
* A SFR coin
*
* @author Michael Kotzjan
* @version 1.0
*/
public class SFR_Muenze extends SFR implements Muenze
{
  // Private
  private boolean isValid = true;
  private double gewicht;
  private double durchmesser;
  private double dicke;
  private double value;

  public SFR_Muenze(double v)
  {
    value = v;
    
    if(value == 0.05)
    {
      gewicht = 1.8;
      durchmesser = 1.715;
      dicke = 0.125;
    }
    else if(value == 0.1)
    {
      gewicht = 3.0;
      durchmesser = 1.915;
      dicke = 0.145;
    }
    else if(value == 0.2)
    {
      gewicht = 4.0;
      durchmesser = 1.915;
      dicke = 0.145;
    }
    else if(value == 0.5)
    {
      gewicht = 2.2;
      durchmesser = 1.82;
      dicke = 0.125;
    }
    else if(value == 1.0)
    {
      gewicht = 4.4;
      durchmesser = 2.32;
      dicke = 0.155;
    }
    else if(value == 2.0)
    {
      gewicht = 8.8;
      durchmesser = 2.74;
      dicke = 0.215;
    }
    else if(value == 5.0)
    {
      gewicht = 13.2;
      durchmesser = 3.145;
      dicke = 0.235;
    }
    else
    {
      gewicht = 0.0;
      durchmesser = 0.0;
      dicke = 0.0;
      isValid = false;
    }
  }

  // Interface
  public double getGewicht()
  {
    return gewicht;
  }

  public double getDurchmesser()
  {
    return durchmesser;
  }

  public double getDicke()
  {
    return dicke;
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
}
