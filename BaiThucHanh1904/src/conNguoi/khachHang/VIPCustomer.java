package conNguoi.khachHang;
import java.util.Scanner;

public class VIPCustomer {
    String maKH, uuDai="tang voucher 1.000.000 d";
    Scanner sc=new Scanner(System.in);
    public void nhapMaKH(){
        System.out.println("ma khach hang VIP: ");
        maKH=sc.nextLine();
    }
}