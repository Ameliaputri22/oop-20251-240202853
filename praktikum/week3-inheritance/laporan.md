# Laporan Praktikum Minggu 3 
Topik: Inheritance (Kategori Produk)

## Identitas
- Nama  : [Amelia Putri Azzahra]
- NIM   : [240202853]
- Kelas : [3IKRA]

---
## Tujuan
-Mahasiswa mampu menjelaskan konsep inheritance (pewarisan class) dalam OOP.
-Mahasiswa mampu membuat superclass dan subclass untuk produk pertanian.
-Mahasiswa mampu mendemonstrasikan hierarki class melalui contoh kode.
-Mahasiswa mampu menggunakan super untuk memanggil konstruktor dan method parent class.
-Mahasiswa mampu membuat laporan praktikum yang menjelaskan perbedaan penggunaan inheritance dibanding class tunggal.
## Dasar Teori
Inheritance adalah mekanisme dalam OOP yang memungkinkan suatu class mewarisi atribut dan method dari class lain.

Superclass: class induk yang mendefinisikan atribut umum.
Subclass: class turunan yang mewarisi atribut/method superclass, dan dapat menambahkan atribut/method baru.
super digunakan untuk memanggil konstruktor atau method superclass.
Dalam konteks Agri-POS, kita dapat membuat class Produk sebagai superclass, kemudian Benih, Pupuk, dan AlatPertanian sebagai subclass. Hal ini membuat kode lebih reusable dan terstruktur.
---



---

## Langkah Praktikum
1.Membuat Superclass Produk
Gunakan class Produk dari Bab 2 sebagai superclass.
2.Membuat Subclass
Benih.java → atribut tambahan: varietas.
Pupuk.java → atribut tambahan: jenis pupuk (Urea, NPK, dll).
AlatPertanian.java → atribut tambahan: material (baja, kayu, plastik).
3.Membuat Main Class
Instansiasi minimal satu objek dari tiap subclass.
Tampilkan data produk dengan memanfaatkan inheritance.
4.Menambahkan CreditBy
Panggil class CreditBy untuk menampilkan identitas mahasiswa.
5.Commit dan Push dengan pesan: week3-inheritance.

## Kode Program
1.Benih.java
package com.upb.agripos.model;

public class Benih extends Produk {
    private String varietas;

    public Benih(String kode, String nama, double harga, int stok, String varietas) {
        super(kode, nama, harga, stok);
        this.varietas = varietas;
    }

    public String getVarietas() { return varietas; }
    public void setVarietas(String varietas) { this.varietas = varietas; }
}
2.Pupuk.java
package com.upb.agripos.model;

public class Pupuk extends Produk {
    private String jenis;

    public Pupuk(String kode, String nama, double harga, int stok, String jenis) {
        super(kode, nama, harga, stok);
        this.jenis = jenis;
    }

    public String getJenis() { return jenis; }
    public void setJenis(String jenis) { this.jenis = jenis; }
}
3.AlatPertanian.java
package com.upb.agripos.model;

public class AlatPertanian extends Produk {
    private String material;

    public AlatPertanian(String kode, String nama, double harga, int stok, String material) {
        super(kode, nama, harga, stok);
        this.material = material;
    }

    public String getMaterial() { return material; }
    public void setMaterial(String material) { this.material = material; }
}
4.MainInheritance.java
package com.upb.agripos;

import com.upb.agripos.model.*;
import com.upb.agripos.util.CreditBy;

public class MainInheritance {
    public static void main(String[] args) {
        Benih b = new Benih("BNH-001", "Benih Padi IR64", 25000, 100, "IR64");
        Pupuk p = new Pupuk("PPK-101", "Pupuk Urea", 350000, 40, "Urea");
        AlatPertanian a = new AlatPertanian("ALT-501", "Cangkul Baja", 90000, 15, "Baja");

        System.out.println("Benih: " + b.getNama() + " Varietas: " + b.getVarietas());
        System.out.println("Pupuk: " + p.getNama() + " Jenis: " + p.getJenis());
        System.out.println("Alat Pertanian: " + a.getNama() + " Material: " + a.getMaterial());

        CreditBy.print("<NIM>", "<Nama Mahasiswa>");
    }
}
---

## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
Tujuan Praktikum Untuk memahami konsep inheritance (pewarisan) dalam pemrograman berorientasi objek, yaitu bagaimana sebuah class dapat mewarisi atribut dan method dari class lain sehingga kode menjadi lebih efisien, terstruktur, dan mudah dikembangkan.Cara Kode Berjalan
-Program dijalankan dari main() di class MainInheritance.
-Objek benih dibuat dari class Benih, yang merupakan subclass dari Produk.
-Saat objek dibuat, constructor Benih akan dijalankan → memanggil constructor Produk dengan keyword super.
-Data dari Produk diisi (kode, nama, harga), lalu atribut jenisTanaman diisi di Benih.
-Method deskripsi() dijalankan → menampilkan data produk dari tampilkanInfo() milik superclass dan atribut tambahan jenisTanaman.
Hasil akhirnya, seluruh informasi produk ditampilkan di console.
---

## Kesimpulan
Pada praktikum ini telah dipelajari konsep inheritance dalam pemrograman berorientasi objek (OOP). Inheritance memungkinkan pembuatan kelas baru (subclass) yang mewarisi atribut dan method dari kelas induk (superclass). Dalam studi kasus kategori produk pertanian, kelas Produk dijadikan sebagai superclass, kemudian diturunkan ke beberapa subclass seperti Benih, Pupuk, dan AlatPertanian yang memiliki atribut serta method tambahan sesuai kebutuhan.

Dengan penggunaan inheritance, kode menjadi lebih efisien, terstruktur, dan mudah dikembangkan karena tidak perlu menuliskan atribut yang sama pada tiap kelas. Subclass juga dapat melakukan override method untuk menyesuaikan perilaku sesuai karakteristik produk masing-masing. Secara keseluruhan, praktikum ini berhasil menunjukkan bagaimana inheritance dapat digunakan pada sistem POS pertanian untuk mengelompokkan produk berdasarkan kategori dengan tetap menjaga konsistensi data dan memudahkan pengelolaan program.
## Quiz
(1..Apa keuntungan menggunakan inheritance dibanding membuat class terpisah tanpa hubungan?
   **Jawaban:** …  
Inheritance membuat kode lebih efisien karena atribut dan method dasar dapat diturunkan dari superclass ke subclass, sehingga tidak perlu menulis ulang kode yang sama. Selain itu, inheritance menjaga struktur yang jelas, memudahkan perawatan, pengembangan, dan memungkinkan penggunaan konsep polimorfisme.
2.Bagaimana cara subclass memanggil konstruktor superclass?
 **Jawaban:** …Dengan menggunakan keyword super() pada baris pertama konstruktor subclass.
Contoh dalam Java:

public class Subclass extends Superclass {
    public Subclass(String id, String nama) {
        super(id, nama); // Memanggil konstruktor superclass
    }
}
3.Berikan contoh kasus di POS pertanian selain Benih, Pupuk, dan Alat Pertanian yang bisa dijadikan subclass.
 **Jawaban:** …Contoh subclass lain di sistem POS pertanian:
-ObatTanaman → atribut tambahan: jenis hama, dosis pemakaian
-SistemIrigasi → atribut: tipe irigasi, kapasitas air
-PakanTernak → atribut: kandungan nutrisi, umur ternak
-ProdukPanen → atribut: jenis komoditas, tanggal panen
-PestisidaOrganik → atribut: bahan aktif, tingkat toksisitas
   
