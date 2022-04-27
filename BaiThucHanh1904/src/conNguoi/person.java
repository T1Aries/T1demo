package conNguoi;
import java.util.Scanner;

public class person {
    String ten;
    int tuoi;
    Scanner sc = new Scanner(System.in);
    public void nhapTen(){
        System.out.print("Nhap ten cua ban: ");
        ten=sc.nextLine();
    }

    public void inTen(){
        System.out.println("ten: " + ten);
        
    }

    public void nhapTuoi(){
        System.out.print("Nhap tuoi cua ban: ");
        tuoi=sc.nextInt();
    }

    public void inTuoi(){
        System.out.println("tuoi: " + tuoi);
        
    }
    
}