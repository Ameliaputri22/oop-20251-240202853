# Laporan Praktikum Minggu 2 Bab 2 – Class dan Object (Produk Pertanian)

## Identitas
- Nama  : Amelia Putri Azzahra 
- NIM   : 240202853
- Kelas : 3Ikra 

---

## Tujuan

Mahasiswa mampu menjelaskan konsep class, object, atribut, dan method dalam OOP.
Mahasiswa mampu menerapkan access modifier dan enkapsulasi dalam pembuatan class.
Mahasiswa mampu mengimplementasikan class Produk pertanian dengan atribut dan method yang sesuai.
Mahasiswa mampu mendemonstrasikan instansiasi object serta menampilkan data produk pertanian di console.
Mahasiswa mampu menyusun laporan praktikum dengan bukti kode, hasil eksekusi, dan analisis sederhana.

---

## Dasar Teori

Class adalah blueprint atau cetak biru dari sebuah objek. Objek merupakan instansiasi dari class yang berisi atribut (data) dan method (perilaku). Dalam OOP, enkapsulasi dilakukan dengan menyembunyikan data menggunakan access modifier (public, private, protected) serta menyediakan akses melalui getter dan setter.

Dalam konteks Agri-POS, produk pertanian seperti benih, pupuk, dan alat pertanian dapat direpresentasikan sebagai objek yang memiliki atribut nama, harga, dan stok. Dengan menggunakan class, setiap produk dapat dibuat, dikelola, dan dimanipulasi secara lebih terstruktur.
---

## Langkah Praktikum
1.Membuat Class Produk

Buat file Produk.java pada package model.
Tambahkan atribut: kode, nama, harga, dan stok.
Gunakan enkapsulasi dengan menjadikan atribut bersifat private dan membuat getter serta setter untuk masing-masing atribut.
2.Membuat Class CreditBy

Buat file CreditBy.java pada package util.
Isi class dengan method statis untuk menampilkan identitas mahasiswa di akhir output: credit by: <NIM> - <Nama>.
3.Membuat Objek Produk dan Menampilkan Credit

Buat file MainProduk.java.
Instansiasi minimal tiga objek produk, misalnya "Benih Padi", "Pupuk Urea", dan satu produk alat pertanian.
Tampilkan informasi produk melalui method getter.
Panggil CreditBy.print("<NIM>", "<Nama>") di akhir main untuk menampilkan identitas.
4.Commit dan Push

Commit dengan pesan: week2-class-object.

---

## Kode Program
1. Produk.java
package com.upb.agripos.model;

public class Produk {
    private String kode;
    private String nama;
    private double harga;
    private int stok;

    public Produk(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public int getStok() { return stok; }
    public void setStok(int stok) { this.stok = stok; }

    public void tambahStok(int jumlah) {
        this.stok += jumlah;
    }

    public void kurangiStok(int jumlah) {
        if (this.stok >= jumlah) {
            this.stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi!");
        }
    }
}
2. CreditBy.java
package com.upb.agripos.util;

public class CreditBy {
    public static void print(String nim, String nama) {
        System.out.println("\ncredit by: " + nim + " - " + nama);
    }
}
3. MainProduk.java
package com.upb.agripos;

import com.upb.agripos.model.Produk;
import com.upb.agripos.util.CreditBy;

public class MainProduk {
    public static void main(String[] args) {
        Produk p1 = new Produk("BNH-001", "Benih Padi IR64", 25000, 100);
        Produk p2 = new Produk("PPK-101", "Pupuk Urea 50kg", 350000, 40);
        Produk p3 = new Produk("ALT-501", "Cangkul Baja", 90000, 15);

        System.out.println("Kode: " + p1.getKode() + ", Nama: " + p1.getNama() + ", Harga: " + p1.getHarga() + ", Stok: " + p1.getStok());
        System.out.println("Kode: " + p2.getKode() + ", Nama: " + p2.getNama() + ", Harga: " + p2.getHarga() + ", Stok: " + p2.getStok());
        System.out.println("Kode: " + p3.getKode() + ", Nama: " + p3.getNama() + ", Harga: " + p3.getHarga() + ", Stok: " + p3.getStok());

        // Tampilkan identitas mahasiswa
        CreditBy.print("<NIM>", "<Nama Mahasiswa>");
    }
}

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis


## Kesimpulan
Kesimpulan singkat dari praktikum class dan objek di VS Code adalah bahwa praktikum ini berhasil memberikan pemahaman praktis mengenai konsep dasar pemrograman berorientasi objek (PBO). Praktikan mampu mendemonstrasikan cara:
Mendefinisikan Class: Membuat struktur dasar atau "cetak biru" (blueprint) menggunakan sintaks bahasa pemrograman yang relevan di VS Code.
Menciptakan Objek (Instantiation): Mengimplementasikan class yang telah dibuat menjadi objek nyata (instance) dengan properti dan metode yang spesifik.
Menggunakan Fitur VS Code: Memanfaatkan fitur editor seperti syntax highlighting, autocomplete, dan debugging untuk menulis, menguji, dan memahami interaksi antara objek dan class secara efisien.
## Quiz
1.Mengapa atribut sebaiknya dideklarasikan sebagai private dalam class?
Jawaban:Atribut sebaiknya dideklarasikan sebagai private untuk mempraktikkan enkapsulasi, yaitu menyembunyikan detail implementasi internal dan melindungi data dari akses atau modifikasi yang tidak sah. Ini memungkinkan kontrol yang lebih besar atas bagaimana data diubah, mencegah perubahan yang tidak disengaja, meningkatkan keamanan, dan mempermudah pemeliharaan kode

2.Apa fungsi getter dan setter dalam enkapsulasi?
Jawaban:Fungsi getter adalah untuk mengambil (membaca) nilai dari variabel privat secara terkontrol, sementara fungsi setter adalah untuk mengubah (menulis) nilai dari variabel tersebut dengan logika validasi tambahan. Keduanya memastikan integritas data dengan menjaga data tetap tersembunyi dan melindungi status internal objek dari akses langsung dari luar kelas.

3.Bagaimana cara class Produk mendukung pengembangan aplikasi POS yang lebih kompleks?
Jawaban:Class Produk mendukung pengembangan aplikasi POS yang lebih kompleks dengan menyimpan informasi produk yang detail, seperti varian, stok, dan harga, yang dapat dihubungkan dengan fitur-fitur lain seperti inventaris, promosi, dan pelaporan. Class ini memungkinkan pengelolaan stok yang lebih terperinci dan pelacakan data produk yang dinamis, mendukung kebutuhan bisnis yang lebih besar dan operasional yang rumit seperti multi-outlet, multi-metode pembayaran, dan integrasi dengan sistem lain. 
