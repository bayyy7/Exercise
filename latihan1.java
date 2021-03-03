import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        int hektare, are, m_persegi, cm_persegi;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Masukkan satuan luas dalam satuan hektare : ");
        hektare = keyboard.nextInt();

        are =  hektare*100;
        m_persegi = are*100;
        cm_persegi = m_persegi*10000;

        System.out.format("konversi satuan luas adalah %d hektar sama dengan : \n", hektare);
        System.out.format(" %d are \n %d meter persegi \n %d centimeter persegi \n", are, m_persegi, cm_persegi);

        
    }
}
