package Nhanvien;

import java.util.ArrayList;

public class Nhanvien {
    int id;
    String name;
    String address;

    public Nhanvien(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void nhapthongtin(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("_________________");
    }
}