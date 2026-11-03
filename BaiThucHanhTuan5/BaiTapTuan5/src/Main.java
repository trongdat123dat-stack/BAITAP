import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int luaChon;

        int tongSoLuong = 0;
        double tongGiaTri = 0;

        String maSachCuoi = "";
        String tenSachCuoi = "";
        String tacGiaCuoi = "";
        double donGiaCuoi = 0;
        int soLuongCuoi = 0;
        boolean daNhap = false;

        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1. Nhap n sach bang vong lap (Bai 1)");
            System.out.println("2. Tinh tong so luong va gia tri (Bai 2)");
            System.out.println("3. Tim sach theo ma (Bai 4)");
            System.out.println("0. Thoat (Bai 3)");
            System.out.print("Moi ban chon: ");

            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so luong sach n = ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    tongSoLuong = 0;
                    tongGiaTri = 0;

                    for (int i = 1; i <= n; i++) {
                        System.out.println("\n--- Nhap cuon sach thu " + i + " ---");
                        System.out.print("Nhap Ma Sach: ");
                        String maSach = sc.nextLine();

                        System.out.print("Nhap Ten Sach: ");
                        String tenSach = sc.nextLine();

                        System.out.print("Nhap Tac Gia: ");
                        String tacGia = sc.nextLine();

                        System.out.println("Chon Loai Sach (1. Giao khoa, 2. Tham khao, 3. Chuyen nganh, 4. Khac): ");
                        int loaiSach = sc.nextInt();

                        System.out.print("Nhap nam xuat ban: ");
                        int namXuatBan = sc.nextInt();

                        System.out.print("Nhap Don Gia: ");
                        double donGia = sc.nextDouble();

                        System.out.print("Nhap So Luong: ");
                        int soLuong = sc.nextInt();
                        sc.nextLine();

                        tongSoLuong += soLuong;
                        tongGiaTri += (donGia * soLuong);

                        maSachCuoi = maSach;
                        tenSachCuoi = tenSach;
                        tacGiaCuoi = tacGia;
                        donGiaCuoi = donGia;
                        soLuongCuoi = soLuong;
                    }

                    daNhap = true;
                    System.out.println("-> Da nhap xong " + n + " cuon sach.");
                    break;

                case 2:
                    if (!daNhap) {
                        System.out.println("Chua nhap du lieu! Vui long chon 1 de nhap sach.");
                    } else {
                        System.out.println("\n--- TONG HOP THU VIEN ---");
                        System.out.println("Tong so luong tat ca cac sach: " + tongSoLuong);
                        System.out.println("Tong gia tri cua toan bo sach: " + tongGiaTri);
                    }
                    break;

                case 3:
                    if (!daNhap) {
                        System.out.println("Chua co cuon sach nao trong he thong de tim!");
                        break;
                    }

                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();

                    if (maTim.equalsIgnoreCase(maSachCuoi)) {
                        System.out.println("-> Da tim thay cuon sach (Day la cuon cuoi cung vua nhap):");
                        System.out.println("Ma: " + maSachCuoi + " | Ten: " + tenSachCuoi
                                + " | Tac gia: " + tacGiaCuoi + " | Don gia: " + donGiaCuoi
                                + " | So luong: " + soLuongCuoi);
                    } else {
                        System.out.println("Khong tim thay sach co ma: " + maTim);
                    }
                    break;

                case 0:
                    System.out.println("Thoat chuong trinh.");
                    break;

                default:
                    System.out.println("Chon sai, vui long chon lai!");
            }
        } while (luaChon != 0);
    }
}