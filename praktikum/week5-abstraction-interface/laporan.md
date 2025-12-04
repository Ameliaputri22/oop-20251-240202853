# Laporan Praktikum Minggu ke 5 

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


---

## Langkah Praktikum
(Tuliskan Langkah-langkah dalam prakrikum, contoh:
1. Langkah-langkah yang dilakukan (setup, coding, run).  
2. File/kode yang dibuat.  
3. Commit message yang digunakan.)

---

## Kode Program
(Tuliskan kode utama yang dibuat, contoh:  

```java
// Contoh
Produk p1 = new Produk("BNH-001", "Benih Padi", 25000, 100);
System.out.println(p1.getNama());
```
)
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
(
- Jelaskan bagaimana kode berjalan.  
- Apa perbedaan pendekatan minggu ini dibanding minggu sebelumnya.  
- Kendala yang dihadapi dan cara mengatasinya.  
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
   **Jawaban:** …  
