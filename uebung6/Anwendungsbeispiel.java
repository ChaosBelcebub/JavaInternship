/**
* Anwendungsbeispiel
* Example
*
* @author Michael Kotzjan
* @version 1.0
*/
public class Anwendungsbeispiel
{
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    int countInvalid = 0;
    Zahlungsmittel geld[]=
    {new USD_Muenze(0.10), new EUR_Schein(20), new SFR_Schein(5),
      new SFR_Muenze(0.50), new USD_Muenze(0.50), new EUR_Schein(50),
      new USD_Schein(100), new USD_Muenze(0.2), new USD_Muenze(0.25)};

    for (int i = 0; i < geld.length; ++i) {
      if (geld[i].wertIstGueltig())
      {
        System.out.println(geld[i].getWert() + " " + geld[i].getWaehrung());
      }
      else
      {
        ++countInvalid;
      }
    }
    System.out.println(countInvalid + " Werte sind ungültig.");

    // New array of valid values
    Zahlungsmittel geldGueltig[] = new Zahlungsmittel[geld.length - countInvalid];
    int count = 0;
    for (int i = 0; i < geld.length; ++i) {
      if (geld[i].wertIstGueltig())
      {
        geldGueltig[count++] = geld[i];
      }
    }

    // Number 2. Count values for each type
    double EurValue = 0.0;
    double UsdValue = 0.0;
    double SfrValue = 0.0;
    for (int i = 0; i < geldGueltig.length; ++i) {
      switch (geldGueltig[i].getWaehrung()) {
        case "EUR":
          EurValue += geldGueltig[i].getWert();
          break;
        case "SFR":
          SfrValue += geldGueltig[i].getWert();
          break;
        case "USD":
          UsdValue += geldGueltig[i].getWert();
          break;
      }
    }
    System.out.println("Aufgabe 2:");
    System.out.println("EUR: " + EurValue);
    System.out.println("SFR: " + SfrValue);
    System.out.println("USD: " + UsdValue);

    // Number 3. Count weight of coins and area of notes
    double weight = 0.0;
    double area = 0.0;
    for (int i = 0; i < geldGueltig.length; ++i) {
      if (geldGueltig[i] instanceof Muenze)
      {
        weight += geldGueltig[i].getGewicht();
      }
      else
      {
        area += geldGueltig[i].getLaenge() * geldGueltig[i].getBreite();
      }
    }
    System.out.println("Gewicht der Münzen:" + weight);
    System.out.println("Fläche der Scheine:" + area);
  }
}
