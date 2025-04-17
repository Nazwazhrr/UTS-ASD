public class Matakuliah {
    String kodeMK;
    String namaMK;
    int sks;

    Matakuliah(String kodeMK, String namaMK, int sks) {
    this.kodeMK = kodeMK;
    this.namaMK = namaMK;
    this.sks = sks;
    }

    void tampilMataKuliah() {
        System.out.println("----------------------");
        System.out.println("KodeMK : " + kodeMK);
        System.out.println("NamaMK : " + namaMK);
        System.out.println("SKS : " + sks);
        System.out.println("----------------------");
    }
}
