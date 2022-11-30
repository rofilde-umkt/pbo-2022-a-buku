package peminjaman; 

public class Mahasiswa extends Akademisi {
    private String nim;
    private String fakultas; 
    private Prodi prodi; 
    private Buku[] buku = new Buku[50];
    private int jumlahBuku = 0;

    public void setData(String n, String f) {
        this.nim = n;
        this.fakultas = f;
    }

    public void tampil() {
        System.out.println("Nim " + this.nim);
        System.out.println("Fakultas " + this.fakultas);
    }

    public int meminjamBuku(Buku buku) {
        this.buku[this.jumlahBuku] = buku;
        this.jumlahBuku++;

        return 14;
    }

    public void menampilkanBuku() {
        System.out.println("Buku yang dimiliki oleh " + this.nama); 
        for(int i=0; i < this.jumlahBuku; i++) {
            System.err.println("Judul " + this.buku[i].getJudul());
        }
    }
}