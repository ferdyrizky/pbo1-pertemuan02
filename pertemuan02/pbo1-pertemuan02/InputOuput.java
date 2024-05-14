import java.util.Scanner;
public class InputOuput {
    public static void main(String []args){
        Scanner Scanner = new Scanner (System.in);

        String nama;
        int jumlahSks;
        double IPK;
        System.out.println("Masukkan nama anda :");
        nama = Scanner.nextLine();
        System.out.print("Hai ,"+ nama);

        System.out.print("Masukan jumlah sks yang ditempuh :");
        jumlahSks = Scanner.nextInt();

        System.out.print("Masukkan IPK Sementara :");
        IPK = Scanner.nextDouble();

        double jumlah = IPK * jumlahSks;
        System.out.print("Total Nilai ="+jumlah);
    }
}
