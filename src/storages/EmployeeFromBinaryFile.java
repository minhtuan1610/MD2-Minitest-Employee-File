package storages;

import models.Employee;

import java.io.*;
import java.io.IOException;
import java.util.LinkedList;

public class EmployeeFromBinaryFile implements EmployeeData {
    public static final String SAVE_PATH = "src/storages/employee.dat";

    @Override
    public LinkedList<Employee> readFile() {
        try {
            FileInputStream fis = new FileInputStream(SAVE_PATH);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            LinkedList<Employee> employeesList = (LinkedList<Employee>) result;
            fis.close();
            ois.close();
            return employeesList;
        } catch (FileNotFoundException e) {
            System.err.println("Bạn chưa tạo file");
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new LinkedList<>();
    }

    @Override
    public void writeFile(LinkedList<Employee> linkedList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(SAVE_PATH);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(linkedList);
            oos.close();
            fos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.err.println("Lỗi ghi file");
        }
    }
}
