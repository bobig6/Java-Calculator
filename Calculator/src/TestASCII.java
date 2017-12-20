import java.util.Scanner;

public class TestASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Give me symbol:");
        char c1 = scanner.next().charAt(0);
        System.out.printf("\nThe ASCII code is %d", (int)c1);

    }
}
