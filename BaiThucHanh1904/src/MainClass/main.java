package MainClass;

import conNguoi.khachHang.customer;
import conNguoi.khachHang.VIPCustomer;
import conNguoi.nhanVien.employee;
import conNguoi.nhanVien.fullTimeEmployee;
import conNguoi.nhanVien.partTimeEmployee;
import conNguoi.sinhVien.offLineStudent;
import conNguoi.sinhVien.onLineStudent;
import conNguoi.sinhVien.student;
import conNguoi.person;

public class main {
    public static void main(String[] args) {
        // person
        person ps1 = new person();
        ps1.nhapTen();
        ps1.nhapTuoi();

        // khach hang
        customer kh1 = new customer();
        kh1.nhapDC();

        VIPCustomer kh2 = new VIPCustomer();
        kh2.nhapMaKH();

        // nhan vien
        employee nv = new employee();
        nv.nhapMaNV();
        nv.nhapLuong();

        fullTimeEmployee nv1 = new fullTimeEmployee();
        nv1.gioiTinh();

        partTimeEmployee nv2 = new partTimeEmployee();
        nv2.luongNV();

        // sinh vien
        student sv = new student();
        sv.nhapTen();
        sv.nhapMSSV();
        sv.nhapTenLop();

        offLineStudent sv1 = new offLineStudent();
        sv1.hocOff();

        onLineStudent sv2 = new onLineStudent();
        sv2.hocOnL();

    }
}