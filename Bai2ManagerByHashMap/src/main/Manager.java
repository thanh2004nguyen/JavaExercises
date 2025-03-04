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
		String id = scanner.nextLine();;
		System.out.println("Nhap name:");
		String name = scanner.nextLine();
		System.out.println("Nhap position:");
		String position = scanner.nextLine();
		System.out.println("Nhap salary:");
		double salary = scanner.nextDouble();
		scanner.nextLine();
		System.out.println("Nhap managerId:");
		String managerId = scanner.nextLine(); 
		Employee emp = new Employee(id, name, position, salary, managerId);
		employees.put(id, emp);
		System.out.println("Thêm mới nhân viên thành công!");
	}

	private static void displayEmp() {
		System.out.println("Hiển thị danh sách nhân viên");
		for(String i : employees.keySet()) {
			System.out.println(i);
			System.out.println(employees.get(i).toString());
		}
		
	}

	private static void editEmp() {
		System.out.println("Nhập id của employee cần chỉnh sửa!");
		String id = scanner.nextLine();
		for(String i : employees.keySet()) {
			if(employees.containsKey(id)) {
				System.out.println("Nhập lại thông tin của nhân viên" + employees.get(i));
				System.out.println("Nhập tên: ");
				String newName = scanner.nextLine();
				System.out.println("Nhập position: ");
				String newPosition = scanner.nextLine();
				System.out.println("Nhập salary: ");
				double newSalary = scanner.nextDouble();
				System.out.println("Nhập managerId:");
				String newManagerId = scanner.nextLine();
				Employee emp = employees.get(i);
				emp.setName(newName);
				emp.setPosition(newPosition);
				emp.setSalary(newSalary);
				emp.setManagerId(newManagerId);
				System.out.println("Edit thành công!");
				return;
			}
		}
		System.out.println("Không tìm thấy employee có id = "+ id);
	}

	private static void deleteEmp() {
		System.out.println("Nhập id của employee cần xóa: ");
		String id = scanner.nextLine();
		if(employees.remove(id) != null) {
			System.out.println("Xoa thanh cong");
			return;
		}else {
			System.out.println("Khong tim thấy");
		}
		System.out.println("Không tìm thấy id trùng");
	}

	private static void showEmpByManager() {
		 System.out.print("Nhập ID của quản lý: ");
	        String managerId = scanner.nextLine();
	        boolean found = false;
	        for (Employee emp : employees.values()) {
	            if (emp.getManagerId().equals(managerId)) {
	                System.out.println(emp);
	                found = true;
	            }
	        }
	        if (!found) {
	            System.out.println("Không có nhân viên nào thuộc quản lý có ID: " + managerId);
	        }
		
	}
}
