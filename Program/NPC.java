/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal TP1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
import java.util.ArrayList;

public class NPC {// Kelas NPC
    private String nama;// Atribut nama
    private char jenisKelamin;// Atribut jenisKelamin
    private ArrayList<Barang> barangJualan;// Atribut barangJualan
    private Quest quest;// Atribut quest

    public NPC(String nama, char jenisKelamin) {// Konstruktor
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.quest = null;
    }

    // Getter-Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public char getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(char jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public ArrayList<Barang> getBarangJualan() {
        return barangJualan;
    }

    public void setBarangJualan(ArrayList<Barang> barangJualan) {
        this.barangJualan = barangJualan;
    }

    public Quest getQuest() {
        return quest;
    }

    public void setQuest(Quest quest) {
        this.quest = quest;
    }

    // Method untuk menjual barang kepada karakter
    public void jualBarang(Karakter karakter, Barang barangJualan) {
        if (karakter.getUangKoin() < barangJualan.getNilai()) {
            System.out.println("Maaf koin Anda tidak cukup untuk membeli barang ini!");
        } else {
            int uangKoin = karakter.getUangKoin() - barangJualan.getNilai();
            karakter.tambahBarang(barangJualan);
            karakter.setUangKoin(uangKoin);
            System.out.println(karakter.getNama() + " telah membeli barang " + barangJualan.getNama() + " seharga " + barangJualan.getNilai() + " koin.");
            System.out.println("Sisa koin " + karakter.getNama() + " adalah " + karakter.getUangKoin() + " koin.");
        }
    }

    // Method untuk mendapatkan informasi NPC
    public void getInfo() {
        // Informasi NPC
        System.out.println("Profil NPC:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        
        // Daftar Barang yang Dijual
        System.out.println("\nDaftar Barang yang Dijual:");
        System.out.println("============================================");
        System.out.println("| No | Nama Barang       | Harga           |");
        System.out.println("============================================");
        for (int i = 0; i < barangJualan.size(); i++) {
            Barang barang = barangJualan.get(i);
            System.out.printf("| %-2d | %-17s | %-16d|\n", i + 1, barang.getNama(), barang.getNilai());
        }
        System.out.println("============================================");
        
        // Quest
        if (quest != null) {
            System.out.println("\nQuest yang Tersedia:");
            System.out.println("Nama Quest: " + quest.getNama());
            System.out.println("Deskripsi: " + quest.getDeskripsi());
        } else {
            System.out.println("\nTidak ada quest yang tersedia saat ini.");
        }
        System.out.println("-------------------------------------------\n");
    }
}
