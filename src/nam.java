import java.util.Scanner;

public class nam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Which month that you want to count days");
        int mounth = sc.nextInt();
        String daysInMonth;
        switch (mounth) {
            case 2:
                daysInMonth = "28 or 29";
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = "31";
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = "30";
                break;
            default:
                daysInMonth = "";
        }
        if (daysInMonth != "")
            System.out.printf("The month "+mounth+" has "+ daysInMonth+" day!");
        else
            System.out.println("Invalid input");
    }
}

