import java.util.Scanner;
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int pos=0,neg=0,zer=0;
    int ev=0,od=0;
    String eq="====";
    int n;

    for(int i=1;i<=10;i++){
        System.out.print("Enter number "+i+": ");
        n=scan.nextInt();

        if(n<0)neg++;
        else if(n>0)pos++;
        else zer++;

        if(n%2==0)ev++;
        else od++;
    }
    System.out.println("\n"+eq+" STATISTICS "+eq);
    System.out.println("Positive numbers: "+pos);
    System.out.println("Negative numbers: "+neg);
    System.out.println("Zeros: "+zer);
    System.out.println("Even numbers: "+ev);
    System.out.println("Odd numbers: "+od);

}