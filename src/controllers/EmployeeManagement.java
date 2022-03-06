package controllers;

import models.Employee;
import models.FullTimeEmployee;
import models.PartTimeEmployee;

import java.util.LinkedList;
import java.util.Scanner;

public class EmployeeManagement {
    public static LinkedList<Employee> employeesList;

    //  Hiển thị danh sách nhân viên
    public static void displayEmployeeInfo(LinkedList<Employee> employeesListClient) {
        for (Employee i : employeesListClient
        ) {
            String information = i.toString();
            System.out.println(information);
        }
    }

    //  Thiết lập thông tin nhân viên full-time
    public static Employee setNewFullTimeStaff() {
        System.out.println("Information of a new staff (ID, name, age):");
        Scanner inputId = new Scanner(System.in);
        String ID = inputId.nextLine();
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        Scanner inputAge = new Scanner(System.in);
        int age = inputAge.nextInt();

        System.out.println("Contact information of the new staff (phone, email):");
        Scanner inputPhoneNumber = new Scanner(System.in);
        int phoneNumber = inputPhoneNumber.nextInt();
        Scanner inputEmail = new Scanner(System.in);
        String email = inputEmail.nextLine();

        System.out.println("Salary of the new staff (bonus, fine, base):");
        Scanner inputBonus = new Scanner(System.in);
        double bonus = inputBonus.nextDouble();
        Scanner inputFine = new Scanner(System.in);
        double fine = inputFine.nextDouble();
        Scanner inputBaseWage = new Scanner(System.in);
        double baseWage = inputBaseWage.nextDouble();

        Employee newFullTimeStaff = new FullTimeEmployee(ID, name, age, phoneNumber, email, bonus, fine, baseWage);
        return newFullTimeStaff;
    }

    //  Thiết lập thông tin nhân viên part-time
    public static Employee setNewPartTimeStaff() {
        System.out.println("Information of a new staff (ID, name, age):");
        Scanner inputId = new Scanner(System.in);
        String ID = inputId.nextLine();
        Scanner inputName = new Scanner(System.in);
        String name = inputName.nextLine();
        Scanner inputAge = new Scanner(System.in);
        int age = inputAge.nextInt();

        System.out.println("Contact information of the new staff (phone, email):");
        Scanner inputPhoneNumber = new Scanner(System.in);
        int phoneNumber = inputPhoneNumber.nextInt();
        Scanner inputEmail = new Scanner(System.in);
        String email = inputEmail.nextLine();

        System.out.println("Work-times of the new staff:");
        Scanner inputWorkHours = new Scanner(System.in);
        double workHours = inputWorkHours.nextDouble();

        Employee newPartTimeStaff = new PartTimeEmployee(ID, name, age, phoneNumber, email, workHours);
        return newPartTimeStaff;
    }

    //  Thêm mới nhân viên Full-time
    public static void addNewFullTimeStaff(LinkedList<Employee> employeesListClient) {
        Employee newFullTimeStaff = setNewFullTimeStaff();
        employeesListClient.add(newFullTimeStaff);
    }

    //  Thêm mới nhân viên Part-time
    public static void addNewPartTimeStaff(LinkedList<Employee> employeesListClient) {
        Employee newPartTimeStaff = setNewFullTimeStaff();
        employeesListClient.add(newPartTimeStaff);
    }
}
