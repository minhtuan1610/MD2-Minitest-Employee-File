package storages;

import models.Employee;

import java.io.IOException;
import java.util.LinkedList;

public interface EmployeeData {
    LinkedList<Employee> readFile();

    void writeFile(LinkedList<Employee> linkedList) throws IOException;
}
