/**
* Prime class
*
* @author Michael Kotzjan
* @version 1.0
*/

import java.util.ArrayList;
import java.util.ListIterator;

public class Prime
{
  
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    ArrayList<Integer> li = new ArrayList<Integer>();
    ArrayList<Integer> prime = new ArrayList<Integer>();
    for (int i = 2; i <= 1000; ++i)
    {
      li.add(i);
    }

    while (li.size() > 0) {
      Integer p = li.get(0);
      prime.add(p);
      li.remove(p);
      int i = 0;
      while (i < li.size()) {
        if (li.get(i) % p != 0)
        {
          ++i;
        }
        else
        {
          li.remove(i);
        }
      }
    }

    for (Integer i: prime) {
      if (prime.contains(i + 1))
      {
        System.out.println("(" + i + ", " + (i + 1) + ")");
      }
      if (prime.contains(i +2))
      {
        System.out.println("(" + i + ", " + (i + 2) + ")");
      }
    }
  }
}
