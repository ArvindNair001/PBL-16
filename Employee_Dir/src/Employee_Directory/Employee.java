package Employee_Directory;

import java.util.Scanner;

public class Employee {
    String Name, F_Name, S_Name;
    String Quali, dept;
    int emp_ID;
    byte Age, exp;
    long Salary;
    void getData(){
        Department DEPT = new Department();
        while (true) { //emp_ID check issue fixed !
            emp_ID = Integer.parseInt(getInput("\nEnter your Employee ID:"));
            if(!ID_Check(emp_ID)){
                System.out.println("Please Enter a valid 6 digit Employee ID");
                continue;
            }
            break;
        }
        Name = getInput("\nEnter Your Name:");
        Name_split();
        Age = Byte.parseByte(getInput("\nEnter Your Age:"));
        Quali = getInput("\nEnter Your Qualification:");
        dept = DEPT.DEPT_Select();
        Salary = Long.parseLong(getInput("\nEnter a Salary"));
        exp = Byte.parseByte(getInput("\nEnter Experience (in Years):"));
    }
    String getInput (String prompt){
        System.out.print(prompt);
        Scanner sc = new Scanner (System.in);
        return sc.nextLine();
    }

    void dispDetails(){
        System.out.println("\n\nDetails of "+Name+" :");
        System.out.println("Employee ID:"+emp_ID);
        System.out.println("First Name: "+F_Name);
        System.out.println("Last Name: "+S_Name);
        System.out.println("Department: "+dept);
        System.out.println("Age: "+Age);
        System.out.println("Qualifications :"+Quali);
        System.out.println("Experience :"+exp+" years");
        System.out.println("Salary: Rs "+Salary+".00/- only");
    }
        public void Name_split (){
       String[] arr = Name.split("\\s");
            F_Name = arr[0];
            S_Name = arr[1];
    }
    boolean ID_Check (int n){
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
