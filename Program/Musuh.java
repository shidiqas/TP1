/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal TP1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
import java.util.ArrayList;

public class Musuh extends NPC {// Kelas Musuh, turunan dari kelas NPC
    private int HP;// Atribut HP
    private int ATK;// Atribut ATK
    private Senjata senjata;// Atribut senjata
    private ArrayList<Barang> hadiah;// Atribut hadiah

    public Musuh(int HP, Senjata senjata, int ATK, String nama, char jenisKelamin) {// Konstruktor
        super(nama, jenisKelamin);
        this.HP = HP;
        this.senjata = senjata;
        this.ATK = ATK + senjata.getKekuatan();
        this.hadiah = new ArrayList<>();
    }

    // Getter-Setter
    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getATK() {
        return ATK;
    }

    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public Senjata getSenjata() {
        return senjata;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public ArrayList<Barang> getHadiah() {
        return hadiah;
    }

    public void setHadiah(ArrayList<Barang> hadiah) {
        this.hadiah = hadiah;
    }

    // Method untuk melakukan serangan terhadap karakter
    public void serang(Karakter karakter) {
        int damage = ATK;    
        karakter.setHP(karakter.getHP() - damage);
        System.out.println(getNama() + " :Rasakan ini!");
        System.out.println(getNama() + " menyerang " + karakter.getNama() + " dan menyebabkan " + damage + " kerusakan");
        if (karakter.isMati()) {
            bicara();
            System.out.println(karakter.getNama() + " telah mati.\n");
        } else {
            System.out.println("Sisa darah " + karakter.getNama() + " sebesar " + karakter.getHP() + ".\n");
        }
    }

    // Method untuk mengecek apakah musuh sudah mati atau belum
    public boolean isMati() {
        return HP <= 0;
    }

    // Method untuk bicara
    public void bicara() {
        System.out.println(getNama() + " :Kau tidak bisa mengalahkanku!");
    }

    // Method untuk mendapatkan informasi Musuh
    public void getInfo() {
        // Informasi Musuh
        System.out.println("Profil Musuh:");
        System.out.println("Nama: " + getNama());
        System.out.println("Jenis Kelamin: " + getJenisKelamin());
        System.out.println("HP: " + HP);
        System.out.println("ATK: " + ATK);
        System.out.println("Senjata: " + senjata.getNama());
        // Daftar Hadiah
        System.out.println("\nDaftar Hadiah:");
        System.out.println("==========================================");
        System.out.println("| No | Nama Barang     | Nilai           |");
        System.out.println("==========================================");
        for (int i = 0; i < hadiah.size(); i++) {
            Barang barang = hadiah.get(i);
            System.out.printf("| %-2d | %-15s | %-16d|\n", i + 1, barang.getNama(), barang.getNilai());
        }
        System.out.println("==========================================\n");
    }
}
