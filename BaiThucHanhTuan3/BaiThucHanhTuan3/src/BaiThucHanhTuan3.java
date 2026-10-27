import java.util.Scanner;
public class BaiThucHanhTuan3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai Thưc Hanh Tuan 3");

        System.out.print("Nhap Ma Sach: ");
        String masach = sc.nextLine();

        System.out.print("Nhap Ten Sach: ");
        String TenSach = sc.nextLine();

        System.out.print("Nhap Tac Gia: ");
        String TacGia = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhap Don Gia: ");
        Double DonGia = sc.nextDouble();

        System.out.print("Nhap So Luong: ");
        int SoLuong = sc.nextInt();
        System.out.print("\n");

        Double ThanhTien = DonGia * SoLuong;

        Double PhiVanChuyen = 0.05 * ThanhTien;

        Double TongTienNhap = ThanhTien + PhiVanChuyen;

        System.out.println("Ma Sach: " + masach);
        System.out.println("TenSach: " + TenSach);
        System.out.println("TacGia: " + TacGia);
        System.out.println("NamXuatBan: " + namXuatBan);
        System.out.println("DonGia: " + DonGia);
        System.out.println("SoLuong: " + SoLuong);
        System.out.print("\n");
        System.out.println("ThanhTien: " + ThanhTien);
        System.out.println("PhiVanChuyen: " + PhiVanChuyen);
        System.out.println("TongTienNhap: " + TongTienNhap);
    }

}

