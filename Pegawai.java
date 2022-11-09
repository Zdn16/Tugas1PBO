public class Pegawai {
    private String nama;
    private String alamat;
    private int nomor;
    public Pegawai (String nama, String alamat, int nomor){
        System.out.println("menyusun pegawai");
    this.nama = nama;
    this.alamat = alamat;
    this.nomor = nomor;
    }
public void mailCheck(){
    System.out.println("memeriksa surat untuk" + this.nama + "" + this.alamat);
}
public String toString(){
    return nama + " " + alamat + " " + nomor;
}
public String getNama(){
    return nama;
}
public String getAlamat(){
    return alamat;
}
public void setAlamat(String newAlamat){
    alamat = newAlamat;
}
public int getNomor(){
    return nomor;
}

}