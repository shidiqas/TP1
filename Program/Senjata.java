/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal TP1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
public class Senjata {// Kelas Senjata
    private String nama;// Atribut nama
    private String jenis;// Atribut jenis
    private int kekuatan;// Atribut kekuatan

    public Senjata(String nama, String jenis, int kekuatan) {// Konstruktor
        this.nama = nama;
        this.jenis = jenis;
        this.kekuatan = kekuatan;
    }

    // Getter-Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }

    // Method getInfo (memberikan tampilan dari atribut senjata)
    public String getInfo() {
        return "Senjata: " + nama + "\nJenis: " + jenis + "\nKekuatan: " + kekuatan;
    }
}