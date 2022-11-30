package peminjaman;

public class Buku {
    private String judul; 
    private int tahun; 
    private int halaman; 
    private Penerbit penerbit; 
    private Penulis penulis;

    public void setData(String j, int t, int h) {
        this.judul = j;
        this.tahun = t; 
        this.halaman = h;
    }

    public void setData(String j, int t, int h, Penulis p) {
        this.judul = j;
        this.tahun = t; 
        this.halaman = h;
        this.penulis = p;
    }

    public void setData(String j, int t, int h, Penulis p, Penerbit pr) {
        this.judul = j;
        this.tahun = t; 
        this.halaman = h;
        this.penulis = p;
        this.penerbit = pr;
    }

    public void tampilData() {
        System.out.println("Judul " + this.judul);
        System.out.println("Tahun " + this.tahun);
        System.out.println("Halaman " + this.halaman);

    }

    public void setJudul(String j) {
        this.judul = j;
    }

    public String getJudul() {
        return this.judul;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public int getTahun() {
        return this.tahun;
    }

}