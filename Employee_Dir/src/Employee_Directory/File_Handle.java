package Employee_Directory;import org.json.simple.JSONArray;import org.json.simple.JSONObject;import org.json.simple.parser.JSONParser;import java.io.File;import java.io.FileReader;import java.io.FileWriter;import java.io.IOException;import java.util.Formatter;import java.util.Iterator;import java.util.Scanner;/** * Created by arvindhn602 on 15/09/16. */public class File_Handle {    String address = "/Users/arvindhn602/Documents/PBL-16/Employee_Dir/src/Employee_Directory/Employee_Details.json";    void File() throws IOException{        int optn;        File file = new File(address);                Scanner sc = new Scanner(System.in);        if (file.exists()) { // File Does not exists ?            System.out.println("Enter r to read a file or w to write a file or any other key to abort");            char response = sc.next().toLowerCase().charAt(0);            if (response=='r'){                File_Read();            }            else if (response=='w'){//                File_Write();            }            else                return;        }        else {            System.out.println("File Does not exist");            System.out.println("Press 1 to create a File");            optn = sc.nextInt();            if (optn == 1) {                File_create();            }        }    }    void File_create() {        try {            Formatter f = new Formatter(address);            System.out.println("File-Created");        } catch (Exception e) {            e.printStackTrace();        }    }//    void Parse_Details (){//////    }     public void File_Write(Employee emp) throws IOException {         JSONObject obj = new JSONObject();         obj.put("Emp_ID",emp.emp_ID);         obj.put("First Name", emp.F_Name);         obj.put("Last Name", emp.S_Name);         obj.put("Age", emp.Age);         obj.put("Department",emp.dept);         obj.put("Qualifications",emp.Quali);         obj.put("Experience",emp.exp);         obj.put("Salary",emp.Salary);//        JSONArray Acad_details = new JSONArray();//        Acad_details.add("Class: SE Comps");//        Acad_details.add("Division: A");//        Acad_details.add("Batch: PIIT");//        obj.put("Academic Details", Acad_details);//        FileWriter file = new FileWriter ();//        try{//            file.write(obj.toJSONString());//            System.out.println("Successfully Copied JSON Object to File...");//            System.out.println("\nJSON Object: " + obj);//        }//        catch (Exception e){//            e.printStackTrace();//        }//        finally {//            file.flush();//            file.close();//        }        //The below code is more efficient        try (FileWriter file = new FileWriter(address)) { //try with resource File will be closed in any Condition !            file.write(obj.toJSONString());            System.out.println("Successfully Copied JSON Object to File...");            System.out.println("\nJSON Object: " + obj);        }    }    void File_Read(){        JSONParser parser =new JSONParser();        try {            Object read = parser.parse(new FileReader(address));            JSONObject jsonObject = (JSONObject) read;            int emp_ID = (int) jsonObject.get("Emp_ID");            String F_Name = (String) jsonObject.get("F_name");            String S_Name = (String) jsonObject.get("S_name");            byte Age = (byte) jsonObject.get("Age");            String dept = (String) jsonObject.get("Department");            String Quali = (String) jsonObject.get("Qualification");            byte exp = (byte) jsonObject.get("Experience");            long Salary = (long) jsonObject.get("Salary");//            JSONArray Acad_details = (JSONArray) jsonObject.get("Academic Details");//            System.out.println("Name: " +name);            System.out.println("Age: " + Age);            System.out.println("Employee ID:"+emp_ID);            System.out.println("First Name: "+F_Name);            System.out.println("Last Name: "+S_Name);            System.out.println("Department: "+dept);            System.out.println("Age: "+Age);            System.out.println("Qualifications :"+Quali);            System.out.println("Experience :"+exp+" years");            System.out.println("Salary: Rs "+Salary+".00/- only");//            System.out.println("Academic Details:\n");//            Iterator<String> iterator = Acad_details.iterator();//            while (iterator.hasNext()){//                System.out.println(iterator.next());//            }        }        catch (Exception e)        {            e.printStackTrace();        }    }}