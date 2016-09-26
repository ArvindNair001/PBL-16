package Employee_Directory;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();
        File_Handle file = new File_Handle();
        System.out.println("1. Add an Employee to the DataBase");
        System.out.println("2. Remove an Employee from the DataBase");
        System.out.println("3. Display the DataBase");
        System.out.println("4. Delete the file");
        System.out.println("5. To create a new DataBase");
        System.out.println("6. Exit");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter the Details:");
                emp.getData();
                System.out.println("Are You sure you want to continue ?");
                char response = sc.next().toLowerCase().charAt(0);
                if(response == 'y'){
                    file.File_Write(emp);
                }
                else {
                    emp.getData();
                }
            case 3:
                file.File_Read();



        }
//        for (int i = 0; i < N; i++) {
//            System.out.println("\nEnter Details for Employee No. "+(i+1)); // employee no 0 issue fixed
//            emp[i] = new Employee();
//            emp[i].getData();
//        }
//        File_Handle file = new File_Handle();
//        for (int i = 0; i < N; i++) {
//            file.File_Write(emp[i]);
//        }

//        for (int i = 0; i < N; i++) {
//            file.File_Read();
//        }

//        for (int i = 0; i < N; i++) {
//            emp[i].dispDetails();
//        }
//        File_Handle file = new File_Handle();
//        file.File();
    }
}