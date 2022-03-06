package storages;

import models.Employee;

import java.io.*;
import java.util.LinkedList;

public class EmployeeFromBinaryFile implements EmployeeData {
    @Override
    public LinkedList<Employee> readFile() {
        File file = new File("src/storages/employee.dat");
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object result = ois.readObject();
            LinkedList<Employee> employeesList = (LinkedList<Employee>) result;
            fis.close();
            ois.close();
            return employeesList;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void writeFile(LinkedList<Employee> linkedList) throws IOException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream("src/storages/employee.dat");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(linkedList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            oos.close();
            fos.close();
        }

    }
}
