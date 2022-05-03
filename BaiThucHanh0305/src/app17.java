import java.util.ArrayList;

public class app17 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(7);
        arr.add(1);
        arr.add(9);

        System.out.println("\nCac phan tu co trong arraylist la :");
        for (int number : arr) {
            System.out.print(number + "\t");
        }
    }
}