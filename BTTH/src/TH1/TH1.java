package TH1;

import java.util.Scanner;

public class TH1 {


    public static void main(String[] args) {
        System.out.println("Nhập vào chiều dài cạnh hình chữ nhật: ");
        int width = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào chiều rộng cạnh hình chữ nhật: ");
        int height = new Scanner(System.in).nextInt();
        Rectangle r = new Rectangle(width, height);
        System.out.println(r.display());
        System.out.println(r.getArea());;
        System.out.println(r.getPerimeter());

    }
}
