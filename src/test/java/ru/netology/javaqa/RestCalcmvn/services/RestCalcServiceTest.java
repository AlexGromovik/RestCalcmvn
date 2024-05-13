package ru.netology.javaqa.RestCalcmvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestCalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/RestCalc.csv")
    public void testIncomeHigherExpenses(int expected, int income, int expenses, int threshold) {
        RestCalcService service = new RestCalcService();

        // int expected = 3;
        int actual = service.restCalc(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
    // @Test
    // public void testIncomeLowerLimitRestExpenses() {
    //    RestCalcService service = new RestCalcService();

    //    int expected = 2;
    //    int actual = service.restCalc(100_000, 60_000, 150_000);

    //    Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void testIncomeLowerExpenses() {
//        RestCalcService service = new RestCalcService();
//
//        int expected = 0;
//        int actual = service.restCalc(10_000, 12_000, 20_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void testLowerRestExpenses() {
//        RestCalcService service = new RestCalcService();
//
//        int expected = 8;
//        int actual = service.restCalc(10_000, 3_000, 0);
//
//        Assertions.assertEquals(expected, actual);
//    }
//    @Test
//    public void testZeroExpenses() {
//        RestCalcService service = new RestCalcService();
//
//        int expected = 4;
//        int actual = service.restCalc(10_000, 0, 20_000);
//
//        Assertions.assertEquals(expected, actual);
//    }
}
