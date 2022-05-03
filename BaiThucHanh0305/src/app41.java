import java.util.Scanner;
import java.util.LinkedList;

public class app41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> link = new LinkedList<>();
        link.add("Thang 1");
        link.add("Thang 2");
        link.add("Thang 3");
        link.add("Thang 4");
        link.add("Thang 5");
        link.add("Thang 6");
        link.add("Thang 7");
        link.add("Thang 8");
        link.add("Thang 9");
        link.add("Thang 10");
        link.add("Thang 11");
        link.add("Thang 12");

        System.out.println("Nhap vao so phan tu can lay :");
        int n = sc.nextInt();
        if (n < 0 || (n > link.size() - 1)) {
            System.out.print("Chi so can lay can lon hon 0 va nho hon " + (link.size() - 1));
        } else {
            String node = link.get(n);
            System.out.print("Phan tu co chi so : " + n + "trong list la :" + node);
        }

        String firstnode = link.getFirst();
        String lastnode = link.getLast();
        System.out.print("\nPhan tu dau tien trong danh sach la : " + firstnode + ", Phan tu cuoi trong danh sach la : "
                + lastnode);
    }

}