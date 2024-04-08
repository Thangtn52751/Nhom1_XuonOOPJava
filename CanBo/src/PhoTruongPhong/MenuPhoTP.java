package PhoTruongPhong;


import canbo.PhongBan;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import canbo.CanBo;
import java.util.Iterator;

public class MenuPhoTP {

    ArrayList<CanBo> danhSachNhanVien = new ArrayList<>();
    ArrayList<PhongBan> danhSachPhongBan = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void themNhanVien() {
        CanBo canBo = new CanBo();
        canBo.nhap();
        danhSachNhanVien.add(canBo);
    }

    public void timKiemNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien trong!");
            return;
        }

        System.out.println("Nhap ma nhan vien can tim: ");
        String input = scanner.nextLine();
        boolean found = false;

        for (CanBo canBo : danhSachNhanVien) {
            if (String.valueOf(canBo.getMaCB()).equals(input) || canBo.getHoTen().equalsIgnoreCase(input)) {
                System.out.println("Da tim thay nhan vien:");
                canBo.xuat();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Khong tim thay nhan vien!");
        }
    }

    public void hienThiDanhSachNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien trong!");
            return;
        }
        for (CanBo canBo : danhSachNhanVien) {
            canBo.xuat();
        }
    }

    public void sapXepNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh sach nhan vien trong!");
            return;
        }

        // Sắp xếp nhân viên theo mã nhân viên
        danhSachNhanVien.sort(Comparator.comparingInt(CanBo::getMaCB));

        System.out.println("Danh sach nhan vien sau khi duoc sap xep:");
        for (CanBo canBo : danhSachNhanVien) {
            canBo.xuat();
        }
    }

    public void hienThiTheoThuNhap() {
        // TODO: Triển khai chức năng hiển thị theo thu nhập của nhân viên
    }

    public void xoaNhanVienRaKhoiPhongBan() {
        System.out.print("Nhap ma nhan vien can xoa ra khoi phong ban: ");
        int maNhanVien = Integer.parseInt(scanner.nextLine());
        Iterator<CanBo> iterator = danhSachNhanVien.iterator();
        while (iterator.hasNext()) {
            CanBo canBo = iterator.next();
            if (canBo.getMaCB() == maNhanVien) {
                iterator.remove();
                System.out.println("Da xoa nhan vien co ma: " + maNhanVien + " ra khoi phong ban.");
                return;
            }
        }
        System.out.println("Khong tim thay nhan vien co ma " + maNhanVien + " trong phong ban.");
    }

    public void hienThiTheoTen() {
        System.out.print("Nhap ten nhan vien can hien thi: ");
        String tenNhanVien = scanner.nextLine();
        System.out.println("Danh sach nhan vien co ten " + tenNhanVien + ":");
        boolean found = false;
        for (CanBo canBo : danhSachNhanVien) {
            if (canBo.getHoTen().equalsIgnoreCase(tenNhanVien)) {
                canBo.xuat();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay nhan vien da nhap");
        }
    }

    public void themPhongBanMoi() {
        System.out.print("Nhap ten phong ban moi: ");
        String tenPhongBan = scanner.nextLine();
        danhSachPhongBan.add(new PhongBan(0, tenPhongBan)); // Mã phòng ban được đặt tạm thời là 0
        System.out.println("Da them phong ban " + tenPhongBan);
    }

    public void hienThiTatCaPhongBan() {
        if (danhSachPhongBan.isEmpty()) {
            System.out.println("Danh sach phong ban trong!");
            return;
        }
        System.out.println("Danh sach phong ban:");
        for (PhongBan phongBan : danhSachPhongBan) {
            System.out.println(phongBan.getTenPhongBan());
        }
    }

    public void xoaTatCaNhanVien() {
        danhSachNhanVien.clear();
        System.out.println("Da xoa tat ca nhan vien ra khoi phong ban.");
    }
}
