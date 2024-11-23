import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        welcome();
        System.out.println("Would you like to Book a night or Exit?");
        System.out.println("[1] Book a night");
        System.out.println("[0] Book a night");
        System.out.println("Hi jj");
        System.out.print("~> ");
        int userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                
                break;
        
            case 0:
                System.exit(0);

            default:
                break;
        }
    }

    private static void welcome() {
        System.out.println("WELCOME TO HOTEL DE LUNA");
    }
}
