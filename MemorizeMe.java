package learning_march;
import java.util.Scanner;

public class MemorizeMe {



	public static void main(String[] args) {
        executeMemoryGame();
    }

    public static void executeMemoryGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Total Numbers:");
        int N = sc.nextInt();

        int[] numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        for (int i = 0; i < Q; i++) {
            int query = sc.nextInt();
            int count = Occurrences(numbers, query);
            if (count > 0) {
                System.out.println(count);
            } else {
                System.out.println("NOT PRESENT");
            }
        }

        
    }
    public static int Occurrences(int[] numbers, int query) {
        int count = 0;
        for (int num : numbers) {
            if (num == query) {
                count++;
            }
        }
        return count;
    }
}