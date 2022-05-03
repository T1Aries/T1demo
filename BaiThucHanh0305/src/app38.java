import java.util.LinkedList;

public class app38 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("java");
        ll.add("C++");
        ll.add("C#");
        ll.add("PHP");

        LinkedList<String> listA = new LinkedList<String>();
        listA.addAll(ll);
        System.out.print("List A :");
        showList(listA);
        LinkedList<String> listB = new LinkedList<String>();
        listB.add("Java");
        listA.retainAll(listB);
        showList(listA);
        ll.removeAll(listB);

        System.out.print("List :");
        showList(ll);
    }

    public static void showList(LinkedList<String> list) {
        for (String obj : list) {
            System.out.print("\t" + obj + ",");
        }
        System.out.println();
    }
}