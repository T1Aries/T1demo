import java.util.ArrayList;
import java.util.Scanner;

public class app22 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Nhap vao so phan tu cua mang : ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + " : ");
            num = sc.nextInt();
            a.add(num);
        }

        int max = a.get(0);
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i).compareTo(max) > 0) {
                max = a.get(i);
            }
        }

        System.out.print("Phan tu lon nhat trong mang la : " + max);
    }

}