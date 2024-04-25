package Tugas;
class Main {
    public static void main(String[] args) {
        TokoBuku tokoBuku = new TokoBuku();
        Pembaca pembaca = new Pembaca("Andi");

        tokoBuku.setPengamat(pembaca);

        tokoBuku.bukuBaruDatang("Belajar Java dengan Mudah");
    }
}