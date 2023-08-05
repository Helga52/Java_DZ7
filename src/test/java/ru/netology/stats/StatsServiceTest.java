package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatsServiceTest {

    @Test
    public void shouldCalculateTotalOfSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;

        // вызываем целевой метод:
        int actual = service.totalOfAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateAverageOfAllSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.averageOfAllSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMaxSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.maxSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMinSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;

        // вызываем целевой метод:
        int actual = service.minSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthUnderAverageSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.monthUnderAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateMonthOverAverageSales() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.monthOverAverageSales(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
