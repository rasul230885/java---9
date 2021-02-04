package ru.netology.statistics;

public class StatsService {
    public int summarySales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonthSales(int[] sales) {
        int averageSales = 0;
        int sum = summarySales(sales);
        averageSales = sum / sales.length;
        return averageSales;
    }

    public int monthMaximumSales(int[] sales) {
        int monthMaximum = sales[0];
        int counter = 0;
        int numberOfMaximumMonth = 0;
        for (int sale : sales) {
            counter = counter + 1;
            if (monthMaximum <= sale) {
                monthMaximum = sale;
                numberOfMaximumMonth = counter;
            }
        }
        return numberOfMaximumMonth;
    }

    public int monthMinimumSales(int[] sales) {
        int monthMaximum = sales[0];
        int counter = 0;
        int numberOfMinimumMonth = 0;
        for (int sale : sales) {
            counter = counter + 1;
            if (monthMaximum >= sale) {
                monthMaximum = sale;
                numberOfMinimumMonth = counter;
            }
        }
        return numberOfMinimumMonth;
    }

    public int monthUnderAverageSales(int[] sales) {
        int counter = 0;
        int monthUnderMiddleSales = sales[0];
        int averageSales = averageMonthSales(sales);
        for (int sale : sales) {
            if (averageSales > sale) {
                counter = counter + 1;
            }
        }
        return counter;
    }

    public int monthOverAverageSales(int[] sales) {
        int counter = 0;
        int monthOverMiddleSales = sales[0];
        int averageSales = averageMonthSales(sales);
        for (int sale : sales) {
            if (averageSales < sale) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}
