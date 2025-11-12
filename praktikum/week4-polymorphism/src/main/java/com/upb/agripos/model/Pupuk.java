package main.java.com.upb.agripos.model;

public class Pupuk extends Produk {
    private String jenis;

    // Konstruktor
    public Pupuk(String kode, String nama, double harga, int stok, String jenis) {
        super(kode, nama, harga, stok); // memanggil konstruktor di Produk
        this.jenis = jenis;
    }

    // Getter & Setter untuk 'jenis'
    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }
}
