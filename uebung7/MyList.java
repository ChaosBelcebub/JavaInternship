/**
* Implementation of a List
*
* @author Michael Kotzjan
* @version 1.0
*/
public class MyList<T>
{
  private ListElement<T> first;
  private ListElement<T> last;
  private int size;

  public MyList()
  {
    first = null;
    last = null;
    size = 0;
  }

  // Add an element at the end
  public void add(T x)
  {
    ListElement<T> element = new ListElement<T>(x);
    if (this.size == 0)
    {
      this.first = element;
      this.last = element;
    }
    else
    {
      this.last.setNext(element);
      this.last = element;
    }
    ++size;
  }

  // Return the size
  public int size()
  {
    return size;
  }

  // Return the value at index
  public T get(int index)
  {
    ListElement<T> element = this.first;
    for (int i = 0; i < index; ++i) {
      element = element.getNext();
      if (element == null)
      {
        System.out.println("Index out of Range!");
        return null;
      }
    }
    return element.getValue();
  }

  // Remove the element at index and return the element
  public T remove(int index)
  {
    ListElement<T> element = this.first;
    ListElement<T> prev = null;
    ListElement<T> next = null;
    for (int i = 0; i < index - 1; ++i) {
      element = element.getNext();
      if (element == null)
      {
        System.out.println("Index out of Range!");
        return null;
      }
    }

    if (index > 0)
    {
      prev = element;
      element = element.getNext();
    }
    next = element.getNext();

    prev.setNext(next);
    --size;
    return element.getValue();
  }
}
