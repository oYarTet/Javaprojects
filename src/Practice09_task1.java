import java.util.Scanner;
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int pin=1738;
    int guess;
    int attempts=3;
    while(attempts>0){
        System.out.print("\nEnter PIN: ");
        guess=scan.nextInt();
        attempts--;
        if(guess==pin){
            System.out.println("Access granted!");

            break;
        }
        else{
            System.out.println("Incorrect PIN.");
            System.out.println("Attempts left: "+attempts);
        }
    }
    if(attempts==0){
        System.out.println("\nCard blocked");
    }

}