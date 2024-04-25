// Interface untuk operasi
interface Operasi {
    int lakukanOperasi(int angka1, int angka2);
}

// Implementasi operasi penjumlahan
class Penjumlahan implements Operasi {
    public int lakukanOperasi(int angka1, int angka2) {
        return angka1 + angka2;
    }
}

// Implementasi operasi pengurangan
class Pengurangan implements Operasi {
    public int lakukanOperasi(int angka1, int angka2) {
        return angka1 - angka2;
    }
}

// Konteks yang menggunakan operasi
class Kalkulator {
    private Operasi operasi;

    public void aturOperasi(Operasi operasi) {
        this.operasi = operasi;
    }

    public int hitung(int angka1, int angka2) {
        return operasi.lakukanOperasi(angka1, angka2);
    }
}