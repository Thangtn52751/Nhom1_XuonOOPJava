
package GiamDoc;

import java.util.Scanner;

public class MenuGiamDoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GiamDocChucNang tpcn = new GiamDocChucNang();
        while(true) {
            System.out.println("+================= Menu Giam Doc: =================+");
            System.out.println("1.Tuyen Nhan Vien Moi");
            System.out.println("2.Danh Sach Nhan Vien");
            System.out.println("3.Sa Thai Nhan Vien");
            System.out.println("4.Tinh Luong Nhan Vien");
            System.out.println("5.Tinh Thue Nhan Vien");
            System.out.println("6.Tim Kiem Nhan Vien Theo Ma");
            System.out.println("7.Sap xep nhan vien theo luong");
            System.out.println("8.Tinh Luong Thuong");
            System.out.println("9.Tinh luong trach nghiem");
            System.out.println("10.Top 3 nhan vien co muc luong cao nhat");
            System.out.println("0.Thoat Ung Dung");
            System.out.println("+================******************=================+");
            System.out.print("Xin Moi Sep Chon: ");
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch(choice) {
                   case 1:
        tpcn.tuyenNhanVien();
        break;
    case 2:
        tpcn.hienThiNhanVien();
        break;
    case 3:
        tpcn.saThaiNhanVien();
        break;
    case 4: 
        tpcn.tinhLuongNhanVien();
        break;
    case 5:
        tpcn.tinhThueNhanVien();
        break;
    case 6:
        tpcn.timKiemNhanVien();
        break;
    case 7:
        tpcn.SapxepNhanVienTheoLuong();
        break;
    case 8:
     
        tpcn.TinhLuongThuong(10); // 10% bonus
        break;
    case 9:
        tpcn.tinhLuongTrachNghiem(5); // 5% responsibility
        break;
    case 10:
        tpcn.top3NV();
        break;
                case 0:
                    System.out.println("Thoat Thanh Cong,Hen Gap Sep Lan Sau!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong Co Chuc Nang So "+choice + " xin moi sep chon lai!");
                    break;
            }
        }
    }
}
