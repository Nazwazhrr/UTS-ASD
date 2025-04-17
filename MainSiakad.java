import java.util.Scanner;

public class MainSiakad {
    
    public static void main(String[] args) {
        Scanner input15 = new Scanner(System.in);
        Mahasiswa [] dataMhs = {
            new Mahasiswa("22001", "Ali Rahman", "Informatika"),
            new Mahasiswa("22002", "Budi Santoso", "Iformatika"),
            new Mahasiswa("22003", "Citra Dewi", "Sistem Informasi Bisnis"),
        };
    
        Matakuliah [] dataMtk = {
            new Matakuliah("MK001", "Struktur Data", 3),
            new Matakuliah("MK002", "Basis Data", 3),
            new Matakuliah("MK003", "Desain Web", 3),
        };
    
        Penilaian [] dataPenilaian = {
            new Penilaian(dataMhs[0], dataMtk[0], 80, 85, 90),
            new Penilaian(dataMhs[0], dataMtk[1], 60, 75, 70),
            new Penilaian(dataMhs[1], dataMtk[0], 75, 70, 80),
            new Penilaian(dataMhs[2], dataMtk[1], 85, 90, 95),
            new Penilaian(dataMhs[2], dataMtk[2], 80, 90, 65), 
        };
        int pilihan;
        
        do {
            System.out.println("===MENU SISTEM AKADEMIK===");
            System.out.println("1. Tampilkan Daftar Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mata Kuliah");
            System.out.println("3. Tampilkan Dats Penilaian");
            System.out.println("4. Urutkan Mahasiswa Berdasarkan Nilai Akhir");
            System.out.println("5. Cari Mahasiswa Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih Menu : ");
            pilihan = input15.nextInt();
            input15.nextLine();
            
            switch (pilihan) {
                case 1: 
                    System.out.println("Data Mahasiswa");
                    for (Mahasiswa mhs : dataMhs) {
                        mhs.tampilMahasiswa();
                    }
                    break;
                case 2:
                    System.out.println("Data Mata Kuliah");
                    for (Matakuliah mtk : dataMtk) {
                        mtk.tampilMataKuliah();
                    }
                    break;
                case 3:
                    System.out.println("Data Penilaian");
                    for (Penilaian penilaian : dataPenilaian) {
                        penilaian.tampilPenilaian();
                    }
                    break;
                case 4:
                    Penilaian.InsertionSort(dataPenilaian);
                    System.out.println("Data Mahasiswa Urutkan Berdasarkan Nilai Akhir");
                    for (Penilaian penilaian : dataPenilaian) {
                        penilaian.tampilPenilaian();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan NIM Mahasiswa yang dicari : ");
                    String nim = input15.nextLine();
                    Mahasiswa.cariMahasiswa(nim, dataMhs);
                    break;
                case 0:
                    System.out.println("Terima kasih! Sampai jumpa.");
                    input15.close();
                    break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                 }
        } while (pilihan !=0);
    }
}

