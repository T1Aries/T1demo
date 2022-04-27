package conNguoi.khachHang;

import java.util.Scanner;

import conNguoi.person;

public class customer extends person{
    String diaChi;
    Scanner sc=new Scanner(System.in);
    public void nhapDC(){
        System.out.println("dia chi khach hang:");
        diaChi=sc.nextLine();
    }
}