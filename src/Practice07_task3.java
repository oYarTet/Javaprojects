import java.util.Scanner;
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int n;
    System.out.print("Enter number: ");
    n=scan.nextInt();

    int i=1;

    System.out.println("\nUsing while loop:");
    while(i<=n){
        System.out.print(i+" ");
        i++;
    }
    i=1;

    System.out.println("\n\nUsing do-while loop:");
    do{
        System.out.print(i+" ");
        i++;
    }while(i<=n);

    System.out.println("\n\nUsing for loop:");
    for(int j=1;j<=n;j++){
        System.out.print(j+" ");

    }
}