/**
* Implementation of a binary tree
*
* @author Michael Kotzjan
* @version 1.0
*/

public class Tree
{
  private Node root;

  // Constructor
  public Tree()
  {
    root = null;
  }

  // Add a new node
  public void add(Node n)
  {
    if (root == null)
    {
      root = n;
    }
    else
    {
      Node destination = root;
      while (true)
      {
        if (destination.getValue().compareTo(n.getValue()) >= 0)
        {
          if (destination.getRightNode() == null)
          {
            destination.setRightNode(n);
            destination.setLeftNode(new Node(destination.getValue()));
            return;
          }
          destination = destination.getRightNode();
        }
        else
        {
          if (destination.getLeftNode() == null)
          {
            destination.setLeftNode(n);
            destination.setRightNode(new Node(destination.getValue()));
            return;
          }
          destination = destination.getLeftNode();
        }
      }
    }
  }

  // Private print recursive
  private void printTree(Node n)
  {
    if (n.getLeftNode() == null && n.getRightNode() == null)
    {
      System.out.println(n.getValue());
      return;
    }

    if (n.getRightNode() != null)
    {
      printTree(n.getRightNode());
    }
    if (n.getLeftNode() != null)
    {
      printTree(n.getLeftNode());
    }
  }

  // Print the tree
  public void print()
  {
    printTree(this.root);
  }
}
