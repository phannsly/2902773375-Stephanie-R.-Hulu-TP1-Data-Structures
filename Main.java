import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Membuat array objek mahasiswa
        Mahasiswa[] daftar = new Mahasiswa[5];

        // Membuat 5 objek mahasiswa
        daftar[0] = new Mahasiswa(
                "Andi Pratama",
                "2440001",
                "Teknik Informatika",
                3.75);

        daftar[1] = new Mahasiswa(
                "Budi Santoso",
                "2440002",
                "Sistem Informasi",
                3.40);

        daftar[2] = new Mahasiswa(
                "Citra Lestari",
                "2440003",
                "Teknik Informatika",
                3.90);

        daftar[3] = new Mahasiswa(
                "Joni Suhartono",
                "2440004",
                "Teknik Industri",
                3.00);

        daftar[4] = new Mahasiswa(
                "Bulan Suci",
                "2440005",
                "Akuntansi",
                3.20);

        // Menampilkan seluruh data mahasiswa
        System.out.println("=== DATA MAHASISWA ===");

        for (Mahasiswa mhs : daftar) {
            mhs.tampilkanInfo();
            System.out.println("Status    : " + mhs.cekKelulusan());
            System.out.println("Predikat  : " + mhs.hitungPredikat());
            System.out.println();
        }

        // Update IPK berdasarkan NIM
        System.out.print("Masukkan NIM mahasiswa yang ingin diupdate: ");
        String cariNim = input.nextLine();

        boolean ditemukan = false;

        for (Mahasiswa mhs : daftar) {

            if (mhs.getNim().equals(cariNim)) {

                System.out.print("Masukkan IPK baru: ");
                double ipkBaru = input.nextDouble();

                mhs.updateIpk(ipkBaru);

                System.out.println("\nData berhasil diperbarui!");

                System.out.println("\n=== DATA MAHASISWA ===");
                mhs.tampilkanInfo();
                System.out.println("Status    : " + mhs.cekKelulusan());
                System.out.println("Predikat  : " + mhs.hitungPredikat());

                ditemukan = true;
                break;
            }
        }

        if (!ditemukan) {
            System.out.println("NIM tidak ditemukan!");
        }

        input.close();
    }
}