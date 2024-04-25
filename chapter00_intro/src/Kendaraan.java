interface Kendaraan {
    void berjalan();
    void berhenti();
}

class Sepeda implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("berjalan dengan dikayuh");
    }

    @Override
    public void berhenti() {
        System.out.println("berhenti dengan menekan rem");
    }
}

class SepedaMotor implements Kendaraan {

    @Override
    public void berjalan() {
        System.out.println("berjalan dengan mesin");
    }

    @Override
    public void berhenti() {
        System.out.println("berhenti dengan mematikan mesin");
    }

    public void klakson() {
        System.out.println("Tiiinn Tiinn");
    }
}