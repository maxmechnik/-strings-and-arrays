package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public long belowTheAverage(long[] sales) {
        long belowTheAverage = 0;
        long srednee = sumSale(sales) / sales.length;
        for (long mesyac : sales) {
            if (srednee >= mesyac) {
                belowTheAverage = belowTheAverage + 1;
            }

        }
        return belowTheAverage;

    }

    public long aboveAverage(long[] sales) {
        long aboveAverage = 0;
        long srednee = sumSale(sales) / sales.length;
        for (long mesyac : sales) {
            if (srednee <= mesyac) {
                aboveAverage = aboveAverage + 1;
            }
        }
        return aboveAverage;
    }

    public long sumSale(long[] sales) {
        long summa = 0;
        for (int i = 0; i <= sales.length - 1; i++) {
            summa = summa + sales[i];
        }
        return summa;

    }

    public long average(long[] sales) {
        long sum = sumSale(sales);
        long quantity = sales.length;
        long average = sum / quantity;
        return average;

    }

    public long peakSales(long[] sales) {
        long max = 0;
        int number = 0;
        for (int i = sales.length -1; i >= 0; i--) {
            if (max < sales[i]) {
                max = sales[i];
                number = i;
            }
        }
        return number + 1;

    }


}


