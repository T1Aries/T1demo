import java.util.ArrayList;
import java.util.ListIterator;

public class app19 {
  public static void main(String[] args) {
    ArrayList<Character> arr = new ArrayList<>();
    arr.add('a');
    arr.add('b');
    arr.add('c');
    arr.add('d');

    ListIterator<Character> lt = arr.listIterator();
    System.out.println("\nCac phan tu co trong arraylist la :");
    while (lt.hasNext()) {
      System.out.print(lt.next() + "\t");
    }
  }
}