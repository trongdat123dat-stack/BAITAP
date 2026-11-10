import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList<Sach> dsSach = new ArrayList<>();

        Sach Hoa = new Sach();
        Hoa.masach = "001";
        Hoa.tensach = "Ket cau nguyen tu";
        Hoa.tacgia = "Nguyen Van A";
        Hoa.namxuatban = 2020;
        Hoa.soluong = 5;

        Sach Ly = new Sach();
        Ly.masach = "002";
        Ly.tensach = "Vat ly dai cuong";
        Ly.tacgia = "Nguyen Van B";
        Ly.namxuatban = 2022;
        Ly.soluong = 10;

        dsSach.add(Hoa);
        dsSach.add(Ly);

        for (int i = 0; i < dsSach.size(); i++) {
            dsSach.get(i).inthongtinsach();
            System.out.println("----------------");
        }
    }
}