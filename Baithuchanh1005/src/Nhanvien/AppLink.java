package Nhanvien;

import java.util.LinkedList;

public class AppLink {
    public static void main(String[] args) {
        LinkedList<Nhanvien> nv = new LinkedList<>();

        Nhanvien nv1 = new Nhanvien(1, "Tung Duong", "Tuyen Quang");
        Nhanvien nv2 = new Nhanvien(2, "Minh Thu", "Ben Tre");
        Nhanvien nv3 = new Nhanvien(3, "Thanh Do", "Cao Bang");
        Nhanvien nv4 = new Nhanvien(4, "Phuoc Khoa", "Cao Lanh");
        nv.add(nv1);
        nv.add(nv2);
        nv.add(nv3);
        nv.remove(nv3);
        nv.set(3, nv4);
        showList(nv);
    }

    private static void showList(LinkedList<Nhanvien> nv) {
    }
}
