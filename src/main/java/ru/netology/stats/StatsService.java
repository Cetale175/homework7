package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long averageSale(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int monthMaxSale(long[] sales) {
        int months = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                months = i;
                maxSale = sales[i];
            }
        }
        return months + 1;
    }

    public int monthsMinSale(long[] sales) {
        int months = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                months = i;
                minSale = sales[i];
            }
        }
        return months + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < averageSale(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsOverAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > averageSale(sales)) {
                counter++;
            }
        }
        return counter;
    }


}
