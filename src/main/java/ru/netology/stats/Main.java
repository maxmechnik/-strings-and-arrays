package ru.netology.stats;

public class Main {

    public static void main(String[] args) {

        StatsService service = new StatsService();

        long minSales = service.minSales(new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(minSales);

        long sumSale = service.sumSale(new long[] {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18});
        System.out.println(sumSale);
    }



}