package PhoTruongPhong;




import PhoTruongPhong.MenuPhoTP;
import java.util.Scanner;

public class PhoTPChucNang {
 
    
    public static void main(String[] args) {
            MenuPhoTP phoTP = new MenuPhoTP();
           Scanner scanner = new Scanner(System.in);
           
        while(true) {
            System.out.println("+================= Menu Pho Truong Phong: =================+");
            System.out.println("1.Them Nhan Vien Vao Phong Ban");
            System.out.println("2.Tim Kiem Nhan Vien");
            System.out.println("3.Hien Thi Danh Sach Nhan Vien");
            System.out.println("4.Sap xep nhan vien");
            System.out.println("5.Hien Thi Theo Thu Nhap");
            System.out.println("6.Xoa Nhan Vien Ra Khoi Phong Ban");
            System.out.println("7.Hien Thi Theo Ten");
            System.out.println("8.Them Phong Ban");
            System.out.println("9.Hien Thi Tat Ca Phong Ban");
            System.out.println("10.Xoa Tat Ca Nhan Vien Ra Khoi Phong Ban");
            System.out.println("0.Thoat");
           System.out.println("+================******************=================+");
            System.out.print("Moi Pho Phong Chon: ");
            int choice = Integer.parseInt(scanner.nextLine());
            
            switch(choice) {
                     case 1:
                    phoTP.themNhanVien();
                    break;
                case 2:
                    phoTP.timKiemNhanVien();
                    break;
                case 3:
                    phoTP.hienThiDanhSachNhanVien();
                    break;
                case 4:
                    phoTP.sapXepNhanVien();
                    break;
                case 5:
                    phoTP.hienThiTheoThuNhap();
                    break;
                case 6:
                    phoTP.xoaNhanVienRaKhoiPhongBan();
                    break;
                case 7:
                    phoTP.hienThiTheoTen();
                    break;
                case 8:
                    phoTP.themPhongBanMoi();
                    break;
                case 9:
                    phoTP.hienThiTatCaPhongBan();
                    break;
                case 10:
                    phoTP.xoaTatCaNhanVien();
                    break;
                case 0:
                    System.out.println("Exiting!...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Khong co chuc nang so " +choice + " trong menu vui long chon lai!");
                    break;
            }
        }
    }
}
