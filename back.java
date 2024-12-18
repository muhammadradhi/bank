import java.util.Scanner;

public class back {
	static int saldo = 0;
	
	public static void menu() {
		System.out.println("--------------------");
		System.out.println("        MENU        ");
		System.out.println("--------------------");
		System.out.println("1. Tarik Tunai");
		System.out.println("2. Setor Tunai");
		System.out.println("3. Cek Saldo");
		System.out.println("4. Keluar");
		System.out.println("--------------------");
	}
	
	public static void tarik() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selamat datang di menu Tarik Tunai");
		System.out.print("Masukkan angka: ");
		int a = sc.nextInt();
		
		if ( saldo <= a ) {
			System.out.println("Anda tidak memiliki cukup saldo untuk melakukan penarikan sejumlah " + a);
			System.out.println("Isi saldo anda segera");
			menu();
			utama();
		} 
		
		if ( saldo > a ) {
			saldo -= a;
		}
		
		System.out.println("Anda berhasil menarik uang sejumlah " + a);
		System.out.println("Sisa saldo anda: " + saldo);
		
		System.out.print("Lanjut penarikan? (true/false): ");
		String b = sc.next();
		
		if ( b.equals("true") ) {
			tarik();
		}
		
		if ( b.equals("false") ) {
			menu();
			utama();
		}
	}
	
	public static void setor() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Selamat datang di menu Setor Tunai");
		System.out.println("Jumlah saldo anda sekarang: " + saldo);
		System.out.print("Masukkan jumlah angka: ");
		int c = sc.nextInt();
		
		if ( c <= 0 ) {
			menu();
			utama();
		}
		
		if ( c > 0 ) {
			saldo += c;
		}
		
		System.out.println("Jumlah saldo anda sekarang: " + saldo);
		System.out.print("Lanjut setor? (true/false): ");
		String d = sc.next();
		
		if ( d.equals("true") ) {
			setor();
		}
		
		if ( d.equals("false") ) {
			menu();
			utama();
		}
	}
	
	public static void cek () {
		System.out.println("Saldo anda saat ini: " + saldo);
		menu();
		utama();
	}
	
	public static void utama() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan opsi: ");
		int x = sc.nextInt();
		
		do {
			switch (x) {
				case 1:
					tarik();
					break;
				case 2:
					setor();
					break;
				case 3:
					cek();
					break;
				case 4: 
					System.out.println("Terima kasih sudah menggunakan aplikasi, sampai jumpa");
					System.exit(0);
					break;
				default:
					System.out.println("Opsi tidak ditemukan, coba lagi");
					menu();
					utama();
					break;
			}
		} while ( x != 4 );
	}
	
	public static void main(String[] args) {
		menu();
		utama();
	}
}