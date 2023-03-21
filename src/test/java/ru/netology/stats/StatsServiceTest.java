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


        long minmesyac = service.minSales(new long[]{4, 5, 6, 9, 12, 14});
        assertEquals(1, minmesyac);

        long minS1 = service.minSales(new long[]{4, 5, 6, 9, 12, 14, 45, 12, 18, 4, 11, 56});
        assertEquals(10, minS1);

    }

    @Test
    void sumProdaj() {

        long sumprodaj = service.sumProdaj(new long[]{1, 2, 3, 4, 5, 6, 7});
        assertEquals(28, sumprodaj);

    }

    @Test
    void nijesred() {

        long nijesred = service.nijesred(new long[]{5, 5, 5, 10, 10, 10, 11});
        assertEquals(3, nijesred);

    }

    @Test
    void visheSred() {
        long visheSred = service.visheSred(new long[]{5, 5, 5, 12, 12, 12, 11});
        assertEquals(4, visheSred);
    }


    @Test
    void sredSumm() {
        long sredsumm = service.srednee(new long[]{5, 5, 5, 12, 12, 12, 11});
        assertEquals(8, sredsumm);
    }

    @Test
    void pikPr() {
        long pikPr = service.pikpr(new long[]{4, 2, 13, 21, 2, 12});
        assertEquals(4, pikPr);
    }
}