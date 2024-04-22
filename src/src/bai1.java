import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Nhập phần tử cần xoá: ");
        int x = sc.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {
            for (int i = index; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            System.out.println("Mảng sau khi xoá:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
