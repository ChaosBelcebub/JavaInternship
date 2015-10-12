import java.util.*;

/**
* Working with collections
*
* @author Michael Kotzjan
* @version 1.0
*/
public class CollectionTest
{
  
  /**
  * Main
  *
  * @param args parameter
  */
  public static void main(String[] args)
  {
    LinkedList<String> li = new LinkedList<String>();
    li.add("Montag");
    li.add("Dienstag");
    li.add("Mittwoch");
    li.add("Donnerstag");
    li.add("Freitag");
    li.add("Samstag");
    li.add("Sonntag");
    for (String s: li) {
      System.out.println(s);
    }
  }
}
