package quanlysinhvienjava;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<SinhVien> ds = new ArrayList<>();
        ds.add(new SinhVien("SV001", "Nguyễn Văn A", 8.5));
        ds.add(new SinhVien("SV002", "Trần Thị B", 7.8));
        ds.add(new SinhVien("SV003", "Lê Văn C", 9.0));

        System.out.println("=== DANH SÁCH SINH VIÊN ===");
        for (SinhVien sv : ds) {
            System.out.println(sv);
        }
    }
}