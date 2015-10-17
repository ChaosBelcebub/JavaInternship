/**
* A Hashmap implementation
*
* @author Michael Kotzjan
* @version 1.0
*/

import java.util.Iterator;

public class HashTable implements Iterable<String>
{
  private String[] hashmap;
  private int position = -1;
  
  // Static size of hashmap
  private static int size = 64;

  public HashTable()
  {
    hashmap = new String[size];
  }

  // Add a string
  public void put(String s)
  {
    int hash = s.hashCode();
    if (hash < 0)
    {
      hash *= -1;
    }
    int pos = hash % size;
    hashmap[pos] = s;
  }

  // Get index
  public String get(int i)
  {
    return hashmap[i];
  }

  // Return the map to iterate over with foreach
  public String[] get()
  {
    return hashmap;
  }

  // Iterator
  public Iterator<String> iterator()
  {
    MyIterator<String> iter = new MyIterator<String>();
    iter.setData(this.hashmap);
    return iter;
  }
}
