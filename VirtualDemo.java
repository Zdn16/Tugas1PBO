public class VirtualDemo {
    public static void main(String[] args) {
        gaji s = new gaji("Wahyu","KUBAR",2,3500.00); //polimorfisme, karena nama dan lain-lain disini memiliki bentuk lainnya yaitu sebagai gaji dan superclass pegawai
        Pegawai e = new gaji("Ini nama", "Samarinda",2,2500.00); //polimorfisme, //polimorfisme, karena nama dan lain-lain disini memiliki bentuk lainnya yaitu sebagai gaji dan superclass pegawai
        System.out.println("Memanggil mailCheck Berdasarkan Referensi gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil maiilCheck Berdasarkan Referensi Pegawai--");
        e.mailCheck();
    }
}
