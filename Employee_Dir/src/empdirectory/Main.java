package empdirectory;

import empdirectory.filehandling.Datareading;
import empdirectory.filehandling.Datawriting;

import javax.swing.*;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
//        Employee emp = new Employee();
//        File_Handle file = new File_Handle(); obselete
        System.out.println("1. Add an Employee to the DataBase");
        System.out.println("2. Remove an Employee from the DataBase");
        System.out.println("3. Display the DataBase");
        System.out.println("4. Display the details(sorted by Last Name");
        System.out.println("Employee with Salary > 50000 and who belongs to software dept.)");
        System.out.println("4. Delete the file");
        System.out.println("6. Exit");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                Datawriting applica = new Datawriting();
                applica.openfile();
                applica.addRecords();
                applica.closefile();
                break;
            case 3:
                Datareading rw = new Datareading();
                rw.openfile();
                rw.readRecords();
                rw.closeFile();
            case 2:

        }
    }
}