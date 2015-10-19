/**
* Implementation of a binary tree
*
* @author Michael Kotzjan
* @version 1.0
*/

public class Tree
{
  private Root root;

  // Constructor
  public Tree()
  {
    root = new Root();
  }

  // Add a new node
  public void add(Node n)
  {
    if (root.head == null)
    {
      root.head = n;
    }
    else
    {
      Node destination = root.head;
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
    printTree(this.root.head);
  }

  private void rebalanceTree(Node n)
  {
    Node right = n.getRightNode();
    Node left = n.getLeftNode();

    if (left != null)
    {
      // Check if the node is a leaf
      if (left.getLeftNode() != null && left.getRightNode() != null)
      {
        rebalanceTree(left);
      }
    }
    else
    {
      return;
    }

    if (right != null)
    {
      // Check if the node is a leaf
      if (right.getLeftNode() != null && right.getRightNode() != null)
      {
        rebalanceTree(right);
      }
    }
    else
    {
      return;
    }

    if (left.getLeftNode() != null && left.getRightNode() != null)
    {
      rotateLeftNode(n);
    }
    if (right.getLeftNode() != null && right.getRightNode() != null)
    {
      rotateRightNode(n);
    }
  }

  // Rebalance the tree
  public void rebalance()
  {
    this.root.head.countLeafs();
    rebalanceTree(this.root.head);
  }

  // Get balance
  private double rho(Node n)
  {
    double left = n.getLeftNode().getLeafs();
    double right = n.getRightNode().getLeafs();
    return ( left / (left + right) );
  }

  // Rotate
  private void rotateLeftNode(Node n)
  {
    Node left = n.getLeftNode();
    double b = rho(left);
    if (b < 0.333)
    {
      Node x = left.getLeftNode();
      Node y = left.getRightNode();
      n.setLeftNode(y);
      add(x);
      System.out.println("Rotated left");
    }
    else if (b > 0.666)
    {
      Node x = left.getLeftNode();
      Node y = left.getRightNode();
      n.setLeftNode(x);
      add(y);
      System.out.println("Rotated right");
    }
  }

  private void rotateRightNode(Node n)
  {
    Node right = n.getRightNode();
    double b = rho(right);
    if (b < 0.333)
    {
      Node x = right.getLeftNode();
      Node y = right.getRightNode();
      n.setLeftNode(y);
      add(x);
      System.out.println("Rotated left");
    }
    else if (b > 0.666)
    {
      //Node x = right.getLeftNode();
      //Node y = right.getRightNode();
      //n.setLeftNode(x);
      //add(y);
      //System.out.println("Rotated right");
      System.out.println("Error");
      System.out.println(right.getValue());
      System.out.println(right.getLeftNode().getValue());
      System.out.println(right.getRightNode().getValue());
    }
  }
}
