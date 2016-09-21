package Employee_Directory;

// Make a Department Class with disp method showing all the departments //fixed
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter The Number of Employees:");
        int N = sc.nextInt();
        Employee emp[] = new Employee[N];
        for (int i = 0; i < N; i++) {
            System.out.println("\nEnter Details for Employee No. "+(i+1)); // employee no 0 issue fixed
            emp[i] = new Employee();
            emp[i].getData();
        }
        for (int i = 0; i < N; i++) {
            emp[i].dispDetails();
        }
        // The above Array of Objects is to be Stored in the file. -?
//        File_Handle file = new File_Handle();
//        file.File();
    }
}