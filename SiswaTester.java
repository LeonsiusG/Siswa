//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        //membuat Object
        //namaClass namaObject = new Constructor();
        Siswa sabrina = new Siswa();
        Siswa rasyid = new Siswa();
        Siswa rehan = new Siswa();
        Siswa zainur = new Siswa();
        Siswa zaky = new Siswa();

        sabrina.id = 32;
        sabrina.nama = "Sabrina";
        sabrina.ipk = 85.8;
        rasyid.id = 30;
        rasyid.nama = "Rasyid";
        rasyid.ipk = 83.5;
        
        rehan.id = 29;
        rehan.nama = "Rehan";
        rehan.ipk = 89.7;
        
        zainur.id = 1;
        zainur.nama = "Zainur";
        zainur.ipk = 87.6;       
        
        zaky.id = 3;
        zaky.nama = "Zaky";
        zaky.ipk = 84.1; 
        
        sabrina.print();
        rasyid.print();
        rehan.print();
        zainur.print();
        zaky.print();

    }
}