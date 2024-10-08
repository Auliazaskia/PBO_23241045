// Class polos atau tanpa construtor
class Polos{
    // atribut objek
    String dataString;
    int dataInteger;
}

// class dengan construktor
class Mahasiswa{
    // Atribut
    String Nama;
    String NIM;
    String Prodi;


    // construktor
    // nama sama dengan class 
    // tidak memiliki return value/nilai baik
    // merupakan method yang pertama kali di panggil saat class tersebut dibuat
    Mahasiswa(String inputNama, String inputNIM, String inputProdi){
        Nama = inputNama;
        NIM = inputNIM;
        Prodi = inputProdi;
        
        System.out.println("Nama Mahasiswa : " + Nama);
        System.out.println("NIM : " + NIM);
        System.out.println("Prodi: " + Prodi);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // pembuatan objek atau instansiasi objek
        Polos polos_1 = new Polos();

        // isi atribut
        polos_1.dataString = "polos";
        polos_1.dataInteger = 10;

        // cetak objek 
        System.out.println(polos_1.dataString);
        System.out.println(polos_1.dataInteger);

        // pembuatan objek mahasiswa 
        Mahasiswa mhs_1 = new Mahasiswa("Aulia", "23241045","PTI");
    
        // pemobuatan objek 2 mahasiswa 
        Mahasiswa mhs_2 = new Mahasiswa("hantu", "45678", "PTI");
    }
}
