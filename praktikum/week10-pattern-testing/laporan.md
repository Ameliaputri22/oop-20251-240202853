# Laporan Praktikum Minggu 10
Design Pattern (Singleton, MVC) dan Unit Testing menggunakan JUnit

## Identitas
- Nama  : [Amelia Putri Azzahra]
- NIM   : [240202853]
- Kelas : [3IKRA]

---

## Tujuan
1. Memahami konsep dan penerapan design pattern Singleton dalam membatasi pembuatan objek agar hanya terdapat satu instance.
2. Menerapkan arsitektur Model–View–Controller (MVC) untuk memisahkan logika bisnis, tampilan, dan pengendali aplikasi.
3. Mengimplementasikan unit testing menggunakan JUnit untuk menguji fungsi atau kelas secara terpisah.
4. Mengetahui pentingnya unit testing dalam menjaga kualitas dan keandalan perangkat lunak.
5. Melatih kemampuan analisis desain perangkat lunak agar lebih terstruktur, mudah dikembangkan, dan mudah diuji.
---

## Dasar Teori
1. Design Pattern
Design pattern merupakan solusi umum yang telah terbukti efektif untuk menyelesaikan permasalahan yang sering muncul dalam pengembangan perangkat lunak. Pola ini bukan berupa kode siap pakai, melainkan pedoman atau konsep desain yang dapat diterapkan pada berbagai situasi untuk menghasilkan perangkat lunak yang lebih terstruktur, fleksibel, dan mudah dipelihara.

2. Singleton Pattern
Singleton merupakan salah satu creational design pattern yang bertujuan untuk memastikan bahwa sebuah kelas hanya memiliki satu instance selama aplikasi berjalan. Pola ini menyediakan satu titik akses global terhadap instance tersebut.
Pada implementasinya, constructor dibuat bersifat private untuk mencegah pembuatan objek secara langsung dari luar kelas. Akses ke instance dilakukan melalui method khusus, seperti getInstance(). Singleton sering digunakan pada pengelolaan konfigurasi, koneksi basis data, atau logger.

3. Model–View–Controller (MVC)
Model–View–Controller (MVC) adalah pola arsitektur perangkat lunak yang membagi aplikasi ke dalam tiga komponen utama:
- Model, yang bertanggung jawab terhadap pengelolaan data dan logika bisnis.
- View, yang berfungsi menampilkan data kepada pengguna.
- Controller, yang bertugas menerima input dari pengguna dan mengatur interaksi antara Model dan View.
Pemisahan ini bertujuan untuk meningkatkan keterbacaan kode, memudahkan pengembangan dan pemeliharaan aplikasi, serta mendukung pengujian secara terpisah pada setiap komponen.

4. Unit Testing
Unit testing merupakan metode pengujian perangkat lunak yang dilakukan dengan cara menguji unit terkecil dari program, seperti fungsi atau kelas, secara terpisah. Tujuan utama unit testing adalah memastikan bahwa setiap unit bekerja sesuai dengan spesifikasi yang telah ditentukan.JUnit adalah framework unit testing pada bahasa pemrograman Java yang menyediakan berbagai anotasi dan metode pengujian untuk mempermudah proses pengujian secara otomatis dan terstruktur.

5. Peran Unit Testing dalam Kualitas Perangkat Lunak
Dengan adanya unit testing, kesalahan dapat dideteksi lebih awal pada tahap pengembangan. Hal ini membantu meningkatkan kualitas perangkat lunak, mengurangi risiko kegagalan sistem, serta mempermudah proses perbaikan dan pengembangan lanjutan (maintenance dan refactoring).
---

## Langkah Praktikum
### A. Praktikum Design Pattern Singleton
1. Membuat project Java baru.
2. Membuat sebuah class Singleton.
3. Mengatur constructor agar bersifat private.
4. Membuat method static `getInstance()` untuk mengakses instance.
5. Menguji bahwa instance yang dihasilkan tetap sama.
#### Kode Program Singleton

```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // constructor private
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

#### Kode Pengujian Singleton

```java
public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s1 == s2); // output: true
    }
}
```

---

### B. Praktikum Model–View–Controller (MVC)

#### Langkah Praktikum

1. Membuat class Model untuk menyimpan data.
2. Membuat class View untuk menampilkan data.
3. Membuat class Controller sebagai penghubung Model dan View.
4. Menjalankan aplikasi melalui class utama.

#### Kode Program Model

```java
public class MahasiswaModel {
    private String nama;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
```

#### Kode Program View

```java
public class MahasiswaView {
    public void tampilkanNama(String nama) {
        System.out.println("Nama Mahasiswa: " + nama);
    }
}
```

#### Kode Program Controller

```java
public class MahasiswaController {
    private MahasiswaModel model;
    private MahasiswaView view;

    public MahasiswaController(MahasiswaModel model, MahasiswaView view) {
        this.model = model;
        this.view = view;
    }

    public void setNamaMahasiswa(String nama) {
        model.setNama(nama);
    }

    public void updateView() {
        view.tampilkanNama(model.getNama());
    }
}
```

#### Kode Program Utama MVC

```java
public class MainMVC {
    public static void main(String[] args) {
        MahasiswaModel model = new MahasiswaModel();
        MahasiswaView view = new MahasiswaView();
        MahasiswaController controller = new MahasiswaController(model, view);

        controller.setNamaMahasiswa("Amelia Azzahra");
        controller.updateView();
    }
}
```

---

### C. Praktikum Unit Testing Menggunakan JUnit

#### Langkah Praktikum

1. Menambahkan library JUnit ke dalam project.
2. Membuat class yang akan diuji.
3. Membuat class testing menggunakan anotasi JUnit.
4. Menjalankan pengujian dan menganalisis hasilnya.

#### Kode Program yang Diuji

```java
public class Kalkulator {
    public int tambah(int a, int b) {
        return a + b;
    }
}
```

#### Kode Unit Testing JUnit

```java
import static org.junit.Assert.*;
import org.junit.Test;

public class KalkulatorTest {

    @Test
    public void testTambah() {
        Kalkulator k = new Kalkulator();
        assertEquals(5, k.tambah(2, 3));
    }
}
```


## Hasil Eksekusi
(Sertakan screenshot hasil eksekusi program.  
![Screenshot hasil](screenshots/hasil.png)
)
---

## Analisis
1. Penjelasan Cara Kerja Kode Program
Pada praktikum ini, program terdiri dari tiga bagian utama, yaitu Singleton, MVC, dan Unit Testing (JUnit),Pada Singleton, objek dibuat melalui method getInstance(). Constructor dibuat private sehingga objek tidak dapat dibuat langsung menggunakan new. Ketika getInstance() dipanggil pertama kali, instance akan dibuat. Pemanggilan berikutnya akan mengembalikan instance yang sama, sehingga hanya ada satu objek selama program berjalan.
Pada MVC, alur program dimulai dari Controller. Controller menerima input (misalnya nama mahasiswa), kemudian menyimpannya ke Model. Setelah data diperbarui, Controller memanggil View untuk menampilkan data ke pengguna. Dengan demikian, Model tidak berhubungan langsung dengan View, melainkan melalui Controller.
Pada Unit Testing menggunakan JUnit, kelas Kalkulator diuji menggunakan class KalkulatorTest. Method testTambah() memastikan bahwa fungsi penjumlahan menghasilkan nilai yang sesuai dengan yang diharapkan. Jika hasil sesuai, pengujian dinyatakan berhasil.

2. Perbedaan Pendekatan Minggu Ini Dibanding Minggu Sebelumnya
Pendekatan pada praktikum minggu ini berbeda dengan minggu sebelumnya karena:
Minggu ini menerapkan design pattern dan arsitektur perangkat lunak (Singleton dan MVC), sedangkan minggu sebelumnya lebih berfokus pada implementasi logika program secara langsung.
Kode program minggu ini lebih terstruktur dan modular, dengan pemisahan tanggung jawab pada setiap kelas.Selain implementasi program, minggu ini juga menekankan pada pengujian otomatis menggunakan JUnit, sementara minggu sebelumnya pengujian masih dilakukan secara manual.

3. Kendala yang Dihadapi dan Cara Mengatasinya
Beberapa kendala yang dihadapi selama praktikum antara lain:
Kesalahan dalam memahami konsep Singleton, khususnya penggunaan constructor private. Kendala ini diatasi dengan mempelajari kembali alur pembuatan instance dan contoh implementasi Singleton.
Kesulitan memisahkan Model, View, dan Controller, terutama dalam menentukan tanggung jawab masing-masing kelas. Solusinya adalah dengan mengikuti prinsip separation of concerns dan membuat diagram alur MVC terlebih dahulu.

Error saat menjalankan unit testing JUnit, seperti library belum terpasang atau anotasi yang salah. Kendala ini diatasi dengan menyesuaikan versi JUnit dan memastikan dependensi sudah ditambahkan dengan benar pada project.
---

## Kesimpulan
Berdasarkan hasil praktikum yang telah dilakukan, dapat disimpulkan bahwa penerapan design pattern Singleton mampu mengontrol pembuatan objek sehingga hanya terdapat satu instance selama program berjalan. Penggunaan arsitektur Model–View–Controller (MVC) membantu memisahkan logika bisnis, tampilan, dan pengendali aplikasi sehingga struktur kode menjadi lebih terorganisir dan mudah dipelihara. Selain itu, penerapan unit testing menggunakan JUnit berperan penting dalam memastikan setiap fungsi berjalan sesuai dengan kebutuhan serta membantu mendeteksi kesalahan sejak tahap awal pengembangan. Secara keseluruhan, praktikum ini meningkatkan pemahaman tentang pentingnya desain perangkat lunak yang baik dan pengujian otomatis dalam menjaga kualitas dan keandalan aplikasi.

---

## Quiz
1. Mengapa constructor pada Singleton harus bersifat private?
Jawab : Constructor pada pola Singleton dibuat private agar tidak dapat diinstansiasi dari luar kelas menggunakan keyword new. Tujuannya adalah:
-Menjamin hanya ada satu instance dari kelas tersebut selama aplikasi berjalan.
-Mengontrol pembuatan objek melalui satu titik akses, biasanya dengan method getInstance().
-Mencegah duplikasi objek yang dapat menyebabkan inkonsistensi data atau pemborosan sumber daya.
2. Manfaat pemisahan Model, View, dan Controller (MVC)
Jawab : Pola MVC memisahkan aplikasi ke dalam tiga komponen utama:
-Model: Mengelola data dan logika bisnis.
-View: Menangani tampilan antarmuka pengguna.
-Controller: Mengatur alur interaksi antara Model dan View.
Manfaat utama pemisahan ini adalah:
- Meningkatkan maintainability karena perubahan pada satu komponen tidak berdampak besar pada komponen lain.
-Memudahkan pengembangan tim, karena tugas dapat dibagi secara paralel.
-Meningkatkan skalabilitas dan keterujian aplikasi.
-Mendukung prinsip separation of concerns dalam rekayasa perangkat lunak.

3. Peran unit testing dalam menjaga kualitas perangkat lunak
Jawab : Unit testing berfungsi untuk menguji unit terkecil dari perangkat lunak (method atau class) secara terpisah. Perannya antara lain:
-Mendeteksi bug sejak dini sebelum aplikasi dirilis.
-Memastikan setiap fungsi bekerja sesuai spesifikasi.
-Mempermudah proses refactoring tanpa merusak fungsionalitas yang ada.
- Meningkatkan keandalan dan kualitas kode secara keseluruhan.
JUnit sebagai framework unit testing di Java membantu pengujian dilakukan secara otomatis dan konsisten.

4. Risiko jika Singleton tidak diimplementasikan dengan benar
Jawab : Jika pola Singleton salah diterapkan, beberapa risiko yang dapat muncul adalah:
-Terbentuknya lebih dari satu instance, terutama pada lingkungan multithreading.
-Masalah konkurensi yang menyebabkan data tidak konsisten.
-Kesulitan dalam unit testing karena ketergantungan global.
-Potensi memory leak jika instance tidak dikelola dengan baik.
Oleh karena itu, implementasi Singleton harus memperhatikan aspek thread safety dan desain yang tepat.
