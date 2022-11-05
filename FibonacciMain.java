import java.util.Scanner;

public class FibonacciMain {
    public static void main(String[] args) {

        System.out.println("Masukkan Jumlah Angka Yang ingin Ditampilkan : ");
        try (Scanner Nazario = new Scanner(System.in)) {
            int angka = Nazario.nextInt();

            FibonacciClass fb = new FibonacciClass();
            System.out.println("Fibonacci Dengan Brute Force : ");
            fb.BF(angka);
            System.out.println("Fibonacci Dengan Divide Conquer : ");
            fb.dc(angka);
        }
    }
}
