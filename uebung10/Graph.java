/**
* A Graph
*
* @author Michael Kotzjan
* @version 1.0
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Graph
{
  private Map<String, Node> nodes;
  private List<Edge> edges;
  private Map<String, Node> settledNodes;
  private Map<String, Node> unsettledNodes;
  private Map<Node, Node> predecessors;

  public Graph()
  {
    nodes = new HashMap<String, Node>();
    edges = new ArrayList<Edge>();
  }

  public void insertEdges(String source, String destination, int weight)
  {
    if (!nodes.containsKey(source))
    {
      nodes.put(source, new Node(source));
    }
    if (!nodes.containsKey(destination))
    {
      nodes.put(destination, new Node(destination));
    }

    edges.add(new Edge(nodes.get(source), nodes.get(destination), weight));
    edges.add(new Edge(nodes.get(destination), nodes.get(source), weight));
  }

  public Set<String> getNodes()
  {
    Set<String> keys = nodes.keySet();
    return keys;
  }

  public void dijkstra(String s, Map<String, Integer> result)
  {
    // Set's for the Nodes that was already processed and doesn't
    settledNodes = new HashMap<String, Node>();
    unsettledNodes = new HashMap<String, Node>(nodes);

    nodes.get(s).setWeight(0);
    nodes.get(s).setLast(nodes.get(s));

    // While there are still nodes to process...
    while (unsettledNodes.size() > 0)
    {
      Node smallestNode = findSmallestNode();
      settledNodes.put(smallestNode.getName(), smallestNode);
      unsettledNodes.remove(smallestNode.getName());
      for (Edge e : getNeighbors(smallestNode))
      {
        int i = smallestNode.getWeight() + e.getWeight();
        if (i < e.getDestination().getWeight())
        {
          e.getDestination().setWeight(i);
          e.getDestination().setLast(smallestNode);
        }
      }
    }

    // Result
    for (Map.Entry<String, Node> entry : settledNodes.entrySet())
    {
      result.put(entry.getKey(), entry.getValue().getWeight());
    }
  }

  private Node findSmallestNode()
  {
    Node result = null;
    for (Node n : unsettledNodes.values())
    {
      if (result == null)
      {
        result = n;
      }
      else
      {
        if (n.getWeight() < result.getWeight())
        {
          result = n;
        }
      }
    }
    return result;
  }

  // Return the unprocessed Neighbors as edges
  private Set<Edge> getNeighbors(Node n)
  {
    Set<Edge> result = new HashSet<Edge>();
    for (Edge e : edges)
    {
      if (e.getSource().getName() == n.getName()
          && unsettledNodes.containsKey(e.getDestination().getName()))
      {
        result.add(e);
      }
    }
    return result;
  }
}
