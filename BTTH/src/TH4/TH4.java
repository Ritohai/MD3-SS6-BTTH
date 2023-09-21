package TH4;

import java.util.Scanner;

public class TH4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất");
        double a = sc.nextDouble();
        System.out.println("Nhập số thứ hai");
        double b = sc.nextDouble();
        Calculator calculator = new Calculator(a, b);
        System.out.println("Kq phép cộng là: "+calculator.add());
        System.out.println("Kq phép trừ là: "+calculator.sub());
        System.out.println("Kq phép nhân là: "+calculator.multi());
        System.out.println("Kq phép chia là: "+calculator.div());
    }
}
