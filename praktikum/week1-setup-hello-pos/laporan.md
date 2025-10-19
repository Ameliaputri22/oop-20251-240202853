# Laporan Praktikum Minggu ke-1
Topik: Pengenalan Paradigma dan Setup Proyek

## Identitas
- Nama  : Amelia Putri Azzahra
- NIM   : 240202853
- Kelas : 3IKRA

---

## Tujuan
•Mahasiswa mampu mendefinisikan paradigma prosedural, OOP, dan fungsional.
•Mahasiswa mampu membandingkan kelebihan dan keterbatasan tiap paradigma.
•Mahasiswa mampu memberikan contoh program sederhana untuk masing-masing paradigma.
•Mahasiswa aktif dalam diskusi kelas (bertanya, menjawab, memberi opini).

---

## Dasar Teori
Paradigma pemrograman adalah cara pandang dalam menyusun program:
•Prosedural: program dibangun sebagai rangkaian perintah (fungsi/prosedur).
•OOP (Object-Oriented Programming): program dibangun dari objek yang memiliki data (atribut) dan perilaku (method).
•Fungsional: program dipandang sebagai pemetaan fungsi matematika, lebih menekankan ekspresi dan transformasi data.

Dalam konteks Agri-POS, OOP membantu memodelkan entitas nyata seperti Produk, Transaksi, dan Pembayaran sebagai objek. Dengan demikian, sistem lebih mudah dikembangkan dan dipelihara.

---

## Langkah Praktikum
1. Setup Project
•Pastikan sudah menginstall JDK (Java Development Kit), IDE (misal: IntelliJ IDEA, VS Code, NetBeans), Git, PostgreSQL, dan JavaFX di komputer.
•Buat folder project oop-pos-<nim>.
•Inisialisasi repositori Git.
•Buat struktur awal src/main/java/com/upb/agripos/.
• Pastikan semua tools dapat berjalan (uji dengan membuat dan menjalankan program Java sederhana).

2. Program Sederhana dalam 3 Paradigma
•Produral: program untuk menghitung total harga dua produk.
•OOP: class Produk dengan atribut nama dan harga, buat minimal tiga objek, lalu hitung total.
•Fungsional: gunakan Stream atau lambda untuk menghitung total harga dari minimal tiga objek.

3. Commit dan Push
Commit dengan pesan: week1-setup-hello-pos 

---

## Kode Program
1. **Prosedural**
// HelloProcedural.java
public class HelloProcedural {
   public static void main(String[] args) {
      String nim = "2310112345";
      String nama = "Budi";
      String[] produk = {"Beras", "Pupuk", "Benih"};
      int[] harga = {10000, 15000, 12000};
      int total = 0;
      System.out.println("Hello POS World");
      System.out.println("NIM: " + nim + ", Nama: " + nama);
      System.out.println("Daftar Produk:");
      for (int i = 0; i < produk.length; i++) {
         System.out.println("- " + produk[i] + ": " + harga[i]);
         total += harga[i];
      }
      System.out.println("Total harga semua produk: " + total);
   }
}

**2. OOP**
// HelloOOP.java
class Produk {
   String nama;
   int harga;
   Produk(String nama, int harga) {
      this.nama = nama;
      this.harga = harga;
   }
}

public class HelloOOP {
   public static void main(String[] args) {
      String nim = "2310112345";
      String namaMhs = "Budi";
      Produk[] daftar = {
         new Produk("Beras", 10000),
         new Produk("Pupuk", 15000),
         new Produk("Benih", 12000)
      };
      int total = 0;
      System.out.println("Hello POS World");
      System.out.println("NIM: " + nim + ", Nama: " + namaMhs);
      System.out.println("Daftar Produk:");
      for (Produk p : daftar) {
         System.out.println("- " + p.nama + ": " + p.harga);
         total += p.harga;
      }
      System.out.println("Total harga semua produk: " + total);
   }
}
**3. Fungsional**
// HelloFunctional.java
import java.util.*;
import java.util.stream.*;
public class HelloFunctional {
   public static void main(String[] args) {
      String nim = "2310112345";
      String nama = "Budi";
      List<String> produk = Arrays.asList("Beras", "Pupuk", "Benih");
      List<Integer> harga = Arrays.asList(10000, 15000, 12000);
      System.out.println("Hello POS World");
      System.out.println("NIM: " + nim + ", Nama: " + nama);
      System.out.println("Daftar Produk:");
      IntStream.range(0, produk.size())
         .forEach(i -> System.out.println("- " + produk.get(i) + ": " + harga.get(i)));
      int total = harga.stream().mapToInt(Integer::intValue).sum();
      System.out.println("Total harga semua produk: " + total);
   }
}
## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
Analisis ini mencakup beberapa aspek kunci:
1. Relevansi Tujuan Praktikum
Praktikum ini dinilai sangat relevan karena:
Fondasi Pengembangan: Ini memberikan landasan fundamental yang diperlukan sebelum memasuki materi pemrograman yang lebih kompleks.
Kesiapan Alat (Tools): Memastikan bahwa semua peserta memiliki lingkungan pengembangan yang berfungsi dan dikonfigurasi dengan benar, menghilangkan hambatan teknis di kelas atau sesi praktikum berikutnya.
Penerapan Paradigma: Penilaian sejauh mana praktikan dapat mengidentifikasi atau mengimplementasikan konsep dasar dari paradigma yang berbeda (misalnya, membuat fungsi terpisah untuk prosedural, atau kelas dan objek untuk PBO) dalam proyek yang mereka setup.
Debugging dan Eksekusi Kode: Analisis penggunaan fitur run dan debug di VS Code untuk menguji kode yang telah ditulis.
2. Hasil yang Dapat Diukur
Dari analisis juga mengidentifikasi tantangan, seperti:
Variasi Sistem Operasi: Perbedaan setup antara Windows, macOS, dan Linux seringkali menjadi kendala teknis.
Pemahaman Awal yang Beragam: Latar belakang praktikan yang berbeda mempengaruhi kecepatan mereka dalam menyerap

## Kesimpulan
Dengan menggunakan Paradigma dan Setup Proyek  memperoleh pemahaman dasar mengenai berbagai paradigma pemrograman (seperti prosedural, berorientasi objek, fungsional, dsb.) dan dapat mengidentifikasi perbedaan serta kapan harus menggunakan paradigma tertentu sesuai kebutuhan proyek.Melalui latihan setup dan pengenalan paradigma, praktikan dapat menerapkan prinsip-prinsip dasar penulisan kode yang bersih, terstruktur, dan mudah dipahami, yang merupakan fondasi penting untuk proyek pemrograman yang lebih kompleks. 

---

## Quiz
1.Apakah OOP selalu lebih baik dari prosedural?
   Jawaban:Tidak selalu, karena pilihan antara Pemrograman Berorientasi Objek (OOP) dan prosedural bergantung pada konteks proyek; OOP unggul dalam proyek besar dan kompleks karena modularitas dan penggunaan ulang kode, sementara prosedural lebih efisien untuk program kecil, kinerja tinggi, atau ketika fokus pada tindakan daripada data yang terkait erat. OOP memiliki kurva belajar yang lebih curam dan dapat menghasilkan overhead yang lebih besar, sedangkan pemrograman prosedural lebih sederhana dan langsung untuk pemula dan proyek sederhana. 

2. Kapan Functional programming lebih cocok digunakan dibanding OOP atau prosedural?
   Jawaban :Pemrograman fungsional (FP) lebih cocok digunakan untuk aplikasi yang membutuhkan paralelisme tinggi dan pemrosesan data besar karena menghindari state bersama (shared state) dan efek samping. FP ideal untuk komputasi paralel seperti analisis data dan machine learning, di mana manipulasi data kompleks dan kalkulasi murni menjadi fokus utama. 

3.bagaimana Paradigma (prosedural,oop, fungsional) memengaruhi maintainability dan scalability aplikasi?
   Jawaban:Paradigma prosedural bagus untuk aplikasi kecil dan sederhana namun kurang terstruktur untuk skala besar, sedangkan OOP memengaruhi maintainability dan scalability dengan menyediakan modularitas (enkapsulasi) dan reusabilitas melalui kelas-kelas objek, sehingga perubahan pada satu objek tidak memengaruhi yang lain. Sementara itu, paradigma fungsional meningkatkan maintainability dengan fungsi murni dan immutability yang mengurangi efek samping, dan mendukung scalability melalui konkurensi yang lebih mudah, membuat aplikasi lebih mudah diperluas dan paralel. 

4. Mengapa OOP lebih cocok untuk mengembangkan aplikasi POS dianding Prosedural?
   Jawaban :OOP (Pemrograman Berorientasi Objek) lebih cocok untuk aplikasi POS karena menyediakan modularitas, kemudahan pengelolaan, dan reusabilitas kode yang lebih baik dibandingkan pemrograman prosedural. Struktur objek yang membungkus data dan fungsi secara bersamaan memudahkan pemodelan entitas dunia nyata seperti produk atau transaksi, sehingga kode menjadi lebih terorganisir, mudah dikembangkan, diperbaiki, dan lebih aman, terutama untuk sistem berskala besar. 

5. Bagaimana paradigma fungsional dapat membantu mengurangi kode berulang (boilerplate code)?
   Jawaban : Paradigma fungsional mengurangi kode berulang dengan menerapkan prinsip modularity, reusability, dan abstaksi melalui fungsi. Kode dipecah menjadi fungsi-fungsi kecil yang dapat digunakan kembali di berbagai bagian program, menghindari penulisan kode yang sama berulang kali. Selain itu, penggunaan fungsi map, filter, dan reduce memungkinkan developer untuk menerapkan operasi yang sama ke banyak elemen data tanpa perlu menulis loop eksplisit, yang secara signifikan mengurangi kode boilerplate. 
