import java.util.Scanner;
import java.util.Random;
public class Quiz15 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner (System.in);

        char menu ='y';
        do {
            int number = random.nextInt(10) + 1;
            boolean succes = false;
            do{
                System.out.print("Tebak Angka (1-10): ");
                int answer = sc.nextInt();
                sc.nextLine();
                succes = (answer == number);
                if (answer < number) {
                    System.out.println("Nilai Yang Anda Masukkan Harus Lebih Besar");
                }else if ( answer > number){
                    System.out.println("Nilai Yang Anda Masukkan Harus Lebih kecil");
                }
            } while(!succes);
            System.out.print("Apakah Anda Ingin Mengulang Permainan? (Y/y)?");
            menu = sc.nextLine().charAt(0);
        }while (menu=='y'|| menu=='Y');
        sc.close();
    }
}
