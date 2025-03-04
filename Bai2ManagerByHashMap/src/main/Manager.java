package main;

import java.util.HashMap;
import java.util.Scanner;

public class Manager {
	private final static HashMap<String, Employee> employees = new HashMap<>();
	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Quản lý nhân viên");
			System.out.println("1. Thêm nhân viên");
			System.out.println("2. Hiển thị danh sách nhân viên");
			System.out.println("3. Chỉnh sửa thông tin nhân viên");
			System.out.println("4. Xóa nhân viên");
			System.out.println("5. Danh sách nhân viên theo quản lý");
			System.out.println("6. Thoát");
			System.out.print("Chọn: ");
			int choice = scanner.nextInt();
			scanner.nextLine(); // Xóa bộ nhớ đệm

			switch (choice) {
				case 1:
					addEmp();
					break;
				case 2:
					displayEmp();
					break;
				case 3:
					editEmp();
					break;
				case 4:
					deleteEmp();
					break;
				case 5: 
					showEmpByManager();
					break;
				case 6: 
					System.out.println("Thoat chuong trinh");
					return;
			default:
				System.out.println("Lựa chọn không hợp lệ!");
			}
		}

	}

	private static void addEmp() {
		System.out.println("Nhap id: ");
		int id = scanner.nextInt();
		System.out.println("Nhap name:");
		String name = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Nhap position:");
		String position = scanner.nextLine();
		System.out.println("Nhap salary:");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Nhap managerId:");
		String managerId = scanner.nextLine(); 
		Employee emp = new Employee(id, name, position, salary, managerId);
		employees.put("01", emp);
		System.out.println(employees);
		
	}

	private static void displayEmp() {
		// TODO Auto-generated method stub
		
	}

	private static void editEmp() {
		// TODO Auto-generated method stub
		
	}

	private static void deleteEmp() {
		// TODO Auto-generated method stub
		
	}

	private static void showEmpByManager() {
		// TODO Auto-generated method stub
		
	}
}
