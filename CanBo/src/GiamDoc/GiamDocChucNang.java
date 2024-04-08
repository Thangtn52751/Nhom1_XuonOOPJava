package GiamDoc;

import canbo.CanBo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class GiamDocChucNang {
    ArrayList<CanBo> danhSachNhanVien = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    public void tuyenNhanVien() {
        CanBo canbo = new CanBo();       
        canbo.nhap();
        danhSachNhanVien.add(canbo);
    }
    
    public void hienThiNhanVien() {
        if (danhSachNhanVien.isEmpty()) {
            System.out.println("Danh Sach Nhan Vien Trong");
            return;
        }
        for (CanBo canBo : danhSachNhanVien) {
            canBo.xuat();
        }
    }
    
    public void saThaiNhanVien() {
        System.out.print("Nhap Ma Nhan Vien Can Sa Thai");
        int maCanBo = scanner.nextInt();
        boolean found = false;
        for (CanBo canBo : danhSachNhanVien) {
            if (canBo.getMaCB() == maCanBo) {
                danhSachNhanVien.remove(canBo);
                found = true;
                System.out.println("Da Sa Thai Nhan Vien Co Ma: " + maCanBo);
                break;
            }
        }
        if (!found) {
            System.out.println("Khong Tim Thay Nhan Vien Co Ma: " + maCanBo);
        }
    }
    
    public void tinhLuongNhanVien() {
        System.out.println("Danh Sach Luong Thuong Cua NV:");
        for (CanBo canBo : danhSachNhanVien) {
            System.out.println("Ma: " + canBo.getMaCB() + ", Luong: " + canBo.getLuong());
        }
    }
    
    public void tinhThueNhanVien() {
        System.out.println("Danh sach thue cua nhan vien:");
        for (CanBo canBo : danhSachNhanVien) {
            System.out.println("Ma: " + canBo.getMaCB() + ", Thue: " + canBo.getThuetn());
        }
    }
    
     public void timKiemNhanVien() {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ma nhan vien can tim kiem: ");
    int maNhanVien = scanner.nextInt();
    boolean found = false;
    
    for (CanBo canBo : danhSachNhanVien) {
        if (canBo.getMaCB() == maNhanVien) {
            found = true;
            System.out.println("Thong tin nhan vien:");
            canBo.xuat();
            break;
        }
    }
    
    if (!found) {
        System.out.println("Khong tim thay nhan vien co ma: " + maNhanVien);
    }
}

    public void SapxepNhanVienTheoLuong() {
        Collections.sort(danhSachNhanVien, Comparator.comparingDouble(CanBo::getLuong));
    }

    public void TinhLuongThuong(double phanTramThuong) {
        for (CanBo canBo : danhSachNhanVien) {
            double luongThuong = canBo.getLuong() * phanTramThuong / 100;
            canBo.setLuong(canBo.getLuong() + luongThuong);
        }
    }

    public void tinhLuongTrachNghiem(double phanTramTrachNghiem) {
        for (CanBo canBo : danhSachNhanVien) {
            double luongTrachNghiem = canBo.getLuong() * phanTramTrachNghiem / 100;
            canBo.setLuong(canBo.getLuong() - luongTrachNghiem);
        }
    }

    public void top3NV() {
        if (danhSachNhanVien.size() < 3) {
            System.out.println("Danh sach nhan vien it hon 3 nguoi.");
            return;
        }
        // Sort danhSachNhanVien by salary in descending order
        Collections.sort(danhSachNhanVien, Comparator.comparingDouble(CanBo::getLuong).reversed());
        // Display top 3 employees
        System.out.println("Top 3 nhan vien co luong cao nhat:");
        for (int i = 0; i < 3; i++) {
            CanBo canBo = danhSachNhanVien.get(i);
            System.out.println("Ma: " + canBo.getMaCB() + ", Luong: " + canBo.getLuong());
        }
    }

}
