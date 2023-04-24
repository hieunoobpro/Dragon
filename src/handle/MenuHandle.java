package handle;

import entity.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class MenuHandle {
    public void menuHandle(int choice ,Scanner scanner, ArrayList<Employee> arrayList){
        if (choice == 1){
            System.out.println(arrayList);
        }
        else if (choice == 2){
            System.out.println("Nhap id nhan vien muon xoa");
            int id = scanner.nextInt();
            for (Employee employee : arrayList) {
                if (employee.getId()==id) {
                arrayList.remove(employee);
                }
                else {
                    System.out.println("Khong tim thay nhan vien");
                }
            }
        }
        else if (choice == 3){
            System.out.println("Cap nhap thong tin nhan vien theo id: ");
            System.out.println("Nhap id nhan vien muon cap nhap");
            int id = Integer.parseInt(scanner.nextLine());
            for (Employee employee : arrayList) {
                if (employee.getId()==id) {
                EmployeeHandle employeeHandle = new EmployeeHandle();
                arrayList.set(id, employeeHandle.employeeInput(scanner));
                }
                else {
                    System.out.println("Khong tim thay nhan vien");
                }
            }
        }
        else if (choice == 4){
            System.out.println("Nhap luong cua nhan vien muon tim");
            double salary = Double.parseDouble(scanner.nextLine());
            for (Employee employee : arrayList) {
                if (employee.getSalary()==salary) {
                    System.out.println(employee);
                }
                else {
                    System.out.println("Khong co nhan vien nao");}
            }
        }
    }
}
