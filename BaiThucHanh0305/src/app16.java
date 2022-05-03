import java.util.ArrayList;

public class app16 {
        public static void main(String[] args) {
                ArrayList<String> arr = new ArrayList<>();
                arr.add("Phan tu 1");
                arr.add("Phan tu 2");
                arr.add("Phan tu 3");

                System.out.println("Cac phan tu co trong arraylist la :");
                for (int i = 0; i < arr.size(); i++) {
                        System.out.print(arr.get(i) + "\t");
                }

                arr.set(2, "Phan tu 5");
                System.out.println("\nCac phan tu co trong arraylist la :");
                for (int i = 0; i < arr.size(); i++) {
                        System.out.print(arr.get(i) + "\t");
                }
        }
}