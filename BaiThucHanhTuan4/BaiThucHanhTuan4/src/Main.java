import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bai Thuc Hanh Tuan 3");

        System.out.print("Nhap Ma Sach: ");
        String masach = sc.nextLine();

        System.out.print("Nhap Ten Sach: ");
        String TenSach = sc.nextLine();

        System.out.print("Nhap Tac Gia: ");
        String TacGia = sc.nextLine();

        System.out.println("Chon Loai Sach (1. Giao khoa, 2. Tham khao, 3. Chuyen nganh, 4. Khac): ");
        int loaiSach = sc.nextInt();

        System.out.print("Nhap nam xuat ban: ");
        int namXuatBan = sc.nextInt();

        System.out.print("Nhap Don Gia: ");
        double DonGia = sc.nextDouble();

        System.out.print("Nhap So Luong: ");
        int SoLuong = sc.nextInt();
        System.out.print("\n");

        if (DonGia <= 0 || SoLuong < 0 || namXuatBan >= 2026) {
            System.out.println("Du lieu khong hop le");
            return;
        }

        String phanLoaiGia;
        if (DonGia < 50000) {
            phanLoaiGia = "Sach gia thap";
        } else if (DonGia <= 100000) {
            phanLoaiGia = "Sach gia trung binh";
        } else if (DonGia <= 200000) {
            phanLoaiGia = "Sach gia cao";
        } else {
            phanLoaiGia = "Sach gia dac biet";
        }

        String phanLoaiTonKho;
        if (SoLuong == 0) {
            phanLoaiTonKho = "Het sach";
        } else if (SoLuong <= 5) {
            phanLoaiTonKho = "Sap het";
        } else if (SoLuong <= 20) {
            phanLoaiTonKho = "Con it";
        } else {
            phanLoaiTonKho = "Con nhieu";
        }

        String tenLoaiSach;
        switch (loaiSach) {
            case 1:
                tenLoaiSach = "Sach giao khoa";
                break;
            case 2:
                tenLoaiSach = "Sach tham khao";
                break;
            case 3:
                tenLoaiSach = "Sach chuyen nganh";
                break;
            case 4:
                tenLoaiSach = "Sach khac";
                break;
            default:
                tenLoaiSach = "Khong ro";
                break;
        }

        double ThanhTien = DonGia * SoLuong;
        double PhiVanChuyen = 0.05 * ThanhTien;
        double TongTienNhap = ThanhTien + PhiVanChuyen;

        System.out.println("\n");
        System.out.println("Ma Sach: " + masach);
        System.out.println("Ten Sach: " + TenSach);
        System.out.println("Tac Gia: " + TacGia);
        System.out.println("Nam Xuat Ban: " + namXuatBan);
        System.out.println("Phan Loai Sach: " + tenLoaiSach);
        System.out.println("Phan Loai Gia: " + phanLoaiGia);
        System.out.println("Tinh Trang Kho: " + phanLoaiTonKho);
        System.out.println("Don Gia: " + DonGia);
        System.out.println("So Luong: " + SoLuong);
        System.out.print("\n");
        System.out.println("Thanh Tien: " + ThanhTien);
        System.out.println("Phi Van Chuyen: " + PhiVanChuyen);
        System.out.println("Tong Tien Nhap: " + TongTienNhap);
    }
}