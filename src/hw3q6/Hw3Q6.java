package hw3q6;

public class Hw3Q6 {

    public static int isHardyRamajuan(int sayi) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        for (a = 1; a < Math.sqrt(sayi); b++) {
            for (b = 1; b < Math.sqrt(sayi); b++) {
                if (sayi == (Math.pow(a, 3) + Math.pow(b, 3))) {
                    break;
                }
            }
            if (sayi == (Math.pow(a, 3) + Math.pow(b, 3))) {
                break;
            }

        }

        for (c = 1; c < Math.sqrt(sayi); c++) {
            for (d = 1; d < Math.sqrt(sayi); d++) {
                if (sayi == (Math.pow(c, 3) + Math.pow(d, 3)) && c != a) {
                    break;
                }
            }
            if (sayi == (Math.pow(c, 3) + Math.pow(d, 3)) && c != a) {
                break;
            }
        }

        if (sayi == (Math.pow(a, 3) + Math.pow(b, 3)) && sayi == (Math.pow(c, 3) + Math.pow(d, 3)) && c != a) {
            System.out.println(sayi + " -> This is a Hardy-Ramajuan number.");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        } else {
            System.out.println(sayi + " -> This is'nt a Hardy-Ramajuan number.");
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
        return 0;
    }

    public static void main(String[] args) {
        isHardyRamajuan(1729);

    }

}
