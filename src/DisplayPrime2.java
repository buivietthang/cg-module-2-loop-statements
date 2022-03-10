import java.util.Scanner;

public class DisplayPrime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số bạn muốn giới hạn");
        int limited = scanner.nextInt();
        System.out.println("Các số nguyên tố là: ");
        int number = 0;
        while (number < limited) {
            if (isPrime(number)) {
                System.out.print(number + "; ");
            }
            number++;
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
