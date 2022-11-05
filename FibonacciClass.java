public class FibonacciClass {

    public void BF(int c) {
        int a = 0, b = 1, jumlah;
        for (int i = 1; i <= c; i++) {
            System.out.print(a + " ");

            jumlah = a + b;

            a = b;
            b = jumlah;
        }
    }

    public int DC(int c) {
        if (c == 0 || c == 1) {
            return c;
        } else {
            return (DC(c - 1) + DC(c - 2));
        }
    }

    public void dc(int c) {
        int x = 0;
        for (int i = 0; i < c; i++) {
            x += DC(i);
            System.out.println(DC(i) + "");
        }
    }
}
