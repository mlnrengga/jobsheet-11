import java.util.Scanner;
public class NestedLoop_2341720160 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double [][] temps = new double[5][7];
        double rata = 0;

        for (int i = 0; i < temps.length; i++){
            System.out.println("Kota Ke-" + i);
            for(int j = 0; j < temps[0].length; j++){
                System.out.print("Hari Ke-" + (j+1) + " : ");
                temps[i][j] = sc.nextDouble();
            }System.out.println();
        }
        int i = 0;
        for (double[] baris : temps) {
            System.out.print("Kota ke-" + (i + 1) + ": ");
            for (double kolom : baris) {
                System.out.print(kolom + " ");
                rata += kolom;
            }
            rata = rata / baris.length;
            System.out.print("Nilai Rata-Rata : " + rata);
            System.out.println();
             i++;           
        }sc.close();   
    }
}
