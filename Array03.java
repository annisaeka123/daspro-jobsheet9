/**
 * Array03
 */
import java.util.Scanner;
 public class Array03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan banyaknya elemen array: ");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        
        int max = array[0];
        int min = array[0];
        int total = array[0];
        
        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            total += array[i];
        }
        
        double average = (double) total / n;
        
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Nilai terendah: " + min);
        System.out.println("Nilai rata-rata: " + average);
    }
}