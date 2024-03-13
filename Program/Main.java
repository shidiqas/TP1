/*
Saya Shidiq Arifin Sudrajat [2202152] mengerjakan soal TP1 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin
*/
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Membuat Senjata
        System.err.println("|---------------Membuat Senjata-----------------|");
        Senjata pedang = new Senjata("Pedang", "Pedang", 80);
        Senjata dagger = new Senjata("Dagger", "Dagger", 60);
        Senjata tongkatSihir = new Senjata("Tongkat Sihir", "Tongkat", 30);
        System.out.println(pedang.getInfo());
        System.out.println(dagger.getInfo());
        System.out.println(tongkatSihir.getInfo());
        // Membuat karakter
        System.err.println("|---------------Membuat Karakter----------------|");
        Karakter nova = new Karakter("Nova", 'M', pedang, "Penyerang", "Rage", 500, 200);
        Karakter jane = new Karakter("Jane", 'F', tongkatSihir, "Penyembuh", "Heal", 600, 100);
        Karakter sora = new Karakter("Sora", 'M', dagger, "Penyerang", "Rage", 550, 250);
        Karakter aloy = new Karakter("Aloy", 'F', tongkatSihir, "Penyembuh", "Heal", 450, 150);

        nova.getInfo();
        jane.getInfo();
        sora.getInfo();
        aloy.getInfo();

        // Membuat NPC
        System.err.println("|-----------------Membuat NPC-------------------|");
        NPC adrian = new NPC("Adrian", 'M');
        NPC lyra = new NPC("Lyra", 'F');

        // Menambahkan barang jualan pada NPC
        ArrayList<Barang> barangJualanAdrian = new ArrayList<>();
        ArrayList<Barang> barangJualanLyra = new ArrayList<>();
        
        // Barang jualan Adrian
        Barang LiontinRuby = new Barang("Liontin Ruby", "Aksesoris", 300);
        Barang pedangBesar = new Barang("Pedang Besar", "Senjata", 150);
        Barang ArmorBesi = new Barang("Armor Besi", "Armor", 350);
        Barang ArmorKulit = new Barang("Armor Kulit", "Armor", 100);
        barangJualanAdrian.add(LiontinRuby);
        barangJualanAdrian.add(pedangBesar);
        barangJualanAdrian.add(ArmorBesi);
        barangJualanAdrian.add(ArmorKulit);
        adrian.setBarangJualan(barangJualanAdrian);

        // Barang jualan Lyra
        Barang ramuanPenyembuh = new Barang("Ramuan Penyembuh", "Ramuan", 50);
        Barang ramuanAmarah = new Barang("Ramuan Amarah", "Ramuan", 50);
        Barang lentera = new Barang("Lentera", "Biasa", 50);
        barangJualanLyra.add(ramuanPenyembuh);
        barangJualanLyra.add(ramuanAmarah);
        barangJualanLyra.add(lentera);
        lyra.setBarangJualan(barangJualanLyra);
        // Membuat quest
        ArrayList<Barang> hadiahQuest = new ArrayList<>();
        hadiahQuest.add(ramuanPenyembuh);
        hadiahQuest.add(ArmorKulit);
        hadiahQuest.add(lentera);
        //Menambahkan quest ke NPC Adrian
        Quest questAdrian = new Quest("Misi Penyelamatan", "Menyelamatkan desa dari serangan monster", hadiahQuest, 750);
        adrian.setQuest(questAdrian);

        adrian.getInfo();
        lyra.getInfo();
        // Karakter mengambil quest dari NPC Adrian
        System.err.println("*Nova, Jane, Sora dan Aloy mengambil quest dari Adrian*");
        nova.ambilQuest(adrian.getQuest());
        jane.ambilQuest(adrian.getQuest());
        sora.ambilQuest(adrian.getQuest());
        aloy.ambilQuest(adrian.getQuest());
        // Karakter membeli barang dari NPC
        System.err.println("*Nova, Jane, Sora dan Aloy membeli barang dari NPC*");
        System.err.println("*Nova membeli Liontin Ruby dan Armor Besi dari Adrian*");
        adrian.getInfo();
        nova.beliBarang(nova, LiontinRuby, adrian);
        nova.beliBarang(nova, ArmorBesi, adrian);
        System.err.println("\n*Jane, Sora dan Aloy membeli Ramuan dari Lyra*");
        lyra.getInfo();
        jane.beliBarang(jane, ramuanPenyembuh, lyra);
        sora.beliBarang(sora, ramuanAmarah, lyra);
        aloy.beliBarang(aloy, ramuanPenyembuh, lyra);
        System.err.println("|--------------Informasi Karakter---------------|");
        nova.getInfo();
        jane.getInfo();
        sora.getInfo();
        aloy.getInfo();

        //Membuat Musuh
        System.err.println("|----------------Membuat Musuh------------------|");
        Senjata paluThor = new Senjata("Palu Thor", "Palu", 100);
        Musuh thor = new Musuh(2000, paluThor, 300, "Thor", 'M');
        ArrayList<Barang> hadiahThor = new ArrayList<>();
        Barang armorThor = new Barang("Armor Thor", "Aksesoris", 750);
        Barang paluThorDrop = new Barang("Palu Thor", "Senjata", 1500);
        Barang helmThor = new Barang("Helm Thor", "Armor", 1200);
        hadiahThor.add(armorThor);
        hadiahThor.add(paluThorDrop);
        hadiahThor.add(helmThor);
        thor.setHadiah(hadiahThor);

        thor.getInfo();
        // Pertempuran
        System.err.println("*Nova, Jane, Sora dan Aloy bertemu dengan NPC jahat bernama Thor dan bertarung dengannya*");
        nova.serang(thor);
        thor.serang(nova);
        nova.useSkill("Rage", nova);
        nova.serang(thor);
        jane.serang(thor);
        thor.serang(jane);
        sora.serang(thor);
        thor.serang(sora);
        aloy.serang(thor);
        thor.serang(aloy);
        thor.serang(aloy);
        nova.serang(thor);
        jane.useSkill("Heal", sora);
        sora.useSkill("Rage", sora);
        sora.serang(thor);

        System.err.println("*Nova, Jane, Sora dan Aloy bertarung sengit dengan Thor. Hasilnya Aloy mati dalam pertarungan tersebut.");
        System.out.println("Tetapi pada Akhirnya Sora mengalahkan Thor setelah dia menggunakan Skill Rage dan memberikan serangan terakhir.");
        System.out.println("Sora pun mendapatkan item yang didapat setelah membunuh Thor.*\n");
        System.out.println("*Setelah menunggu Aloy Respawn, mereka berempat melanjutkan petualangannya di game tersebut.*");
    }
}
