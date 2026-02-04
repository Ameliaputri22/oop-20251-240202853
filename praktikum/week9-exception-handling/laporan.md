# Laporan Praktikum Minggu Bab 9 – Exception Handling, Custom Exception, dan Penerapan Design PatternJelaskan perbedaan error dan exception.
## Identitas
- Nama  : [Amelia Putri Azzahra]
- NIM   : [240202853]
- Kelas : [3IKRA]

---

## Tujuan

---

## Dasar Teori
(Tuliskan ringkasan teori singkat (3–5 poin) yang mendasari praktikum.  
Contoh:  
1. Class adalah blueprint dari objek.  
2. Object adalah instansiasi dari class.  
3. Enkapsulasi digunakan untuk menyembunyikan data.)

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
1. Perbedaan Error dan Exception
Jawab : Error dan exception sama-sama masalah saat program berjalan, tapi level dan penanganannya beda.
*Error
-Kesalahan fatal dan tidak bisa / tidak seharusnya ditangani program
-Biasanya terjadi karena masalah sistem
-Program umumnya langsung berhenti
Contoh:
OutOfMemoryError → memori habis
StackOverflowError → rekursi tak berujung
Intinya: error = masalah serius dari sistem
* Exception

Kesalahan yang masih bisa ditangani

Terjadi karena logika program atau input pengguna

Bisa di-handle dengan try–catch

Contoh:

NullPointerException

ArithmeticException

SQLException
2. Fungsi finally dalam blok try–catch–finally

Blok finally adalah kode yang PASTI dijalankan, baik terjadi exception maupun tidak.

Fungsi utama:

Membersihkan resource

Menutup koneksi

Menjamin proses akhir tetap dieksekusi

Contoh:
try {
    transaksi.prosesPembayaran();
} catch (Exception e) {
    System.out.println("Terjadi kesalahan transaksi");
} finally {
    koneksiDatabase.close();
}


3. Mengapa Custom Exception diperlukan?

Custom exception diperlukan ketika:

Exception bawaan tidak cukup menjelaskan konteks bisnis

Ingin pesan error yang lebih spesifik & bermakna

Memisahkan logika bisnis dari error teknis

Tanpa custom exception:
throw new Exception("Error");
Dengan custom exception:
throw new StokTidakCukupException("Stok barang A hanya tersisa 2");

4. Contoh Kasus Bisnis POS yang Membutuhkan Custom Exception
Kasus 1: Stok Tidak Cukup

Saat kasir menjual barang melebihi stok.

Custom Exception:

class StokTidakCukupException extends Exception {
    public StokTidakCukupException(String pesan) {
        super(pesan);
    }
}


Pemakaian:

if (jumlahBeli > stokBarang) {
    throw new StokTidakCukupException("Stok barang tidak mencukupi");
}

 Kasus 2: Pembayaran Kurang

Uang yang dibayar pelanggan kurang dari total belanja.

Custom Exception:

class PembayaranKurangException extends Exception {
    public PembayaranKurangException(String pesan) {
        super(pesan);
    }
}

Kasus 3: Kasir Belum Login

Transaksi dilakukan tanpa autentikasi kasir.

Custom Exception:

class KasirBelumLoginException extends Exception {
    public KasirBelumLoginException(String pesan) {
        super(pesan);
    }
}
