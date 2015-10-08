/**
* A USD coin
*
* @author Michael Kotzjan
* @version 1.0
*/
public class USD_Muenze extends USD implements Muenze
{
  // Private
  private boolean isValid = true;
  private double gewicht;
  private double durchmesser;
  private double dicke;
  private double value;

  public USD_Muenze(double v)
  {
    value = v;
    
    if(value == 0.01)
    {
      gewicht = 2.5;
      durchmesser = 1.905;
      dicke = 0.152;
    }
    else if(value == 0.05)
    {
      gewicht = 5.0;
      durchmesser = 2.121;
      dicke = 0.195;
    }
    else if(value == 0.1)
    {
      gewicht = 2.268;
      durchmesser = 1.791;
      dicke = 0.135;
    }
    else if(value == 0.25)
    {
      gewicht = 5.67;
      durchmesser = 2.426;
      dicke = 0.175;
    }
    else if(value == 0.5)
    {
      gewicht = 11.34;
      durchmesser = 3.061;
      dicke = 0.215;
    }
    else if(value == 1.0)
    {
      gewicht = 8.1;
      durchmesser = 2.649;
      dicke = 0.2;
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
