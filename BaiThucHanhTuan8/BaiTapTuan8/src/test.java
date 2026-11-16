import java.util.ArrayList;

public class test {
    public static void main(String[] args) {

        ArrayList<Sach> dsSach = new ArrayList<>();

        // Khởi tạo đối tượng bằng Constructor đầy đủ tham số
        Sach Hoa = new Sach("001", "Ket cau nguyen tu", "Nguyen Van A", 2020, 5);
        Sach Ly = new Sach("002", "Vat ly dai cuong", "Nguyen Van B", 2022, 10);

        dsSach.add(Hoa);
        dsSach.add(Ly);

        // Duyệt danh sách và in
        for (int i = 0; i < dsSach.size(); i++) {
            dsSach.get(i).inthongtinsach();
            System.out.println("----------------");
        }
    }
}