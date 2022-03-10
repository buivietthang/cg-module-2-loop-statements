import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        StopWatch2 stopWatch2 = new StopWatch2();
        Scanner scanner = new Scanner(System.in);

        stopWatch2.start();
        for (int i = 0; i < 10000000; i++) {
            for (int j = 0; j < 10000000; j++) {
            }
        }
        stopWatch2.stop();
        while (true) {
            System.out.println("1. Start");
            System.out.println("2. End");
            System.out.println("3. Show");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    stopWatch2.start();
                    break;
                case 2:
                    stopWatch2.stop();
                    break;
                default:
                    System.out.println(stopWatch2.getElapsedTime());
            }
        }
    }
}
