import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Antrian antrian = new Antrian();

        boolean exit = false;
        while (!exit) {
            System.out.println("Selamat Datang di Sistem Antrian Pelanggan Rumah Makan!");
            boolean userExit = false;
            while (!userExit) {
                System.out.println("=======================================================");
                System.out.println("Pilih tindakan :");
                System.out.println("1. Tambah Antrian Pelanggan (Push)");
                System.out.println("2. Lepas antrian pelanggan terdepan (Pop)");
                System.out.println("3. Tampilkan antrian");
                System.out.println("4. Exit");
                System.out.print("Masukkan pilihan: ");

                int action = scanner.nextInt();
                scanner.nextLine();

                switch (action) {
                    case 1 :
                        System.out.println("Masukkan nama pelanggan :");
                        String name = scanner.nextLine();
                        antrian.push(name);
                        break;
                    case 2 :
                        antrian.pop();
                        break;
                    case 3 :
                        antrian.displayQueue();
                        break;
                    case 4 :
                        userExit = true;
                        exit = true;
                        System.out.println("Anda telah keluar dari Sistem Antrian Pelanggan Rumah Makan!.");
                        break;
                    default :
                        System.out.println("Pilihan tidak valid! Silahkan coba lagi.");
                }
            }

        }
        scanner.close();
    }
}
