import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int luaChonTong;

        do {
            System.out.println("\n================= MENU CHINH (NOP BAI) =================");
            System.out.println("1. Chay Bai 1 (Mang int[] so luong 5 cuon sach)");
            System.out.println("2. Chay Bai 2 (ArrayList<String> quan ly ma sach)");
            System.out.println("3. Chay Bai 3 & Bai 4 (Menu quan ly thu vien hoan chinh)");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Chon bai muon kiem tra (0-3): ");

            luaChonTong = sc.nextInt();
            sc.nextLine();

            switch (luaChonTong) {
                case 1:
                    chayBai1();
                    break;
                case 2:
                    chayBai2();
                    break;
                case 3:
                    chayBai3Va4();
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (luaChonTong != 0);
    }

    // BÀI 1: int[] soLuong (Nhập 5 cuốn, hiển thị, tính tổng, tìm max)
    public static void chayBai1() {
        System.out.println("\n--- DANG CHAY BAI 1: MANG int[] SO LUONG ---");
        int[] soLuong = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Nhap so luong cuon thu " + (i + 1) + ": ");
            soLuong[i] = sc.nextInt();
        }

        int tong = 0;
        int max = soLuong[0];

        System.out.print("Danh sach so luong: ");
        for (int sl : soLuong) {
            System.out.print(sl + " ");
            tong += sl;
            if (sl > max) {
                max = sl;
            }
        }

        System.out.println("\nTong so luong: " + tong);
        System.out.println("So luong lon nhat: " + max);
    }

    // BÀI 2: ArrayList<String> lưu mã sách (Thêm, hiển thị, tìm, xóa)
    public static void chayBai2() {
        System.out.println("\n--- DANG CHAY BAI 2: ArrayList<String> MA SACH ---");
        ArrayList<String> dsMa = new ArrayList<>();
        int chonB2;

        do {
            System.out.println("\n-- Menu con Bai 2 --");
            System.out.println("1. Them ma sach");
            System.out.println("2. Hien thi danh sach ma");
            System.out.println("3. Tim ma sach");
            System.out.println("4. Xoa ma sach");
            System.out.println("0. Quay lai Menu chinh");
            System.out.print("Chon: ");
            chonB2 = sc.nextInt();
            sc.nextLine();

            switch (chonB2) {
                case 1:
                    System.out.print("Nhap ma sach muon them: ");
                    String maThem = sc.nextLine();
                    dsMa.add(maThem);
                    System.out.println("-> Da them: " + maThem);
                    break;
                case 2:
                    System.out.println("Danh sach ma hien co: " + dsMa);
                    break;
                case 3:
                    System.out.print("Nhap ma can tim: ");
                    String maTim = sc.nextLine();
                    if (dsMa.contains(maTim)) {
                        System.out.println("-> Tim thay ma " + maTim + " trong danh sach.");
                    } else {
                        System.out.println("-> Khong ton tai ma: " + maTim);
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma can xoa: ");
                    String maXoa = sc.nextLine();
                    if (dsMa.remove(maXoa)) {
                        System.out.println("-> Da xoa thanh cong: " + maXoa);
                    } else {
                        System.out.println("-> Khong tim thay ma de xoa!");
                    }
                    break;
                case 0:
                    System.out.println("-> Quay ve Menu chinh.");
                    break;
                default:
                    System.out.println("Chon sai!");
            }
        } while (chonB2 != 0);
    }

    // BÀI 3 & 4: Menu hoàn chỉnh quản lý sách bằng ArrayList<String>
    public static void chayBai3Va4() {
        ArrayList<String> danhSachSach = new ArrayList<>();
        int luaChon;

        do {
            System.out.println("\n--- MENU BAI 4 (QUAN LY THU VIEN) ---");
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Xoa sach theo ma");
            System.out.println("5. Sua sach theo ma");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Quay lai Menu chinh");
            System.out.print("Nhap lua chon (1-8): ");

            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon) {
                case 1:
                    System.out.print("Nhap so luong sach can them: ");
                    int n = sc.nextInt();
                    sc.nextLine();

                    for (int i = 1; i <= n; i++) {
                        System.out.println("\n--- Nhap cuon thu " + i + " ---");
                        System.out.print("Nhap Ma Sach: ");
                        String maSach = sc.nextLine();
                        System.out.print("Nhap Ten Sach: ");
                        String tenSach = sc.nextLine();
                        System.out.print("Nhap Tac Gia: ");
                        String tacGia = sc.nextLine();
                        System.out.println("Chon Loai Sach: ");
                        int loaiSach = sc.nextInt();
                        System.out.print("Nhap nam xuat ban: ");
                        int namXuatBan = sc.nextInt();
                        System.out.print("Nhap Don Gia: ");
                        double donGia = sc.nextDouble();
                        System.out.print("Nhap So Luong: ");
                        int soLuong = sc.nextInt();
                        sc.nextLine();

                        String thongTin = maSach + "," + tenSach + "," + tacGia + "," + loaiSach + "," + namXuatBan + "," + donGia + "," + soLuong;
                        danhSachSach.add(thongTin);
                    }
                    System.out.println("-> Da them xong " + n + " cuon vao thu vien.");
                    break;

                case 2:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Danh sach trong!");
                    } else {
                        System.out.println("\n--- DANH SACH SACH ---");
                        for (String s : danhSachSach) {
                            String[] p = s.split(",");
                            System.out.println("Ma: " + p[0] + " | Ten: " + p[1] + " | TG: " + p[2]
                                    + " | Loai: " + p[3] + " | Nam: " + p[4]
                                    + " | Don Gia: " + p[5] + " | So Luong: " + p[6]);
                        }
                    }
                    break;

                case 3:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Thu vien chua co sach!");
                        break;
                    }
                    System.out.print("Nhap ma sach can tim: ");
                    String maTim = sc.nextLine();
                    boolean timThay = false;

                    for (String s : danhSachSach) {
                        String[] p = s.split(",");
                        if (p[0].equalsIgnoreCase(maTim)) {
                            System.out.println("-> Tim thay: Ma: " + p[0] + " | Ten: " + p[1]
                                    + " | Don Gia: " + p[5] + " | So Luong: " + p[6]);
                            timThay = true;
                            break;
                        }
                    }
                    if (!timThay) System.out.println("Khong tim thay ma: " + maTim);
                    break;

                case 4:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                        break;
                    }
                    System.out.print("Nhap ma sach can xoa: ");
                    String maXoa = sc.nextLine();
                    boolean daXoa = false;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] p = danhSachSach.get(i).split(",");
                        if (p[0].equalsIgnoreCase(maXoa)) {
                            danhSachSach.remove(i);
                            daXoa = true;
                            System.out.println("-> Da xoa sach co ma: " + maXoa);
                            break;
                        }
                    }
                    if (!daXoa) System.out.println("Khong tim thay ma de xoa!");
                    break;

                case 5:
                    if (danhSachSach.isEmpty()) {
                        System.out.println("Thu vien trong!");
                        break;
                    }
                    System.out.print("Nhap ma sach can sua: ");
                    String maSua = sc.nextLine();
                    int viTriSua = -1;

                    for (int i = 0; i < danhSachSach.size(); i++) {
                        String[] p = danhSachSach.get(i).split(",");
                        if (p[0].equalsIgnoreCase(maSua)) {
                            viTriSua = i;
                            break;
                        }
                    }

                    if (viTriSua != -1) {
                        System.out.println("-> Tim thay! Nhap lai thong tin:");
                        System.out.print("Ten moi: ");
                        String tenMoi = sc.nextLine();
                        System.out.print("Tac gia moi: ");
                        String tgMoi = sc.nextLine();
                        System.out.println("Loai moi: ");
                        int loaiMoi = sc.nextInt();
                        System.out.print("Nam XB moi: ");
                        int namMoi = sc.nextInt();
                        System.out.print("Don gia moi: ");
                        double giaMoi = sc.nextDouble();
                        System.out.print("So luong moi: ");
                        int slMoi = sc.nextInt();
                        sc.nextLine();

                        String sachMoi = maSua + "," + tenMoi + "," + tgMoi + "," + loaiMoi + "," + namMoi + "," + giaMoi + "," + slMoi;
                        danhSachSach.set(viTriSua, sachMoi);
                        System.out.println("-> Cap nhat thanh cong!");
                    } else {
                        System.out.println("Khong tim thay ma sach can sua!");
                    }
                    break;

                case 6:
                    int tongSL = 0;
                    for (String s : danhSachSach) {
                        String[] p = s.split(",");
                        tongSL += Integer.parseInt(p[6]);
                    }
                    System.out.println("-> Tong so luong sach: " + tongSL);
                    break;

                case 7:
                    double tongGia = 0;
                    for (String s : danhSachSach) {
                        String[] p = s.split(",");
                        tongGia += (Double.parseDouble(p[5]) * Integer.parseInt(p[6]));
                    }
                    System.out.println("-> Tong gia tri kho sach: " + tongGia);
                    break;

                case 8:
                    System.out.println("Quay lai Menu Tong.");
                    break;

                default:
                    System.out.println("Chon sai!");
            }
        } while (luaChon != 8);
    }
}