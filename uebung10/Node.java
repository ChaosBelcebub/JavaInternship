/**
* Node of a graph
*
* @author Michael Kotzjan
* @version 1.0
*/
public class Node
{
  private String name;
  private int weight;
  private Node last;

  public Node(String s)
  {
    name = s;
    weight = Integer.MAX_VALUE;
    last = null;
  }

  public String getName()
  {
    return name;
  }

  public void setWeight(int i)
  {
    weight = i;
  }

  public int getWeight()
  {
    return weight;
  }

  public void setLast(Node n)
  {
    last = n;
  }

  public Node getLast()
  {
    return last;
  }
}
