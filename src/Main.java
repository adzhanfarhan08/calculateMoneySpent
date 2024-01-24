import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name;
        Integer moneySpent;
        Double average;
        Integer total;
        Integer totalDay = 7;

        Scanner input = new Scanner(System.in);

        System.out.print("Total pengeluaran hari Senin\tRp ");
        moneySpent = input.nextInt();
        total = moneySpent;

        System.out.print("Total pengeluaran hari Selasa\tRp ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.print("Total pengeluaran hari Rabu\t\tRp ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.print("Total pengeluaran hari Kamis\tRp ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.print("Total pengeluaran hari Jum'at\tRp ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.print("Total pengeluaran hari Sabtu\tRp ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        System.out.print("Total pengeluaran hari Minggu\tRp ");
        moneySpent = input.nextInt();
        total = total + moneySpent;

        average = (double) total / totalDay;
        System.out.print("Rata-rata pengeluaran dalam 7 hari adalah\tRp " + average);

    }
}