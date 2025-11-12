# Laporan Praktikum Minggu 4
Topik:Polymorphism (Info Produk)
## Identitas
- Nama  : [Amelia Putri Azzahra]
- NIM   : [240202853]
- Kelas : [3IKRA]

---

## Tujuan
1. Memahami konsep polymorphism Mahasiswa mampu menjelaskan bahwa polymorphism adalah kemampuan suatu objek untuk memiliki banyak bentuk — yaitu, satu referensi superclass dapat digunakan untuk memanggil method yang dimiliki subclass. 
2.Menerapkan polymorphism dalam kode program Mahasiswa dapat membuat program yang menunjukkan bahwa method yang sama (misalnya tampilkanInfo()) dapat memiliki perilaku berbeda tergantung pada jenis objek yang memanggilnya (Benih, Pupuk, AlatPertanian, dll).
3.Menggunakan pewarisan (inheritance) dan overriding Mahasiswa mampu menerapkan konsep inheritance antara superclass Produk dan subclass-nya, lalu melakukan method overriding untuk menampilkan informasi produk sesuai jenisnya.
4.Melatih penggunaan referensi superclass Mahasiswa dapat mendeklarasikan array atau daftar dari tipe Produk, lalu mengisinya dengan berbagai objek subclass — kemudian memanggil method yang sama (deskripsi() / infoProduk()) untuk menunjukkan efek polymorphism.
5.Meningkatkan kemampuan berpikir OOP terstruktur Mahasiswa dapat memahami hubungan antar kelas, reusability kode, serta manfaat polymorphism dalam membuat program yang lebih efisien, modular, dan mudah dikembangkan.

---

## Dasar Teori
Secara etimologis, polymorphism berasal dari bahasa Yunani:Poly = banyak dan Morph = bentuk. Jadi, polymorphism berarti “banyak bentuk”. Dalam Pemrograman Berorientasi Objek (PBO), polymorphism adalah kemampuan objek yang berbeda untuk merespons panggilan method yang sama dengan cara yang berbeda sesuai jenis objeknya. Konsep Polymorphism dalam OOP terjadi ketika: -Sebuah kelas induk (superclass) memiliki method yang sama namanya dengan yang dimiliki oleh kelas turunan (subclass), namun isinya berbeda. -Saat method dipanggil melalui referensi superclass, Java atau C# akan menentukan method mana yang dijalankan berdasarkan objek sebenarnya, bukan berdasarkan tipe referensinya.Dalam konteks praktikum Info Produk, polymorphism digunakan agar kelas induk Produk dapat memiliki beberapa kelas turunan seperti Benih, Pupuk, dan AlatPertanian yang menimpa (override) method infoProduk() dengan isi berbeda.

---

## Langkah Praktikum
Overloading Tambahkan method tambahStok(int jumlah) dan tambahStok(double jumlah) pada class Produk. 2.Overriding -Tambahkan method getInfo() pada superclass Produk. -Override method getInfo() pada subclass Benih, Pupuk, dan AlatPertanian. 3.Dynamic Binding -Buat array Produk[] daftarProduk yang berisi objek Benih, Pupuk, dan AlatPertanian. -Loop array tersebut dan panggil getInfo(). Perhatikan bagaimana Java memanggil method sesuai jenis objek aktual. 4.Main Class Buat MainPolymorphism.java untuk mendemonstrasikan overloading, overriding, dan dynamic binding. 5.CreditBy Tetap panggil CreditBy.print("", ""). 6Commit dan Push dengan pesan: week4-polymorphism.

---

## Kode Program
1.Produk.java (Overloading & getInfo default)
  public Produk(String kode, String nama, double harga, int stok) {
    this.kode = kode;
    this.nama = nama;
    this.harga = harga;
    this.stok = stok;
}

public void tambahStok(int jumlah) {
    this.stok += jumlah;
}

public void tambahStok(double jumlah) {
    this.stok += (int) jumlah;
}

public String getInfo() {
    return "Produk: " + nama + " (Kode: " + kode + ")";
}
2.Benih.java (Overriding)
public Benih(String kode, String nama, double harga, int stok, String varietas) {
    super(kode, nama, harga, stok);
    this.varietas = varietas;
}

@Override
public String getInfo() {
    return "Benih: " + super.getInfo() + ", Varietas: " + varietas;
}
3.MainPolymorphism.java
    for (Produk p : daftarProduk) {
        System.out.println(p.getInfo()); // Dynamic Binding
    }

    CreditBy.print("<NIM>", "<Nama Mahasiswa>");

---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
1.Pada praktikum ini, program menggunakan konsep polymorphism di mana kelas induk Produk memiliki method infoProduk() yang di-override oleh masing-masing subclass seperti Benih, Pupuk, dan AlatPertanian. Ketika objek subclass dipanggil melalui referensi bertipe Produk, Java menentukan method yang dijalankan berdasarkan objek sebenarnya (dynamic binding).Hal ini membuat program dapat menampilkan informasi produk yang berbeda meskipun menggunakan referensi yang sama (Produk). 
2.Kode berjalan karena: *Setiap subclass mewarisi atribut dan method dari superclass Produk. *Method infoProduk() di subclass menggunakan @Override, sehingga Java tahu method tersebut menimpa method di superclass. *Saat program dijalankan, Java melakukan dynamic binding untuk memanggil method sesuai objek aktual, bukan tipe referensi. Dengan struktur ini, polymorphism dapat bekerja dengan baik, dan program bisa menampilkan informasi berbeda tanpa harus membuat banyak variabel atau kondisi if-else. 
3.Kendala yang Ditemui *Error “method not found” atau “incompatible types” karena penulisan method atau parameter tidak sama antara superclass dan subclass. *Lupa menambahkan keyword @Override, sehingga method tidak dianggap sebagai overriding oleh Java. *Kesalahan logika saat membuat array objek dari berbagai subclass 
4.Cara Mengatasinya *Pastikan nama method, parameter, dan tipe kembalian sama persis antara superclass dan subclass. *Gunakan @Override untuk memastikan method overriding terdeteksi dengan benar. *Cek kembali tipe referensi dan tipe objek agar sesuai dengan konsep inheritance. *Jalankan program secara bertahap (compile dan test per class) untuk memudahkan pengecekan error. 
5.Kesimpulan Analisis Program Polymorphism (Info Produk) berjalan dengan baik karena menerapkan konsep inheritance dan method overriding dengan benar. Polymorphism membuat program menjadi dinamis, mudah dikembangkan, dan efisien, sedangkan kendala umum dapat diatasi dengan memastikan struktur pewarisan dan penulisan method sesuai aturan Java.

---

## Kesimpulan
Dari hasil praktikum dapat disimpulkan bahwa polymorphism memungkinkan satu method yang sama digunakan oleh berbagai objek dengan perilaku yang berbeda sesuai kelasnya. Pada program Info Produk, method infoProduk() di-override oleh masing-masing subclass (Benih, Pupuk, AlatPertanian) sehingga setiap objek dapat menampilkan informasi produk yang berbeda.

Dengan demikian, konsep polymorphism membuat program menjadi lebih fleksibel, mudah dikembangkan, dan efisien dalam pengelolaan berbagai jenis objek.

---

## Quiz
(1.  Apa perbedaan overloading dan overriding? 
   **Jawaban:** …  overloading Membuat beberapa method dengan nama sama tetapi parameter berbeda dalam satu kelas yang bertujuan Untuk meningkatkan kemudahan penggunaan (metode yang sama bisa dipanggil dengan cara berbeda).Compile-time (dikenal juga sebagai static polymorphism). 
   overriding Menulis ulang (menimpa) method dari superclass di dalam subclass dengan isi (implementasi) yang berbeda.Yang bertujuan Untuk mengubah perilaku method yang diwarisi dari superclass.Terjadi di antara dua kelas yang memiliki hubungan inheritance (pewarisan).Runtime (dikenal juga sebagai dynamic polymorphism).Keyword @Override diperlukan (untuk menandakan method menimpa method induk).

2. Bagaimana Java menentukan method mana yang dipanggil dalam dynamic binding? 
   **Jawaban:**Dalam dynamic binding (late binding), Java menentukan method mana yang dipanggil berdasarkan objek sebenarnya (runtime type), bukan berdasarkan tipe referensinya (compile-time type). Artinya: -Saat program dikompilasi, Java hanya tahu bahwa variabel itu bertipe superclass. -Tapi saat dijalankan, Java melihat objek yang sebenarnya dan memanggil method milik kelas objek tersebut.Inilah yang memungkinkan polymorphism bekerja — satu referensi superclass bisa memanggil method berbeda tergantung objeknya. Inilah yang memungkinkan polymorphism bekerja — satu referensi superclass bisa memanggil method berbeda tergantung objeknya

3. Berikan contoh kasus polymorphism dalam sistem POS selain produk pertanian
   **Jawaban:** …Dalam sebuah sistem kasir (POS), ada berbagai jenis produk yang dijual, lalu menurunkannya menjadi beberapa subclass seperti: Makanan 🍞,Minuman 🧃,Barang Elektronik ⚡ Semua jenis produk memiliki informasi dasar yang sama, seperti nama dan harga. Namun, setiap jenis produk memiliki cara menampilkan informasi yang berbeda (misalnya, tanggal kedaluwarsa hanya untuk makanan/minuman, dan garansi hanya untuk elektronik).Pada sistem POS ini, polymorphism memungkinkan method infoProduk() menampilkan informasi yang berbeda sesuai jenis produk, walaupun semua objek disimpan dalam array bertipe superclass Produk. Hal ini membuat sistem kasir lebih fleksibel dan mudah diperluas tanpa mengubah struktur utama program.
