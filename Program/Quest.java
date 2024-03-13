/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal TP1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
import java.util.ArrayList;

public class Quest {// Kelas Quest
    private String nama;// Atribut nama
    private String deskripsi;// Atribut deskripsi
    private ArrayList<Barang> hadiahBarang;// Atribut hadiahBarang
    private int hadiahKoin;// Atribut hadiahKoin

    public Quest(String nama, String deskripsi, ArrayList<Barang> hadiahBarang, int hadiahKoin) {// Konstruktor
        this.nama = nama;
        this.deskripsi = deskripsi;
        this.hadiahBarang = hadiahBarang;
        this.hadiahKoin = hadiahKoin;
    }

    // Getter-Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public ArrayList<Barang> getHadiahBarang() {
        return hadiahBarang;
    }

    public void setHadiahBarang(ArrayList<Barang> hadiahBarang) {
        this.hadiahBarang = hadiahBarang;
    }

    public int getHadiahKoin() {
        return hadiahKoin;
    }

    public void setHadiahKoin(int hadiahKoin) {
        this.hadiahKoin = hadiahKoin;
    }
}