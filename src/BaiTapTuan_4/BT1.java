package BaiTapTuan_4;
import java.util.Scanner;

public class BT1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất: ");
        int a = scanner.nextInt();
        System.out.println("Nhập số thứ hai: ");
        int b = scanner.nextInt();
        
        int Tong = a + b; 
        System.out.println("Tổng = "+ Tong); 
        int Hieu = a - b; 
        System.out.println("Hiệu = " + Hieu);
        int Tich = a * b; 
        System.out.println("Tích = " + Tich);
        float Thuong = (float) a / b; 
        System.out.println("Thương = " + Thuong);
        int PhanDu = a % b; 
        System.out.println("Phần Dư = " + PhanDu);
         
        if (a > b) {
            System.out.println(a + " lớn hon " + b);
        } else if (a < b) {
            System.out.println(a + " nhỏ hon " + b);
        } else {
            System.out.println(a + " bằng " + b);
        }
    }
}