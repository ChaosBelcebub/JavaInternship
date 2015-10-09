/**
* One sigle element of MyList
*
* @author Michael Kotzjan
* @version 1.0
*/
public class ListElement<T>
{
  private ListElement nextElement;
  private T value;

  public ListElement(T v)
  {
    nextElement = null;
    value = v;
  }

  public T getValue()
  {
    return value;
  }

  public void setNext(ListElement n)
  {
    this.nextElement = n;
  }

  public ListElement getNext()
  {
    return nextElement;
  }
}
