import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        float a, b, c, delta, x1, x2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a (a # 0): ");
        a = scanner.nextInt();
        System.out.print("Nhap b: ");
        b = scanner.nextInt();
        System.out.print("Nhap c: ");
        c = scanner.nextInt();
        System.out.println("phuong trinh bac 2 co dang: " + a + "x^2 + " + b + "x + " + c + " = 0");
        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh vo nghiem!");
            } else {
                System.out.println("phuong trinh co 1 nghiem: " + "x = " + (-c / b));
            }
            return;
        }
        delta = (float) (Math.pow(b, 2) - 4 * a * c);
        if (delta < 0) {
            System.out.println("Phuong Trinh Vo Nghiem!");
        } else if (delta == 0) {
            x1 = -b / (2 * a);
            System.out.println("phuong trinh co nghiem kep" + x1);
        } else {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh co 2 nghiem x1 = " + x1 + " và x2 = " + x2);
        }
    }
}
