import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước mảng 1: ");
        int size1 = scanner.nextInt();
        System.out.print("Nhập kích thước mảng 2: ");
        int size2 = scanner.nextInt();

        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] arr3 = new int[size1 + size2];

        for (int i = 0; i < size1; i++) {
            arr3[i] = arr1[i];
        }

        for (int i = 0; i < size2; i++) {
            arr3[size1 + i] = arr2[i];
        }

        System.out.println("Mảng sau khi gộp:");
        System.out.println(Arrays.toString(arr3));

        scanner.close();
    }
}
