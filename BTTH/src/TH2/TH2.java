package TH2;

import java.util.Scanner;

public class TH2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã hs: ");
        int id = sc.nextInt();
        System.out.println("Nhập tên hs: ");
        String studentName = sc.next();
        System.out.println("Nhập giới tính hs: ");
        boolean sex = sc.nextBoolean();
        System.out.println("Nhập tên lớp hs: ");
        String nameClass = sc.next();
        System.out.println("Nhập tuối hs: ");
        int age = sc.nextInt();
        System.out.println("Nhập địa chỉ hs: ");
        String address = sc.next();
        Student student = new Student(id, studentName, sex, nameClass, age, address);
        System.out.println(student.display());
    }
}
