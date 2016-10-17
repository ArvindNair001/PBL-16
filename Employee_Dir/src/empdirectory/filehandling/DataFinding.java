package empdirectory.filehandling;

import empdirectory.Employee2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class DataFinding {
    private Scanner scan;
    private String address = "Employee_Dir/src/empdirectory/data/Employee_Details.txt";
    private int searchID;

    private void openFile(){
        try {
            scan = new Scanner(new File(address));
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    private void deleteRecord(){
        Employee2 record = new Employee2();
        Scanner sc = new Scanner(System.in);
        char response;
        System.out.printf("%s\n%s","Enter Employee_ID",">>");
        searchID = sc.nextInt();
        while(scan.hasNext()){
            if (scan.nextInt()==searchID){
                System.out.println("Match Found,Continue?");
                response = sc.next().toLowerCase().charAt(0);
                System.out.println("Are You Sure, Deleted data cannot be Recovered !!");
                response = sc.next().toUpperCase().charAt(0);
                if (response == 'Y')
                {
                    scan.hasN
                }
                else {
                    return;
                }
            }
        }

    }
}
