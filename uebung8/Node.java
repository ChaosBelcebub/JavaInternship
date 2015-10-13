/**
* Node of a Tree
*
* @author Michael Kotzjan
* @version 1.0
*/
public class Node
{
  private String value;
  private Node lNode, rNode;
  private int leafs;

  // Constructor
  public Node(String v)
  {
    value = v;
    lNode = null;
    rNode = null;
    leafs = 0;
  }

  // Return the value
  public String getValue()
  {
    return value;
  }

  // Add a new node or leave ordered by value
  public void add(Node n)
  {
    if (this.value.compareTo(n.getValue()) >= 0)
    {
      if (this.rNode == null)
      {
        this.rNode = n;
      }
      else
      {
        this.rNode.add(n);
      }
    }
    else
    {
      if (this.lNode == null)
      {
        this.lNode = n;
      }
      else
      {
        this.lNode.add(n);
      }
    }
  }

  // Count the leafs at the bottom of the tree
  public int countLeafs()
  {
    if (this.lNode == null && this.rNode == null)
    {
      return 1;
    }

    int lLeafs = 0;
    int rLeafs = 0;
    if (this.lNode != null)
    {
      lLeafs = lNode.countLeafs();
    }
    if (this.rNode != null)
    {
      rLeafs = rNode.countLeafs();
    }
    return lLeafs + rLeafs;
  }
}
