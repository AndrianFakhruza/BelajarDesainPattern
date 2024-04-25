abstract public class Employee {
    abstract void printInfo(); // abstract method : method tanpa implementasi
    void companyInfo() { // konkret method : method dengan implementasi
        System.out.println("Karyawan dari PT.DaunTerbang");
    }
}

class NewEmployee extends Employee {

    @Override
    void printInfo() {
        String name = "Andre";
        int age = 21;
        float salary = 200.2F;

        System.out.println("Nama : " + name);
        System.out.println("Umur : " + age);
        System.out.println("gaji : " + salary + " Dollar");
    }
}

class OldEmployee extends Employee {

    @Override
    void printInfo() {
        String nama = "Samsuddin";
        int age = 45;
        float salary = 500.2F;

        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + age);
        System.out.println("gaji : " + salary + " Dollar");
    }
}