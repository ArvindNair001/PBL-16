package empdirectory.filehandling;

import empdirectory.*;

import java.io.*;
import java.util.Formatter;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Datawriting {

    private Formatter output;
    private String address = "Employee_Dir/src/empdirectory/data/Employee_Details.txt";
    public void openfile() {
        try {
            output = new Formatter(new BufferedWriter(new FileWriter(address, true)));
        }
        catch (SecurityException secur) {
            System.err.println("Permission Issues!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addRecords() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        Scanner fileinp = new Scanner(new File(address));
        Employee2 record = new Employee2();
        Department dept = new Department();
        System.out.printf("%s\n%s","Enter ID,First Name, Last Name, Age, Salary, Qualifications, Experience, Department","?");
        while(input.hasNext()){
            try{
                //id validation
                while (true){
                    record.setEmp_ID(input.nextInt());
                    if(!ID_Check(record.getEmp_ID())){
                        System.out.println("Invalid ID");
                        System.out.println("Please Try Again");
                        continue;
                    }
                    break;
                }

                record.setF_Name(input.next());
                record.setS_Name(input.next());
                record.setAge(input.nextByte());
                record.setSalary(input.nextLong());
                record.setQuali(input.next());
                record.setExp(input.nextInt());
                record.setDept(dept.DEPT_Select());

                while(fileinp.hasNext()) {
                    if (record.getEmp_ID() == fileinp.nextInt()){
                        System.out.println("Employee ID already in use !");
                        System.out.flush();
                    }
                    fileinp.nextLine();
                    output.format("%d %15s %15s %15d %15d %15s %15d %15s\n",record.getEmp_ID(),record.getF_Name()
                            ,record.getS_Name(),record.getAge(),record.getSalary(),record.getQuali(),record.getExp(),record.getDept());
                }

            }

            catch (NoSuchElementException nsee) {
                System.out.println("Invalid Input,Please Try again");
                input.nextLine();

            } catch (Exception e){
                e.printStackTrace();
            }
            System.out.printf("%s\n%s","Enter Employee ID,First Name, Last Name","?");

        }
    }

    public void closefile() {
        if (output != null) {
            output.close();
        }
    }

    private boolean ID_Check (int n) {
        int count=0;
        while(n!=0){
            n /= 10;
            count++;
        }
        if (count == 6){
            return true;
        }
        return false;
    }
}
