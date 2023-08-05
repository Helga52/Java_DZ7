package ru.netology.stats;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatServiceTest {

    @Test
    public void shouldCalculateTotalOfSales() {
        StatService service = new StatService();

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
        StatService service = new StatService();

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
        StatService service = new StatService();

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
        StatService service = new StatService();

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
        StatService service = new StatService();

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
        StatService service = new StatService();

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
