import java.util.ArrayList;
import java.util.Scanner;

public class App112 {

    private static Object sinhvien(String ten) {
        return null;
    }

    public static void main(String[] args) {
        ArrayList<String> sinhvien = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String ten;
        float diem;
        System.out.println("");

        for (int i = 0; i < 10; i++) {
            System.out.println("Nhap vao sinh vien thu " + i + 1 + " : ");
            ten = scanner.nextLine();
            sinhvien.add(ten);
            if (sinhvien(ten) == null) {
                break;
            }
        }
        scanner.close();
    }

}