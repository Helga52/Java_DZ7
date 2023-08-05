package ru.netology.stats;
//import java.util.arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        int totalSales = service.totalOfAllSales(sales);
        System.out.println("Сумма всех продаж " + totalSales);

        int averageSales = service.averageOfAllSales(sales);
        System.out.println("Средняя сумма продаж " + averageSales);

        int maxMonth = service.maxSales(sales);
        System.out.println("Номер месяца, в котором был максимум продаж " + maxMonth);

        int minMonth = service.minSales(sales);
        System.out.println("Номер месяца, в котором был минимум продаж " + minMonth);

        int countMonthUnderAvgSales = service.monthUnderAverageSales(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего " + countMonthUnderAvgSales);

        int countMonthOverAvgSales = service.monthOverAverageSales(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего " + countMonthOverAvgSales);
    }
}