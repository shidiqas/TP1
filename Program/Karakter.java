/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal TP1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
import java.util.ArrayList;

public class Karakter {// Kelas Karakter
    private String nama;// Atribut nama
    private char jenisKelamin;// Atribut jenisKelamin
    private Senjata senjata;// Atribut senjata
    private String role;// Atribut role
    private String skill;// Atribut skill
    private int HP;// Atribut HP
    private int ATK;// Atribut ATK
    private int uangKoin;// Atribut uangKoin
    private ArrayList<Barang> barang;// Atribut barang
    private Quest quest;// Atribut quest

    public Karakter(String nama, char jenisKelamin, Senjata senjata, String role, String skill, int HP, int ATK) {// Konstruktor
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.senjata = senjata;
        this.role = role;
        this.skill = skill;
        this.HP = HP;
        this.ATK = ATK + senjata.getKekuatan();
        this.uangKoin = 0;
        this.barang = new ArrayList<>();
        this.quest = null;
    }

    // Getter-Sette
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

    public Senjata getSenjata() {
        return senjata;
    }

    public void setSenjata(Senjata senjata) {
        this.senjata = senjata;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

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

    public int getUangKoin() {
        return uangKoin;
    }

    public void setUangKoin(int uangKoin) {
        this.uangKoin = uangKoin;
    }

    public ArrayList<Barang> getBarang() {
        return barang;
    }

    public void setBarang(ArrayList<Barang> barang) {
        this.barang = barang;
    }

    // Method untuk menambah barang ke dalam daftar barang
    public void tambahBarang(Barang barangBaru) {
        barang.add(barangBaru);
    }

    // Method untuk mengecek apakah karakter sudah mati atau belum
    public boolean isMati() {
        return HP <= 0;
    }

    // Method untuk melakukan serangan terhadap musuh
    public void serang(Musuh target) {
        int damage = ATK;
        target.setHP(target.getHP() - damage);
        System.out.println(getNama() + " menyerang " + target.getNama() + " dan menyebabkan " + damage + " kerusakan");
        if (target.isMati()) {
            System.out.println(target.getNama() + " telah mati. Anda mendapatkan barang dari " + target.getNama() + "\n");
            barang.addAll(target.getHadiah());
        } else {
            System.out.println("Sisa darah " + target.getNama() + " sebesar " + target.getHP() + ".\n");
        }
    }

    // Method untuk menggunakan skill
    public void useSkill(String skill, Karakter target) {
        if (skill.equals("Rage")) {
            tambahATK(target);
            System.err.println(target.getNama() + " melakukan skill Rage.");
            System.err.println("ATK " + target.getNama() + " bertambah menjadi " + target.getATK() + ".\n");
        } else if (skill.equals("Heal")) {
            tambahHP(target);
            System.err.println(target.getNama() + " menerima skill Heal dari temannya.");
            System.err.println("HP " + target.getNama() + " bertambah menjadi " + target.getHP() + ".\n");
        }
    }

    // Method untuk menambah HP karakter
    public void tambahHP(Karakter karakter) {
        karakter.HP += 350;
    }

    // Method untuk menambah ATK karakter
    public void tambahATK(Karakter karakter) {
        karakter.ATK += 100;
    }

    // Method untuk membeli barang dari NPC
    public void beliBarang(Karakter karakter, Barang barang, NPC npc) {
        npc.jualBarang(karakter, barang);
    }

    // Method untuk mengambil quest dari NPC
    public void ambilQuest(Quest questBaru) {
        quest = questBaru;
        System.out.println(getNama() + " telah mengambil quest " + quest.getNama() + ".");
        System.out.println(getNama() + " sedang menyelesaikan quest...");
        System.out.println(getNama() + " telah berhasil menyelamatkan quest " + quest.getNama() + " dan mendapatkan hadiah barang dan koin sebesar " + quest.getHadiahKoin() + " koin.\n");
        barang.addAll(quest.getHadiahBarang());
        uangKoin += quest.getHadiahKoin();
        quest = null;
    }

    // Method untuk mendapatkan informasi karakter
    public void getInfo() {
        // Informasi Karakter
        System.out.println("Profil Karakter:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Senjata: " + senjata.getNama());
        System.out.println("Role: " + role);
        System.out.println("Skill: " + skill);
        System.out.println("HP: " + HP);
        System.out.println("ATK: " + ATK);
        System.out.println("Uang Koin: " + uangKoin);
        
         // Daftar Barang yang Dimiliki
        System.out.println("\nDaftar Barang yang Dimiliki:");
        if (barang.isEmpty()) {
            System.out.println("Tidak ada barang yang dimiliki saat ini.");
        } else {
            System.out.println("==========================");
            System.out.println("| No | Nama Barang       |");
            System.out.println("==========================");
            for (int i = 0; i < barang.size(); i++) {
                Barang barangNow = barang.get(i);
                System.out.printf("| %-2d | %-17s |\n", i + 1, barangNow.getNama());
            }
            System.out.println("==========================");
        }
        
        // Quest yang Sedang Diambil
        if (quest != null) {
            System.out.println("\nQuest yang Sedang Diambil:");
            System.out.println("Nama Quest: " + quest.getNama());
            System.out.println("Deskripsi: " + quest.getDeskripsi());
        } else {
            System.out.println("\nTidak ada quest yang sedang diambil saat ini.");
        }        

        System.out.println("-------------------------------------------\n");
    }
}
