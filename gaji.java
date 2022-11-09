public class gaji extends Pegawai
{
    private double salary;
    public gaji (String nama, String alamat, int nomor, double salary){
    super (nama, alamat, nomor); //downcasting, karena gaji mengambil isi atau meng-inheritance pegawai kedalam subkelas gaji.
    setSalary(salary);
    }
    public void mailCheck(){
        System.out.println("Memeriksa kelas gaji dalam surat");
        System.out.println("Surat tertuju untuk" + getNama()+ "dengan gaji"+salary);
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary (double newSalary){
        if (newSalary >= 0.01){
            salary = newSalary;
        }
        }
    public double computerPay(){
        System.out.println("Menghitung pembayara gaji untuk" + getNama());
        return salary/52;
    }
}
