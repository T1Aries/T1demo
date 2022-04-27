package conNguoi.nhanVien;

import java.util.Scanner;

public class fullTimeEmployee extends employee {
    
    String diaChi;
    Scanner sc= new Scanner(System.in);

    public void nhapDC(){
        System.out.println("nhap dia chi cua ban: ");
        diaChi=sc.nextLine();
    }

    public void inDC(){
        System.out.println("d/c: "+diaChi);
    }

}