public class Penilaian {
    Mahasiswa mhs;
    Matakuliah mk;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    public Penilaian(Mahasiswa mhs, Matakuliah mk, double nilaiTugas, double nilaiUTS, double nilaiUAS){
        this.mhs = mhs;
        this.mk = mk;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
        hitungNilaiAkhir();
    }

    void hitungNilaiAkhir() {
        nilaiAkhir = (nilaiTugas * 0.3) + (nilaiUTS * 0.3) + (nilaiUAS * 0.4);
    }

    void tampilPenilaian(){
        System.out.println(mhs.nama + " | " + mk.namaMK + " | Nilai Akhir : " + nilaiAkhir);
    }

    static void InsertionSort(Penilaian[] nilai){
        for (int i = 1; i < nilai.length; i++) {
            Penilaian temp = nilai[i];
            int j = i;
            while (j > 0 && nilai[j-1].nilaiAkhir < temp.nilaiAkhir){
                nilai[j] = nilai[j-1];
                j--;
            }
            nilai[j] = temp;
        }
    }
}
