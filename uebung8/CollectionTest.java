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

    Tree tree = new Tree();
    HashTable hashTable = new HashTable();
    for (String s: li) {
      tree.add(new Node(s));
      hashTable.put(s);
    }

    // TODO: Balace tree Do 15 Okt 2015 16:00:08 CEST
    
    // Print
    System.out.println();
    System.out.println("Liste:");
    for (Iterator<String> iterator = li.iterator(); iterator.hasNext(); )
    {
      iterator.next();
      if (iterator.hasNext())
      {
        System.out.println(iterator.next());
      }
    }
    System.out.println();
    System.out.println("Baum:");
    tree.print();
    System.out.println();
    System.out.println("Hashtabelle:");
    for (Iterator<String> iterator = hashTable.iterator(); iterator.hasNext(); )
    {
      iterator.next();
      if (iterator.hasNext())
      {
        String next = iterator.next();
        if (next != null)
        {
          System.out.println(next);
        }
      }
    }
  }
}
