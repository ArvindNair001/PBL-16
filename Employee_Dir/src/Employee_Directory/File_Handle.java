package Employee_Directory;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

/**
 * Created by arvindhn602 on 15/09/16.
 */
public class File_Handle {
    void File() {
        int optn;
        File file = new File("Employee_Details.txt");
        Scanner sc = new Scanner(System.in);
        if (file.exists()) {
            System.out.println("File Exists");
        }
        else {
            System.out.println("File Does not exist");
            System.out.println("Press 1 to create a File");
            optn = sc.nextInt();
            if (optn == 1) {
                File_create();
            }
        }
    }

    void File_create() {
        try {
            Formatter f = new Formatter("Employee_Details.txt");
            System.out.println("File-Created");
            File();
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
