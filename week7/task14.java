import java.util.Scanner;

public class Lab4Task14 {
    static public int gcd(int a, int b){
        if(b == 0) return a;
        return gcd(b,a%b);
    }
    static public void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter seccond integer: ");
        int num2 = input.nextInt();
        System.out.println("The greatest divisor for "+num1+" and "+num2+" is "+gcd(num1, num2));
    }
}
