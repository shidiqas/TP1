/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal TP1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
public class Barang {//Kelas Barang
    private String nama;//Atribut nama
    private String jenis;//Atribut jenis
    private int nilai;//Atribut nilai

    public Barang(String nama, String jenis, int nilai) {//Konstruktor
        this.nama = nama;
        this.jenis = jenis;
        this.nilai = nilai;
    }
    //Getter-Setter
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

    public int getNilai() {
        return nilai;
    }

    public void setNilai(int nilai) {
        this.nilai = nilai;
    }
    //Method get info (memberikan tampilan dari atribut barang)
    public String getInfo() {
        return "Barang: " + nama + "\nJenis: " + jenis + "\nNilai: " + nilai;
    }
}
