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

  // Return the left node
  public Node getLeftNode()
  {
    return lNode;
  }

  // Set the left node
  public void setLeftNode(Node n)
  {
    lNode = n;
  }

  // Return the right node
  public Node getRightNode()
  {
    return rNode;
  }

  // Set the right node
  public void setRightNode(Node n)
  {
    rNode = n;
  }

  // Return the amount of leafs
  public int getLeafs()
  {
    return leafs;
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
    this.leafs = lLeafs + rLeafs;
    return leafs;
  }
}
