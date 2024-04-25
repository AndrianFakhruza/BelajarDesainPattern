package Tugas;
interface Pengamat {
    void perbarui(String pesan);
}

interface Subjek {
    void setPengamat(Pengamat o);
    void beritahuPengamat();
}


class TokoBuku implements Subjek {
    private Pengamat pengamat;
    private String bukuBaru;

    public void bukuBaruDatang(String bukuBaru) {
        this.bukuBaru = bukuBaru;
        beritahuPengamat();
    }

    @Override
    public void setPengamat(Pengamat o) {
        this.pengamat = o;
    }

    @Override
    public void beritahuPengamat() {
        if (pengamat != null) {
            pengamat.perbarui("Buku baru telah tiba: " + bukuBaru);
        }
    }
}

class Pembaca implements Pengamat {
    private String nama;

    public Pembaca(String nama) {
        this.nama = nama;
    }

    @Override
    public void perbarui(String pesan) {
        System.out.println(nama + " mendapatkan notifikasi: " + pesan);
    }
}