# Laporan Praktikum Minggu ke 5 Abstraction interface.

## Identitas
- Nama  : [Amelia Putri Azzahra]
- NIM   : [240202853]
- Kelas : [3IKRA]

---

## Tujuan1.
1. Memahami konsep Abstraction dalam Pemrograman Berorientasi Objek (OOP), yaitu kemampuan menyembunyikan detail implementasi dan hanya menampilkan fitur penting kepada pengguna.
2. Mampu menjelaskan perbedaan antara Abstract Class dan Interface, dari sisi konsep, penggunaan, dan karakteristiknya dalam struktur program.
3.Menerapkan teknik inheritance dan polymorphism melalui penggunaan abstract method dan interface method.
4.Melatih kemampuan membuat desain kelas dengan memisahkan definisi perilaku (interface) dan kerangka dasar objek (abstract class).
---

## Dasar Teori
1.Abstraction adalah salah satu pilar utama dalam pemrograman berorientasi objek (OOP) yang bertujuan untuk menyembunyikan detail implementasi dan hanya menampilkan fitur penting dari sebuah objek.
2.Abstract class adalah kelas yang tidak dapat dibuat objeknya secara langsung, tetapi berfungsi sebagai kerangka dasar untuk kelas turunan.Di dalam abstract class dapat terdapat:
-Method biasa (memiliki implementasi)
-Method abstract (hanya deklarasi, tanpa body)
Ciri–ciri Abstract Class :
-Digunakan sebagai class induk.
-Mengandung minimal satu method abstract.
-Kelas turunannya wajib mengoverride method abstract.
-Bisa memiliki atribut, konstruktor, dan method biasa.
-Mendukung inheritance (extends).
3.Interface adalah “kontrak” berisi kumpulan method tanpa implementasi yang harus diisi oleh kelas yang mengimplementasikannya.
Interface digunakan untuk mendefinisikan perilaku yang dapat dimiliki oleh berbagai objek berbeda.Ciri–ciri Interface
-Semua method secara default abstract.
-Tidak memiliki konstruktor.
-Tidak dapat memiliki atribut, hanya konstanta (final static).
-Kelas yang mengimplementasi interface wajib mengisi semua method.
-Mendukung multiple inheritance (satu kelas dapat mengimplementasi banyak interface)
---
## Langkah Praktikum
1. Abstract Class – Pembayaran
   Buat Pembayaran (abstract) dengan field invoiceNo, total dan method:
-double biaya() (abstrak) → biaya tambahan (fee).
-boolean prosesPembayaran() (abstrak) → mengembalikan status berhasil/gagal.
-double totalBayar() (konkrit) → return total + biaya();.
2. Subclass Konkret
-Cash → biaya = 0, proses = selalu berhasil jika tunai >= totalBayar().
-EWallet → biaya = 1.5% dari total; proses = membutuhkan validasi.
3. Interface
-Validatable → boolean validasi(); (contoh: OTP).
-Receiptable → String cetakStruk();
4.Multiple Inheritance via Interface
-EWallet mengimplementasikan dua interface: Validatable, Receiptable.
-Cash setidaknya mengimplementasikan Receiptable.
5.Main Class
-Buat MainAbstraction.java untuk mendemonstrasikan pemakaian Pembayaran (polimorfik).
-Tampilkan hasil proses dan struk. Di akhir, panggil CreditBy.print("[NIM]", "[Nama]").
6.Commit dan Push .Commit dengan pesan: week5-abstraction-interface.
---

## Kode Program

---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
(a.)Pada praktikum Abstraction (Abstract Class & Interface), kode berjalan melalui mekanisme pewarisan dan implementasi kontrak perilaku.
Ketika program dieksekusi:
   -Abstract class berfungsi sebagai kerangka dasar. Kelas turunan membuat objek dan menjalankan method yang berasal dari abstract class.
Method abstract yang ada di superclass akan dioverride oleh subclass sehingga setiap kelas memiliki implementasi masing-masing.
   -Interface memberikan serangkaian method yang harus diimplementasikan. Ketika sebuah objek dibuat dari kelas yang mengimplementasi interface, objek tersebut wajib menyediakan definisi semua method yang ada di interface.
   - Program kemudian mengakses objek menggunakan polymorphism — yaitu memanggil method melalui referensi abstract atau interface, namun yang dijalankan adalah implementasi di kelas sebenarnya.
b.)Perbedaan Pendekatan Minggu Ini Dibanding Minggu Sebelumnya
* Minggu ini (Abstraction – Abstract Class & Interface):
   -Fokus pada menyembunyikan detail implementasi dan menyediakan kerangka umum.
   -Menggunakan abstract class sebagai blueprint dasar.
   -Menggunakan interface untuk mendefinisikan perilaku tanpa struktur.
   -Menekankan penggunaan polymorphism, konsep kontrak, dan “kerangka besar” desain kelas.
   -Kode menjadi lebih fleksibel karena kelas dapat mengimplementasi banyak interface.

* Minggu sebelumnya (biasanya Inheritance, Class & Object dasar):
-Fokus pada pewarisan sederhana antara parent–child.
-Semua method memiliki implementasi penuh.
-Tidak ada konsep kontrak atau method abstract.
-Lebih menekankan pemahaman dasar OOP seperti atribut, method, dan pembentukan objek.
-Struktur kode lebih sederhana dan biasanya lebih linear.
 c.)Kendala yang Dihadapi dan Cara Mengatasinya
Berikut contoh kendala yang umum terjadi saat praktikum:
       a. Error karena abstract method belum dioverride
Masalah: Kelas turunan tidak mengimplementasi semua method abstract/interface.
Solusi: Gunakan fitur auto-generate method di VS Code (klik lampu kuning > Implement methods).
       b. Bingung kapan menggunakan abstract class dan kapan menggunakan interface
Solusi:Gunakan abstract class jika ada struktur/atribut yang sama dan gunakan interface jika hanya butuh perilaku tambahan.
       c. Tidak dapat membuat objek dari abstract class
Solusi: Pastikan membuat objek dari kelas turunannya, bukan dari abstract class.
      d. Kesalahan struktur folder atau konfigurasi project di Visual Studio Code
Solusi: Pastikan setiap file berada di folder yang sama atau package yang sesuai dan jalankan dengan command yang benar (javac dan java untuk Java, misalnya).
      e. Kesulitan memahami alur eksekusi
Solusi:Tambahkan System.out.println() di setiap method untuk melihat urutan eksekusi dan periksa ulang hierarki class dan interface.
)
---

## Kesimpulan
(Tuliskan kesimpulan dari praktikum minggu ini.  
Contoh: *Dengan menggunakan class dan object, program menjadi lebih terstruktur dan mudah dikembangkan.*)

---

## Quiz
1. Jelaskan perbedaan konsep dan penggunaan abstract class dan interface.
   **Jawaban:** Abstract class adalah kelas yang berfungsi sebagai kerangka dasar bagi kelas turunannya. Di dalam abstract class dapat berisi method abstract (tanpa isi) dan method biasa (dengan implementasi). Abstract class digunakan ketika beberapa kelas memiliki karakteristik dasar yang sama, tetapi masing-masing memiliki cara kerja yang berbeda pada bagian tertentu. Kelas turunan wajib mengimplementasikan method abstract yang telah didefinisikan.

Sementara itu, interface adalah kumpulan method abstract yang berperan sebagai kontrak perilaku yang harus dipenuhi oleh kelas yang mengimplementasikannya. Interface tidak memiliki implementasi, sehingga semua method harus diisi oleh kelas yang menggunakannya. Interface digunakan ketika berbagai kelas yang tidak memiliki hubungan turunan tetap harus memiliki perilaku yang sama, misalnya semua objek yang bisa bergerak atau semua objek yang bisa disimpan ke database.
Dengan demikian, abstract class digunakan untuk membuat struktur dasar objek, sedangkan interface digunakan untuk mendefinisikan perilaku yang dapat dimiliki oleh banyak kelas berbeda

2.   Mengapa multiple inheritance lebih aman dilakukan dengan interface pada Java?
  **Jawaban:** Multiple inheritance lebih aman dilakukan dengan interface karena interface hanya berisi deklarasi method tanpa implementasi, sehingga tidak menimbulkan konflik pewarisan. Jika Java mengizinkan multiple inheritance menggunakan class, maka akan muncul masalah diamond problem, yaitu ketika dua class induk memiliki implementasi method yang sama dan class turunan menjadi bingung harus menggunakan implementasi yang mana.

Dengan interface, Java hanya mewariskan kontrak perilaku, bukan kode program yang sebenarnya. Kelas yang mengimplementasikan banyak interface tetap membuat implementasi method-nya sendiri, sehingga menghindari benturan kode, menjaga konsistensi, serta membuat struktur pewarisan lebih jelas dan aman.

 3. Pada contoh Agri-POS, bagian mana yang paling tepat menjadi abstract class dan mana yang menjadi interface? Jelaskan alasannya
   **Jawaban:** a.) Bagian yang tepat menjadi Abstract Class: Produk
Abstract class cocok digunakan untuk entity utama seperti produk pertanian, misalnya: Beras, Cabai, Sayur, Telur, dll.
Alasannya:
-Semua produk memiliki atribut dasar yang sama, seperti nama, harga, dan stok.
-Setiap produk membutuhkan struktur umum, tetapi mungkin memiliki perhitungan atau proses khusus, misalnya cara menghitung diskon, kualitas, atau metode pengepakan.
-Abstract class memungkinkan adanya method biasa dan method abstract, sehingga kelas turunan dapat mengembangkan perilaku spesifik.
Contoh :
abstract class Produk {
    String nama;
    double harga;

    abstract double hitungDiskon();
}
      b.) Bagian yang tepat menjadi Interface: DapatDijual, DapatDicetak, DapatDiukur
Interface cocok digunakan untuk perilaku tambahan, bukan struktur.Contoh interface yang relevan:
DapatDijual → untuk item apa pun yang bisa diproses POS.
DapatDicetak → untuk objek yang dapat dicetak struknya.
DapatDiukur → untuk produk yang dijual berdasarkan berat atau volume.
Alasannya:
-Tidak semua objek memiliki struktur yang sama, tetapi bisa saja memiliki perilaku yang sama.
-Interface memungkinkan multiple inheritance, sehingga sebuah kelas dapat memiliki banyak kemampuan tanpa benturan kode.
-Interface mendefinisikan kontrak aksi, bukan data.
Contoh: interface DapatDijual {
    double getHargaJual();
}

interface DapatDicetak {
    void cetakStruk();
}
