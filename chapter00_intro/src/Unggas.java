public class Unggas {
    public String warna;

    public void berjalan() {
        System.out.println("Berjalan");
    }

    public void suara() {
        System.out.println("Berkokok");
    }
}

class BisaTerbang extends Unggas {
    public void terbang() {
        System.out.println("Terbang Tinggi");
    }
}

class TidakBisaTerbang extends Unggas {
    public void terbang() {
        System.out.println("Lompat");
    }
}
