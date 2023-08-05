package ru.netology.stats;

public class StatService {
    public int totalOfAllSales(int[] sales) {
        int totalSales = 0; // первоначальное значение суммы всех продаж

        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i]; // суммируем продажи

        }

        return totalSales; // сумма всех продаж
    }

    public int averageOfAllSales(int[] sales) {
        int averageSales = totalOfAllSales(sales) / sales.length; // вычисляем среднюю сумму продаж
        return averageSales; // сумма всех продаж
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthUnderAverageSales(int[] sales) {
        int avgSales = averageOfAllSales(sales); // расчет средненго значения продаж
        int countMonthUnderAvgSales = 0; // первоначальное значение

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avgSales) { // значит, в рассматриваемом i-м месяце продажи меньше средего значения
                countMonthUnderAvgSales += 1; // увеличиваем счетчик
            }
        }

        return countMonthUnderAvgSales;
    }

    public int monthOverAverageSales(int[] sales) {
        int avgSales = averageOfAllSales(sales); // асчет средненго значения продаж
        int countMonthOverAvgSales = 0; // первоначальное значение

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avgSales) { // значит, в рассматриваемом i-м месяце продажи меньше средего значения
                countMonthOverAvgSales += 1; // увеличиваем счетчик
            }
        }

        return countMonthOverAvgSales;
    }
}