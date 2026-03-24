import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n1 = scanner.nextInt();
    System.out.println("Sum of squares: " + sumOfSquares(n1));

    int n2 = scanner.nextInt();
    int[] arr = new int[n2];
    for (int i = 0; i < n2; i++) arr[i] = scanner.nextInt();
    System.out.println("Sum of array: " + sumOfArray(arr, n2));

    int b = scanner.nextInt();
    int n3 = scanner.nextInt();
    System.out.println("Sum of powers: " + sumOfPowers(b, n3));

    int N = scanner.nextInt();
    reverseSequence(scanner, N);

    scanner.close();
  }

  // Time Complexity: O(n) - The function calls itself n times until it reaches the base case.
  public static int sumOfSquares(int n) {
    if (n == 1) return 1;
    return (n * n) + sumOfSquares(n - 1);
  }

  // Time Complexity: O(n) - The function processes one element per recursive call.
  public static int sumOfArray(int[] arr, int n) {
    if (n <= 0) return 0;
    return arr[n - 1] + sumOfArray(arr, n - 1);
  }

  // Time Complexity: O(n) - There are n+1 recursive calls (from n down to 0).
  public static double sumOfPowers(int b, int n) {
    if (n == 0) return 1; // b^0 is 1
    return Math.pow(b, n) + sumOfPowers(b, n - 1);
  }

  // Time Complexity: O(n) - The function reads and prints N elements recursively.
  public static void reverseSequence(Scanner sc, int n) {
    if (n <= 0) return;
    int current = sc.nextInt();
    reverseSequence(sc, n - 1);
    System.out.print(current + " ");
  }
}