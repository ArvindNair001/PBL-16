package Employee_Directory;

import java.util.Scanner;

public class Department {
    byte optn;

    void disp_DEPT() { //Temporary may or may not b used.
        System.out.println("Following are the departments of ABCD inc.,:");
        System.out.println("\nManaging");
        System.out.println("HR");
        System.out.println("Production");
        System.out.println("Marketing");
        System.out.println("Software");
        System.out.println("Development");
    }

    String DEPT_Select() {
//        System.out.println("Do yo Want the list of department of this organization?");
        System.out.println("Select The Department:");
        System.out.println("\n1.Managing");
        System.out.println("2.HR");
        System.out.println("3.Production");
        System.out.println("4.Marketing");
        System.out.println("5.Software");
        System.out.println("6.Development");
        System.out.println("7.Temporary");
        System.out.println("8.Training");
        System.out.print("\nEnter your option:");
        Scanner sc = new Scanner(System.in);
        optn = sc.nextByte();
        switch (optn) {
            case 1:
                return "Managing";

            case 2:
                return "HR";

            case 3:
                return "Production";

            case 4:
                return "Marketing";

            case 5:
                return "Software";

            case 6:
                return "Development";

            case 7:
                return "Temporary";

            case 8:
                System.out.println("Select the Sub Department:");
                System.out.println("3.Production");
                System.out.println("4.Marketing");
                System.out.println("5.Software");
                System.out.println("6.Development");
                System.out.print("\n Enter the desired option:");
                optn = sc.nextByte();
                switch (optn){
                    case 1: return "Training"+"-Production";

                    case 2:return "Training"+"-Marketing";

                    case 3:return "Training"+"-Software";

                    case 4:return "Training"+"-Development";

                    default:
                        System.out.println("Enter a valid Option!");
                }
                break;
            default:
                System.out.println("Enter a valid Option!");
        }
        return null;
    }
}
