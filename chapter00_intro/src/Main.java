public class Main {
    public static void main(String[] args) {
        Unggas ayam = new Unggas();
        ayam.warna = "Coklat";
        System.out.println("Warna Ayam adalah " + ayam.warna);
        System.out.print("Ayam "); ayam.berjalan();
        System.out.print("Ayam "); ayam.suara();

        BisaTerbang pipit = new BisaTerbang();
        System.out.print("Burung Pipit "); pipit.terbang();

        TidakBisaTerbang bebek = new TidakBisaTerbang();
        System.out.print("Bebek "); bebek.terbang();

        Mhs mhs1 = new Mhs();
        mhs1.nim = "2022573010060";
        mhs1.nama = "Andrian Fakhruza";
        mhs1.email = "fakhruzaandrian561@gmail.com";
        mhs1.jenisKelamin = "Laki-laki";
        mhs1.alamat = "Panggoi";

        Dosen dsn1 = new Dosen();
        dsn1.nip = "1992853297790";
        dsn1.nama = "Rocky Gerung";
        dsn1.email = "rockygerung@gmail.com";
        dsn1.jenisKelamin = "Laki-laki";
        dsn1.alamat = "Jakarta";

        System.out.println("\nBiodata Mahasiswa");
        System.out.println("NIM           : " + mhs1.nim);
        System.out.println("Nama          : " + mhs1.nama);
        System.out.println("Email         : " + mhs1.email);
        System.out.println("Jenis Kelamin : " + mhs1.jenisKelamin);
        System.out.println("Alamat        : " + mhs1.alamat);

        System.out.println("\nBiodata Dosen");
        System.out.println("NIM           : " + dsn1.nip);
        System.out.println("Nama          : " + dsn1.nama);
        System.out.println("Email         : " + dsn1.email);
        System.out.println("Jenis Kelamin : " + dsn1.jenisKelamin);
        System.out.println("Alamat        : " + dsn1.alamat + "\n");

        System.out.println("= Method Sepeda =");
        Sepeda spd = new Sepeda();
        System.out.print("Sepeda "); spd.berjalan();
        System.out.print("Sepeda "); spd.berhenti();

        System.out.println("\n= Method Sepeda Motor =");
        SepedaMotor mtr = new SepedaMotor();
        System.out.print("Sepeda Motor "); mtr.berjalan();
        System.out.print("Sepeda Motor "); mtr.berhenti();
        System.out.print("Suara Klakson Sepeda Motor : "); mtr.klakson();
        System.out.println("\n");

        NewEmployee karyawanBaru = new NewEmployee();
        karyawanBaru.companyInfo();
        karyawanBaru.printInfo();
        System.out.println("\n");

        OldEmployee karyawanLama = new OldEmployee();
        karyawanLama.companyInfo();
        karyawanLama.printInfo();
        System.out.println("\n");

        System.out.println("------------------------------------------------");
        System.out.println("Contoh Pemilihan Antara Interface dan Abstract");
        System.out.println("------------------------------------------------");
        System.out.println("------------------ Abstract --------------------");
        ShapeAbstract bulat = new Circle(2);
        Rectangle pp = new Rectangle(2, 5);
        bulat.calculateArea();
        pp.calculateArea();
        bulat.draw();
        pp.draw();

        System.out.println("------------------ Interface -------------------");
        Bulat bulat2 = new Bulat(2);
        PersegiPanjang pp2 = new PersegiPanjang(2,5);
        bulat2.calculateArea();
        pp.calculateArea();
        bulat2.draw();
        pp2.draw();
        System.out.println("------------------------------------------------");
    }
}