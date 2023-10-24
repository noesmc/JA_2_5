import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "", lastName = "", year = "";
        boolean exit = false;
        int number;
        do {
            System.out.print("""
                             Menu:
                    1. Enter your firstname
                    2. Enter your lastname
                    3. Enter your year of birth
                    4. Display information
                    0. Exit
                    """);

                System.out.print("Choose the number: ");
                try {
                    number = Integer.parseInt(scanner.next());
                    scanner.nextLine();
                    switch (number) {
                        case 1:
                            System.out.print("Enter your firstname: ");
                            firstName = scanner.nextLine();
                            break;
                        case 2:
                            System.out.print("Enter your lastname: ");
                            lastName = scanner.nextLine();
                            break;
                        case 3:
                            System.out.print("Enter your year of birth: ");
                            year = scanner.nextLine();
                            break;
                        case 4:
                            if (firstName.isEmpty() || lastName.isEmpty() || year.isEmpty()) {
                                System.out.println("To display full information enter your firstname, lastname " +
                                        "and year of birth");
                            } else {
                                System.out.printf("FirstName: %s; lastName: %s; year of birth: %s%n",
                                        firstName, lastName, year);
                                }
                            break;
                        case 0:
                            System.out.print("Exit");
                            exit = true;
                            break;
                        default:
                            System.out.println("Number is unavailable");
                            }
                    }
                    catch (NumberFormatException e) {
                        System.out.println("Wrong Input!");
                    }
        } while (!exit);
    }
}


