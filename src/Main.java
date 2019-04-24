import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = {"Tom", "Jelly", "Micky", "Donal", "Panda", "Teemo"};
        System.out.print("Nhap ten sinh vien can tim: ");
        searchStudents(students);

    }

    static void searchStudents(String[] arr) {
        String name = nhap();
        int index = 0;
        for (String student : arr) {
            index++;
            if (student.equals(name)) System.out.println(student + " co so thu tu thu " + index + " trong danh sach");
        }
    }

    static String nhap() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

}
