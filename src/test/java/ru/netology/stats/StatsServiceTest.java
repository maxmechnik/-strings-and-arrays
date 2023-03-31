package ru.netology.stats;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    StatsService service;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        service = new StatsService();
    }

    @Test
    void minSales() {


        long minMonth = service.minSales(new long[]{4, 5, 6, 9, 12, 14});
        assertEquals(1, minMonth);

        long minSales = service.minSales(new long[]{4, 5, 6, 9, 12, 14, 45, 12, 18, 4, 11, 56});
        assertEquals(10, minSales);

    }

    @Test
    void sumSale() {

        long sumSale = service.sumSale(new long[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(28, sumSale);

    }

    @Test
    void belowTheAverage() {

        long belowTheAverage = service.belowTheAverage(new long[]{5, 5, 5, 10, 10, 10, 11});
        assertEquals(3, belowTheAverage);

    }

    @Test
    void aboveAverage() {
        long aboveAverage = service.aboveAverage(new long[]{5, 5, 5, 12, 12, 12, 11});
        assertEquals(4, aboveAverage);
    }


    @Test
    void averageSum() {
        long averageSum = service.average(new long[]{5, 5, 5, 12, 12, 12, 11});
        assertEquals(8, averageSum);
    }

    @Test
    void peakSales() {
        long peakSales = service.peakSales(new long[]{4, 2, 13, 21, 2, 12});
        assertEquals(4, peakSales);
        long peakSalesTest2 = service.peakSales(new long[]{4, 2, 12, 21, 12, 21});
        assertEquals(6, peakSalesTest2);
    }

}