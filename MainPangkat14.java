import java.util.Scanner;

public class MainPangkat14 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah element: ");
        int element = input.nextInt();

        Pangkat14[] png = new Pangkat14[element];
        for (int i = 0; i < element; i++) {
            System.out.print("Masukkan nilai basis element ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat element ke-" + (i+1) + ": ");
            int pangkat = input.nextInt();
            png[i] = new Pangkat14(basis, pangkat);
        }

        // System.out.println("Hasil Pangkat Bruteforce");
        // for (Pangkat14 p : png) {
        //     System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
        // }
        
        System.out.println("Hasil Pangkat Bruteforce");
        for (Pangkat14 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());
        }
        
        System.out.println("Hasil Pangkat Devide and Conquer");
        for (Pangkat14 p : png) {
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
    
}
