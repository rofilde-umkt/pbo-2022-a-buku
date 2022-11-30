package peminjaman;

abstract class Akademisi {
    protected String nama;
    protected String alamat; 
    protected String tanggalLahir; 
    protected String email; 
    protected String telpon;

    public void setData(String n, String a, String tl, String e, String t) {
        this.nama = n;
        this.alamat = a; 
        this.tanggalLahir = t;
        this.email = e;
        this.telpon = t;
    }

    public void tampil() {
        System.out.println("Nama" + this.nama);
        System.out.println("Alamat" + this.alamat);
        System.out.println("TanggalLahir" + this.tanggalLahir);
        System.out.println("Email" + this.email);
        System.out.println("Telpon" + this.telpon);
    }

    

}
