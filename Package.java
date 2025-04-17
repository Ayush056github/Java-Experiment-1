import Exp.package_exp;
import java.util.Scanner;

public class Package_exp_1 {
    public static void main(String[] args) {
        package_exp c = new package_exp();
        int choice = 0;
        int a = 0, b = 0, res = 0;
        Scanner scn = new Scanner(System.in);
        do {
            System.out.print("Enter a number :");
            a = scn.nextInt();
            System.out.print("Enter b number :");
            b = scn.nextInt();
            System.out.println("Menu");
            System.out.println("1.Add");
            System.out.println("2.Sub");
            System.out.println("3.Mul");
            System.out.println("4.Div");
            System.out.println("5.MOd");
            System.out.println("6.Exit");
            System.out.print("Enter your choice :");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    res = c.add(a, b);
                    System.out.println(res);
                    break;
                case 2:
                    res = c.subtract(a, b);
                    System.out.println(res);
                    break;
                case 3:
                    res = c.multiply(a, b);
                    System.out.println(res);
                    break;
                case 4:
                    res = c.divide(a, b);
                    System.out.println(res);
                    break;
                case 5:
                    res = c.mod(a, b);
                    System.out.println(res);
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    throw new AssertionError();
            }
        } while (choice != 6);
    }
}
