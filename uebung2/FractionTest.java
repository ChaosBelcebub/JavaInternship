/**
* Tests the fraction class
*
* @author Michael Kotzjan
* @version 1.0
*/
public class FractionTest
{
  
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    System.out.println("--------------------");
    System.out.println("Eigene Tests:\n");
    Fraction a = new Fraction(1, 2);
    System.out.println("Fraction(1, 2):");
    System.out.println(a.get());

    Fraction b = new Fraction(-1, 2);
    System.out.println("Fraction(-1, 2):");
    System.out.println(b.get());

    Fraction c = new Fraction(1, -2);
    System.out.println("Fraction(1, -2):");
    System.out.println(c.get());

    Fraction d = new Fraction(2, 4);
    System.out.println("Fraction(2, 4):");
    System.out.println(d.get());

    Fraction e = new Fraction(-2, -4);
    System.out.println("Fraction(-2, -4):");
    System.out.println(e.get());

    System.out.println("Fraction(4, 0):");
    Fraction f = new Fraction(4, 0);
    System.out.println(f.get());
    System.out.println();
    
    a.add(d);
    System.out.println("1/2 + 2/4 = " + a.get());
    
    b.add(new Fraction(2, 3));
    System.out.println("-1/2 + 2/3 = " + b.get());

    f.add(new Fraction(6, 8));
    System.out.println("4 + 6/8 = " + f.get());

    b.add(4);
    System.out.println("-1/2 + 4 = " + b.get());

    Fraction g = new Fraction(4, 1);
    g.mul(new Fraction(1, 2));
    System.out.println("4/1 * 1/2 = " + g.get());

    g.mul(5);;
    System.out.println("2/1 * 5 = " + g.get());

    Fraction h = new Fraction(2, 5);
    h.div(new Fraction(3, 4));
    System.out.println("2/5 / 3/4 = " + h.get());

    h.div(2);
    System.out.println("8/15 / 2 = " + h.get());
    System.out.println("\n--------------------");
    System.out.println("Aufgabe 2:\n");

    Fraction result = new Fraction(1, 1);
    for (int i = 2; i < 5; i++) {
      result.add(new Fraction(1, i));
    }
    System.out.println("Summe für n = 4: " + result.get());
    for (int i = 5; i < 11; i++) {
      result.add(new Fraction(1, i));
    }
    System.out.println("Summe für n = 10: " + result.get());
    for (int i = 11; i < 16; i++) {
      result.add(new Fraction(1, i));
    }
    System.out.println("Summe für n = 15: " + result.get());

    System.out.println("\n--------------------");
    System.out.println("Aufgabe 3:\n");

    System.out.println("e(1) = " + Fraction.e(1));
    System.out.println("e(2) = " + Fraction.e(2));
    System.out.println("e(5) = " + Fraction.e(5));
  }
}
