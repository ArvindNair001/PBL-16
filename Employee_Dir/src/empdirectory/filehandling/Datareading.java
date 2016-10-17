package empdirectory.filehandling;

import empdirectory.Employee;
import empdirectory.Employee2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Datareading {
    private Scanner input;
    private String address = "Employee_Dir/src/empdirectory/data/Employee_Details.txt";
    public void openfile(){
        try {
            input = new Scanner(new File(address));

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void readRecords(){
        Employee2 record = new Employee2();
        try {
            while (input.hasNext()) {
                record.setEmp_ID(input.nextInt());
                record.setF_Name(input.next());
                record.setS_Name(input.next());
                record.setAge(input.nextByte());

                System.out.printf("%-10d%-12s%-12s%5d", record.getEmp_ID(), record.getF_Name(), record.getS_Name(), record.getAge());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void closeFile(){
        if (input!=null){
            input.close();
        }
    }
}
