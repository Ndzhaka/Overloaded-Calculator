import java.util.Scanner;

public class overLoadedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number 1");
        int num1 = scanner.nextInt(); // Reading as string
        System.out.println("Please enter number 2");
        int num2 = scanner.nextInt(); // Reading as string
        System.out.println(add(num1, num2));

        System.out.println("Please enter number 3");
        double num3 = scanner.nextDouble();
        System.out.println("Please enter number 4");
        double num4 = scanner.nextDouble();
        System.out.println(add(num3,num4));
    }
    public static int add(int num1,int num2){
        return num1+num2;
    }
    public static double add(double num1, double num2){
        return num1+num2;
    }

    public static long add(long num1,long  num2){
        return num1+num2;
    }

}
