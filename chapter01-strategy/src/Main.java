public class Main {
    public static void main(String[] args){
        // File Duck.java
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck modelduck = new ModelDuck();
        modelduck.performFly(); // Akan memanggil constructor modelduck(FlyNoWay())
        modelduck.setFlyBehavior(new FlyWithRocketPower());
        modelduck.performFly();

        // File Operasi.java
        Kalkulator kalkulator = new Kalkulator();

        // Menggunakan operasi penjumlahan
        kalkulator.aturOperasi(new Penjumlahan());
        System.out.println("Hasil penjumlahan: " + kalkulator.hitung(5, 3));

        // Menggunakan operasi pengurangan
        kalkulator.aturOperasi(new Pengurangan());
        System.out.println("Hasil pengurangan: " + kalkulator.hitung(10, 4));

    }
}