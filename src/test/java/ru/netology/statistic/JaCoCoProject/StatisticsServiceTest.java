package ru.netology.statistic.JaCoCoProject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {5, 7, 13, 17, 5, 9, 5, 2, 19, 21, 17};

        long expected = 21;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}