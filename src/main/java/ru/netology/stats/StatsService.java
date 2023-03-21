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


    public long nijesred(long[] sales) {
        long nijesred = 0;
        long srednee = sumProdaj(sales) / sales.length;
        for (long mesyac : sales) {
            if (srednee >= mesyac)
                nijesred = nijesred + 1;

        }
        return nijesred;

    }

    public long visheSred(long[] sales) {
        long visheSred = 0;
        long srednee = sumProdaj(sales) / sales.length;
        for (long mesyac : sales) {
            if (srednee <= mesyac)
                visheSred = visheSred + 1;

        }
        return visheSred;
    }

    public long sumProdaj(long[] sales) {
        long summa = 0;
        for (int i = 0; i <= sales.length - 1; i++)
            summa = summa + sales[i];
        return summa;

    }

    public long srednee(long[] sales) {
        long summa = sumProdaj(sales);
        long kol = sales.length;
        long sr = summa / kol;
        return sr;

    }

    public long pikpr(long[] sales) {
        long max = 0;
        int nomer = 0;
        for (int i = 0; i <= sales.length - 1; i++)
            if (max < sales[i]) {
                max = sales[i];
                nomer = i;
            }
        return nomer + 1;

    }


}


