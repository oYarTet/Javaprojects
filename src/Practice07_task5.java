import java.util.Scanner;
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;
    System.out.print("Enter number: ");
    n=scan.nextInt();

    int i=0;

    System.out.println("\nUsing while loop:");
    while(i<=n){
        System.out.print(i+" ");
        i+=2;
    }
    i=0;

    System.out.println("\n\nUsing do-while loop:");
    do{
        System.out.print(i+" ");
        i+=2;
    }while(i<=n);

    System.out.println("\n\nUsing for loop:");
    for(int j=0;j<=n;j+=2){
        System.out.print(j+" ");

    }
}