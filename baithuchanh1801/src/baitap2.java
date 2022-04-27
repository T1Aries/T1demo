import java.util.Scanner;

public class baitap2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a1, b1, c1;
        double a2, b2, c2;
        System.out.println("Nhap he so a1: ");
        a1 = sc.nextDouble();
        System.out.println("Nhap he so b1: ");
        b1 = sc.nextDouble();
        System.out.println("Nhap he so c1: ");
        c1 = sc.nextDouble();
        System.out.println("Nhap he so a2: ");
        a2 = sc.nextDouble();
        System.out.println("Nhap he so b2: ");
        b2 = sc.nextDouble();
        System.out.println("Nhap he so c2: ");
        c2 = sc.nextDouble();
        double Dx, Dy, D;
        double x, y;
        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - b1 * c2;
        Dy = a1 * c2 - a2 * c1;
        if (D == 0) {
            if (Dx == Dy) {
                System.out.printf("He phuong trinh co vo so nghiem.");
            } else {
                System.out.printf("He phuong trinh vo nghiem.");
            }
        } else {
            x = Dx / D;
            y = Dy / D;
            System.out.printf("He phuong trinh co nghiem x = %f, y = %f.", x, y);
        }

    }
}