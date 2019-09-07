package Question_7;

import java.util.Scanner;

    public class question_7 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the numbers of cells n (where n will be = 2*n): ");
            int n = scanner.nextInt();
            n = 2*n+1;
            int max = 0;
            int maxi = 0;
            int[] a = new int[n];
            for (int i = 1; i < n; i++) {
                System.out.print("Enter the value of array " + i + ": ");
                a[i] = scanner.nextInt();
            }
            for (int i = 1; i < n; i++) {
                max = a[1] + a[n-1];
            }
            for (int i = 2; i < n; i++) {
                maxi = a[i] + a[(n-1)-i+1];
                if (maxi>max) {
                    max = maxi;
                }
            }
            System.out.println("Max sum will be: " + max);
        }
    }

