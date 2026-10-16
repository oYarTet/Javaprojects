import java.util.Scanner;
public static void main() {
    Scanner scan = new Scanner(System.in);
    int pin=1738;
    int guess;
    int attempts=3;
    String eq = "====";
    System.out.println(eq+" SIMPLE ATM "+eq);
    while(attempts>0){
        System.out.print("\nEnter PIN: ");
        guess=scan.nextInt();
        attempts--;
        if(guess==pin){
            System.out.println("Login successful!");

            break;
        }
        else{
            System.out.println("Incorrect PIN.");
            System.out.println("Attempts left: "+attempts);
        }
    }
    if(attempts==0){
        System.out.println("\nYour account has been blocked.");
    }
    double balance=100;
    if (attempts>0) {
        int cursor=0;
        String cb="Check balance";
        String dm="Deposit money";
        String wm="Withdraw money";
        String e="Exit";
        String co="Choose an option: ";

        while (cursor != 4) {
            System.out.println("\n"+eq + " ATM MENU " + eq);
            System.out.println("1. "+cb);
            System.out.println("2. "+dm);
            System.out.println("3. "+wm);
            System.out.println("4. "+e);
            System.out.print("\n"+co);
            cursor= scan.nextInt();
            switch (cursor){
                case 1:
                    System.out.println("Your current balance is: $"+balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int dep= scan.nextInt();
                    if(dep>0){
                        balance+=dep;
                        System.out.println("Deposit successful.");
                    }else System.out.println("Deposit amount is incorrect.");
                    System.out.println("Your new balance is: $"+balance);
                    break;
                case 3:
                    System.out.print("Enter withdraw amount: ");
                    int wit= scan.nextInt();
                    if(wit>0 && wit<=balance){
                        balance-=wit;
                        System.out.println("Withdraw successful.");

                    }else System.out.println("Withdraw amount is incorrect.");
                    System.out.println("Your new balance is: $"+balance);
                    break;
                case 4:
                    System.out.println("Thank you for using Simple ATM!");
                    break;
                default:
                    System.out.println("Choose a correct option");
                    break;
            }
        }

    }

}