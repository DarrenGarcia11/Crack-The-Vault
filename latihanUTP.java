import java.util.Scanner;

public class latihanUTP {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int c = 5;
        int[] x = { 40, 73, 18, 91, 56 };
        int n = 0;
        String lanjut = "";
        int menang = 0;
        int kalah = 0;
        int max = Integer.MIN_VALUE;
        int skor = 0;
        int skorMax = 0;

        do {
            Scanner input = new Scanner(System.in);
            int level = input.nextInt();

            if (level <= 0 || level > 3) {
                System.out.println("Pilihan tidak valid! Pilih 1-3");
                level = input.nextInt();
                if (level <= 0 || level > 3) {
                    System.exit(0);
                }
            }
            System.out.println("MISI BRANKAS (Ronde " + (n + 1) + ")");
            System.out.println("Pilih level:");
            System.out.println("1. Mudah (10 kesempatan)");
            System.out.println("2. Sedang (7 kesempatan)");
            System.out.println("3. Sulit (5 kesempatan)");
            System.out.println("Pilihan: " + level);
            System.out.println();

            if (level == 1) {
                System.out.println("Brankas terkunci! Kamu punya 10 kesempatan.");
                for (int i = 0; i <= 10;) {
                    int jawab = input.nextInt();
                    if (jawab == x[n]) {
                        skor = (a - 1) * 100;
                        System.out.println("BRANKAS TERBUKA! Kode: " + x[n] + ".");
                        System.out.println("Percobaan: " + (11 - a) + " | Skor: " + skor);
                        menang = menang + 1;
                        break;
                    }
                    if ((jawab < 1 || jawab > 100) && i == 0) {
                        System.out.println("[Sisa " + (a - 1) + "] " + "Tebakan: " + jawab);
                    } else {
                        System.out.println("[Sisa " + (a - 1) + "] " + "Tebakan: " + jawab);
                    }
                    if (jawab > x[n] && jawab <= 100 && jawab > (x[n] + 5)) {
                        System.out.println("Terlalu tinggi!");
                    } else if (jawab < x[n] && jawab > 0 && jawab < (x[n] - 5)) {
                        System.out.println("Terlalu rendah!");
                    }
                    if ((jawab >= (x[n] - 5) && jawab <= (x[n] - 1)) || (jawab >= (x[n] + 1) && jawab <= (x[n] + 1))) {
                        System.out.println("Hampir! Kamu sangat dekat!");
                    }
                    if (jawab < 1 || jawab > 100) {
                        System.out.println("Di luar jangkauan");
                    } else {
                        a--;
                        i++;
                    }
                    if (i == 10 && jawab != x[n]) {
                        System.out.println("ALARM BERBUNYI! Kamu gagal. Kode yang benar: " + x[n] + ".");
                        kalah = kalah + 1;
                        break;
                    }
                }
            }

            if (level == 2) {
                System.out.println("Brankas terkunci! Kamu punya 7 kesempatan.");
                for (int i = 0; i <= 7;) {
                    int jawab = input.nextInt();
                    if (jawab == x[n]) {
                        skor = (b - 1) * 100 + 50;
                        System.out.println("BRANKAS TERBUKA! Kode: 40");
                        System.out.println("Percobaan: " + (8 - b) + " | Skor: " + skor);
                        menang = menang + 1;
                        break;
                    }
                    if ((jawab < 1 || jawab > 100) && i == 0) {
                        System.out.println("[Sisa " + (b) + "] " + "Tebakan: " + jawab);
                    } else {
                        System.out.println("[Sisa " + (b - 1) + "] " + "Tebakan: " + jawab);
                    }
                    if (jawab > x[n] && jawab <= 100 && jawab > (x[n] + 5)) {
                        System.out.println("Terlalu tinggi!");
                    } else if (jawab < x[n] && jawab > 0 && jawab < (x[n] - 5)) {
                        System.out.println("Terlalu rendah!");
                    }

                    if ((jawab >= (x[n] - 5) && jawab <= (x[n] - 1)) || (jawab >= (x[n] + 1) && jawab <= (x[n] + 5))) {
                        System.out.println("Hampir! Kamu sangat dekat!");
                    }
                    if (jawab < 1 || jawab > 100) {
                        System.out.println("Di luar jangkauan");
                    } else {
                        b--;
                        i++;
                    }

                    if (i == 7 && i != x[n]) {
                        System.out.println("ALARM BERBUNYI! Kamu gagal. Kode yang benar: " + x[n] + ".");
                        kalah = kalah + 1;
                        break;
                    }
                }
            }

            if (level == 3) {
                System.out.println("Brankas terkunci! Kamu punya 5 kesempatan.");
                for (int i = 0; i <= 5;) {
                    int jawab = input.nextInt();
                    if (jawab == x[n]) {
                        skor = ((c - 1) * 100) + 150;
                        System.out.println("BRANKAS TERBUKA! Kode: " + x[n] + ".");
                        System.out.println("Percobaan: " + (6 - c) + " | Skor: " + skor);
                        menang = menang + 1;
                        break;
                    }
                    if ((jawab < 1 || jawab > 100) && i == 0) {
                        System.out.println("[Sisa " + (c) + "] " + "Tebakan: " + jawab);
                    } else {
                        System.out.println("[Sisa " + (c - 1) + "] " + "Tebakan: " + jawab);
                    }
                    if (jawab > x[n] && jawab <= 100 && jawab > (x[n] + 5)) {
                        System.out.println("Terlalu tinggi!");
                    } else if (jawab < x[n] && jawab > 0 && jawab < (x[n] - 5)) {
                        System.out.println("Terlalu rendah!");
                    }

                    if ((jawab >= (x[n] - 5) && jawab <= (x[n] - 1)) || (jawab >= (x[n] + 1) && jawab <= (x[n] + 5))) {
                        System.out.println("Hampir! Kamu sangat dekat!");
                    }
                    if (jawab < 1 || jawab > 100) {
                        System.out.println("Di luar jangkauan");
                    } else {
                        c--;
                        i++;
                    }

                    if (i == 5 && i != x[n]) {
                        System.out.println("ALARM BERBUNYI! Kamu gagal. Kode yang benar: " + x[n] + ".");
                        kalah = kalah + 1;
                        break;
                    }
                }
            }
            if (skor > max) {
                skorMax = skor;
            }
            lanjut = input.next();
            n++;

        } while (lanjut.equals("Y") || lanjut.equals("y"));
        System.out.println();
        System.out.println("STATISTIK");
        System.out.println("Menang : " + menang);
        System.out.println("Kalah : " + kalah);
        System.out.println("Skor tertinggi: " + skorMax);
    }
}
