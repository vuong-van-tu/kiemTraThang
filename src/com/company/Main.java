package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tháng muốn tìm : ");
        int month = scanner.nextInt();
        switch (month){
            case 2:
                System.out.print("Tháng '2' có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.print("Tháng "+month+" có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.print("Tháng "+month+" có 30 ngày");
                break;
            default:
                System.out.print("Tháng không hợp lệ");
                break;
        }
    }
}
