
package RataRata;
import java.util.Scanner;
/**
 * Nama      : Rama Al Halik
 * Kelas     : IF-1
 * NIM       : 10118007
 * Deskripsi : Menghitung Lingkaran
 * @author Rama
 */        
public class NilaiMhs {

	public int nilai;
	public double totalNilai;
	Scanner masuk = new Scanner(System.in);

	public double hitungNilai(int parNilai, int parJmlMhs) {
		  for(int i=1;i<=parJmlMhs;i++){
            System.out.print("Nilai mahasiswa ke-"+i+" : ");
            parNilai = masuk.nextInt();
            totalNilai += parNilai;
        }
        return totalNilai;
    }
	

	
	public double hitungRataRata(double totalNilai, int jmlMhs) {
		        return totalNilai/jmlMhs;
	}

}