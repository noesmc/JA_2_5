import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("""
                            Menu:
                    1. Enter your lastname
                    2. Enter your lastname
                    3. Enter your year of birth
                    4. Display information
                    0. Exit""");

                System.out.print("Choose the number: ");
                try {
                    number = Integer.parseInt(scanner.next());
                    switch (number) {
                        case 1:
                            System.out.println("Enter your firstname");
                            break;
                        case 2:
                            System.out.println("Enter your lastname");
                            break;
                        case 3:
                            System.out.println("Enter your year of birth");
                            break;
                        case 4:
                            System.out.println("FirstName: entered firstname, LastName: entered lastname, " +
                                    "Year of birth: entered year of birth");
                            break;
                        case 0:
                            System.out.print("Exit");
                            break;
                        default:
                            System.out.println("Number is unavailable");
                            }
                    }
                    catch (NumberFormatException e) {
                        System.out.print("Wrong Input!");
                        number++;
                    }
        } while (number != 0) ;
    }
}


