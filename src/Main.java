import entity.Employee;
import handle.EmployeeHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> arrayList = new ArrayList<>();
        EmployeeHandle employeeHandle = new EmployeeHandle();
        System.out.println("Nhap so nhan vien");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <n ; i++) {
             Employee employee = employeeHandle.employeeHandle(scanner);
             employeeHandle.checkSalary(scanner, employee);
             arrayList.add(employee);
        }
        System.out.println(arrayList);
    }
}