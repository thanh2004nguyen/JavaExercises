package Bai1_managerStudent;

import java.util.ArrayList;
import java.util.Scanner;

public class Manager {

	private final static ArrayList<Student> students = new ArrayList<>();
	private final static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("---- welcome to student manager ----");
			System.out.println("1. Them student ");
			System.out.println("2. Delete Student");
			System.out.println("3. Edit student");
			System.out.println("4. list student");
			System.out.println("5. Exit");
			int choise = scanner.nextInt(); // nhap so vao
			scanner.nextLine();

			switch (choise) {
				case 1:
					addStudent();
					break;
				case 2:
					deleteStudent();
					break;
				case 3:
					editStudent();
					break;
				case 4:
					listStudent();
					break;
				case 5:
					System.out.println("Thoat Chuong trinh !");
					break;
				default: 
					System.out.println("chon sai hay chon lai");
			}
		}

	}

	private static void listStudent() {
		if (students.isEmpty()) {
            System.out.println("Danh sách sinh viên trống.");
        } else {
            System.out.println("\nDanh sách sinh viên:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
	}

	private static void editStudent() {
		System.out.println("Nhập id cần edit thông tin: ");
		int id = scanner.nextInt();
		
		for(Student stu:students) {
			if(stu.getId() == id) {
				System.out.println("nhap lai thong tin can sua!");
				System.out.println("Nhap age: ");
				int age = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Nhap name");
				String name = scanner.nextLine();
				stu.setAge(age);
				stu.setName(name);
				System.out.println("Edit thanh cong");
				break;
			}
		}
		System.out.println("Khong tim thay sv");
	}

    private static void deleteStudent() {
        System.out.println("Nhập ID cần xóa: ");
        int id = scanner.nextInt();

        boolean found = false;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Xóa thành công!");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên có ID: " + id);
        }
    }


	private static void addStudent() {
		System.out.println("Nhap id: ");
		int idd = scanner.nextInt();
		System.out.println("nhap tuoi");
		int age = scanner.nextInt();
		System.out.println("Nhap ten");
		String name = scanner.next();
		scanner.nextLine();
		
		Student student = new Student(idd, age, name);
		students.add(student);
		System.out.println("add thanh cong");
		System.out.println(student);
	}

}
