package RataRata;
import java.util.Scanner;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menghitung Lingkaran
 * @author Rama
 */
public class Main {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		   NilaiMhs mhs = new NilaiMhs();
        Scanner masuk = new Scanner(System.in);
        
        int jmlMhs;
        System.out.print("Masukkan Banyaknya Mahasiwa : ");
        jmlMhs = masuk.nextInt();
        
        mhs.hitungNilai(mhs.nilai, jmlMhs);
        mhs.hitungRataRata(mhs.totalNilai, jmlMhs);
        
        System.out.printf("%nMaka, Rata-rata nilainya adalah : %.1f",mhs.hitungRataRata(mhs.totalNilai, jmlMhs));
        System.out.println();
	}

}