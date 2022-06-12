package ru.netology.StatsService.ru.netology.stats;

public class StatsService {

    public int sumSales(int[] sales) {
        int sum = 0;
        for (int sale = 0; sale < sales.length; sale++) {
            sum = sum + sales[sale];
        }
        return sum;
    }

    public int averageSalesPerMonth(int[] sales) {
        int averageSales;
        int sum = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sum = sum + sales[sale];
        }
        averageSales = sum / sales.length;
        return averageSales;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0; //начальный элемент массива
        int month = 0;// каждый следующий элемент массива

        for (long sale : sales) {
            if (sale > sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        for (month = 0; month < sales.length; month++) {
            if (sales[maxMonth] == sales[month] && month > maxMonth) {
                maxMonth = month;
            }
        }
        return maxMonth + 1;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale < sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        for (month = 0; month < sales.length; month++) {
            if (sales[minMonth] == sales[month] && month > minMonth) {
                minMonth = month;
            }
        }
        return minMonth + 1;
    }

    public int minAverageSalesMonth(int[] sales) {
        int averageSales;
        int sum = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sum = sum + sales[sale];
        }
        averageSales = sum / sales.length;

        int minMonths = 0;
        int totalMinMonths = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[minMonths] < averageSales) {


                minMonths = minMonths + 1;

                totalMinMonths = totalMinMonths + 1;

            } else {
                minMonths = minMonths + 1;

            }
        }
        return totalMinMonths;
    }

    public int maxAverageSalesMonth(int[] sales) {
        int averageSales;
        int sum = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            sum = sum + sales[sale];
        }
        averageSales = sum / sales.length;

        int maxMonths = 0;
        int totalMaxMonths = 0;

        for (int sale = 0; sale < sales.length; sale++) {
            if (sales[maxMonths] > averageSales) {


                maxMonths = maxMonths + 1;

                totalMaxMonths = totalMaxMonths + 1;

            } else {
                maxMonths = maxMonths + 1;

            }
        }
        return totalMaxMonths;
    }

}
