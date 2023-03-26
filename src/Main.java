import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter n1");
        int n1 = scanner.nextInt();
        System.out.println("please enter n2");
        int n2 = scanner.nextInt();
        System.out.println("please enter n3");
        int n3 = scanner.nextInt();

        System.out.println("you entered "+n1+", "+n2+" and "+n3+".");

        int sum = n1+n2+n3;
        System.out.println("The sum of the number is " +sum);
    }
}