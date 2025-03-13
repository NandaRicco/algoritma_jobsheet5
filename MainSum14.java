import java.util.Scanner;

public class MainSum14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah element: ");
        int element = input.nextInt();

        Sum14 sm = new Sum14(element);
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = input.nextInt();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and COnquer: " + sm.totalDC(sm.keuntungan, 0, element-1));
    }
    
}
