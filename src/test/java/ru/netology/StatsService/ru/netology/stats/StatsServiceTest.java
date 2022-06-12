package ru.netology.StatsService.ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumExist() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedSum = 180;
        int actualSum = service.sumSales (sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageSalesMonth = 15;
        int actualAverageSalesMonth = service.averageSalesPerMonth(sales);

        Assertions.assertEquals(expectedAverageSalesMonth, actualAverageSalesMonth);
    }

    @Test
    public void shouldFindMaxSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales = 8;
        int actualMaxSales = service.maxSales(sales);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }


    @Test
    public void shouldFindMinSales() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void shouldFindMinAverageSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinAverageSalesMonth = 5;
        int actualMinAverageSalesMonth = service.minAverageSalesMonth (sales);

        Assertions.assertEquals(expectedMinAverageSalesMonth, actualMinAverageSalesMonth);
    }

    @Test
    public void shouldFindMaxAverageSalesMonth() {
        StatsService service = new StatsService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxAverageSalesMonth = 5;
        int actualMaxAverageSalesMonth = service.maxAverageSalesMonth (sales);

        Assertions.assertEquals(expectedMaxAverageSalesMonth, actualMaxAverageSalesMonth);
    }
}
