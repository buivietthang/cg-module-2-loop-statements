import java.util.Scanner;

public class DisplayPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số nguyên tố muốn hiển thị");
        int quantity = scanner.nextInt();
        System.out.println("Các số nguyên tố là: ");
        int count = 0;
        int number = 0;
        while (count < quantity) {
            if (isPrime(number)) {
                System.out.print(number + "; ");
                count++;
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
