/**
 * ArrayRataNilai03
 */
import java.util.Scanner;
 public class ArrayRataNilai03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jmlMhs = sc.nextInt();

        int [] nilaiMhs = new int[jmlMhs];
        double totalLulus = 0, totalTdkLulus = 0;
        double rataLulus, rataTdkLulus;
        int luluscount = 0, tdkluluscount = 0;
        double total = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i] = sc.nextInt();
        } 
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                luluscount++;
            } else {
                totalTdkLulus += nilaiMhs[i];
                tdkluluscount++;
            } 

        }

        rataLulus = totalLulus / luluscount;
        rataTdkLulus = totalTdkLulus / tdkluluscount;
        System.out.println("Rata-rata nilai lulus ="+rataLulus);
        System.out.println("Rata-rata nilai tidak lulus ="+rataTdkLulus);
    }
}