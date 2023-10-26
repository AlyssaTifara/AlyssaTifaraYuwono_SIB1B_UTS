import java.util.Scanner;
public class KodeB{
    public static void main(String[] args){

        Scanner input03 = new Scanner(System.in);
        double tesAkademik, tesBing, tesNasionalis;
        double rataRata = 0;

        //Nilai Rata-Rata 
        System.out.println("Masukkan Nilai Tes Potensi Akademik : ");
        tesAkademik = input03.nextDouble();
        System.out.println("Masukkan Nilai Tes Bahasa Inggris : ");
        tesBing = input03.nextDouble();
        System.out.println("Masukkan Nilai Tes Nasionalisme : ");
        tesNasionalis = input03.nextDouble();

        rataRata = (tesAkademik + tesBing + tesNasionalis)/3;
        System.out.println("Nilai rata-rata calon karyawan adalah : " + rataRata);


    }
}