/**
* A EUR coin
*
* @author Michael Kotzjan
* @version 1.0
*/
public class EUR_Muenze extends EUR implements Muenze
{
  // Private
  private boolean isValid = true;
  private double gewicht;
  private double durchmesser;
  private double dicke;
  private double value;

  public EUR_Muenze(double v)
  {
    value = v;
    
    if(value == 0.01)
    {
      gewicht = 2.27;
      durchmesser = 1.625;
      dicke = 0.167;
    }
    else if(value == 0.02)
    {
      gewicht = 3.06;
      durchmesser = 1.875;
      dicke = 0.167;
    }
    else if(value == 0.05)
    {
      gewicht = 3.92;
      durchmesser = 2.125;
      dicke = 0.167;
    }
    else if(value == 0.1)
    {
      gewicht = 4.1;
      durchmesser = 1.975;
      dicke = 0.193;
    }
    else if(value == 0.2)
    {
      gewicht = 5.74;
      durchmesser = 2.225;
      dicke = 0.214;
    }
    else if(value == 0.5)
    {
      gewicht = 7.8;
      durchmesser = 2.425;
      dicke = 0.238;
    }
    else if(value == 1.0)
    {
      gewicht = 7.5;
      durchmesser = 2.325;
      dicke = 0.233;
    }
    else if(value == 2.0)
    {
      gewicht = 8.5;
      durchmesser = 2.575;
      dicke = 0.22;
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
