public class Mahasiswa {
    String nim;
    String nama;
    String prodi;

    Mahasiswa(String nim, String nama, String prodi) {
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
    }

    void tampilMahasiswa() {
        System.out.println("----------------------");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Prodi : " + prodi);
        System.out.println("----------------------");
    }

    static void cariMahasiswa(String nim, Mahasiswa[] mahasiswa) {
        boolean ditemukan = false;
        for (int i = 0; i < mahasiswa.length; i++) {
            if (mahasiswa[i].nim.equalsIgnoreCase(nim)) {
                mahasiswa[i].tampilMahasiswa();
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Mahasiswa dengan NIM" + nim + " tidak ditemukan.");
        }
    }
}