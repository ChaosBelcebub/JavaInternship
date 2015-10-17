import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyIterator<E> implements Iterator<E> {

  private int position = -1;
  private E[] arr = null;

  public void setData(E[] elements) {
    this.arr = elements;
  }

  public boolean hasNext() {
    return this.position + 1 < this.arr.length;
  }

  public E next() throws NoSuchElementException {

    if (!hasNext()) {
      throw new NoSuchElementException("No more elements");
    }
    return this.arr[++this.position];
  }

  public void remove() throws UnsupportedOperationException {
    throw new UnsupportedOperationException("Operation is not supported");
  }
}
