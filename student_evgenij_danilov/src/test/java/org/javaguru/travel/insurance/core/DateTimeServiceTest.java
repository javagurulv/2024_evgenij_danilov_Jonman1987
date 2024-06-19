package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTimeServiceTest {
    @Test
    public void calculateAgreementPriceTest(){
        DateTimeService dateTimeService = new DateTimeService();
        long days = dateTimeService.calculateDaysCount(new Date(2023, 10, 27), new Date(2023, 10, 28));

        Assertions.assertEquals(days, 1);
    }
}
