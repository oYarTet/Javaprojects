import java.util.Scanner;
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n=12;
    int chosen=-99999;
    int guesses=0;
    while(guesses<5){
        guesses++;
        System.out.print("\nEnter your guess: ");
        chosen=scan.nextInt();
        if(n==chosen){
            break;
        }
        else{
            if(chosen<n)System.out.println("Too low!");
            else System.out.println("Too high!");

        }
    }
    if(guesses<5 && n==chosen){
        System.out.println("Correct!");
        System.out.println("You only needed "+guesses+" attempts.");

    }
    else{
        System.out.println("\nGame over!");
        System.out.println("Secret number was "+n);
    }
}