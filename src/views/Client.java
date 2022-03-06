package views;

import controllers.EmployeeManagement;
import models.Employee;

import java.util.LinkedList;
import java.util.Scanner;

public class Client {


    public static void main(String[] args) {
        final int MENU_CHOICE = -1;
        int choice = MENU_CHOICE;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Hiển thị danh sách nhân viên");
            System.out.println("2. Thêm nhân viên Full-time");
            System.out.println("3. Thêm nhân viên Part-time");
            System.out.println("4. Sửa thông tin nhân viên");
            System.out.println("5. Hiển thị danh sách nhân viên full-time với mức lương thấp hơn mức trung bình");
            System.out.println("6. Tổng số tiền trả lương cho nhân viên part-time");
            System.out.println("0. Exit");

            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1: //  Hiển thị danh sách nhân viên
                    break;
                case 2: //  Thêm nhân viên Full-time
                    break;
                case 3: //  Thêm nhân viên Part-time
                    break;
                case 4: //  Sửa thông tin nhân viên
                    break;
                case 5: //  Hiển thị danh sách nhân viên full-time với mức lương thấp hơn mức trung bình
                    break;
                case 6: //  Tổng số tiền trả lương cho nhân viên part-time
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
