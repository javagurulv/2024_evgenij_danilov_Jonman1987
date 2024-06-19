package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTimeServiceTest {
    @Test
    public void getAgreementPriceTest(){
        DateTimeService dateTimeService = new DateTimeService(new Date(2023, 10, 27), new Date(2023, 10, 28));

        Assertions.assertEquals(dateTimeService.getDaysCount(), 1);
    }

    @Test
    public void setAgreementPriceTest(){
        DateTimeService dateTimeService = new DateTimeService();
        dateTimeService.setDaysCount(1L);

        Assertions.assertEquals(dateTimeService.getDaysCount(), 1);
    }

    @Test
    public void calculateAgreementPriceTest(){
        DateTimeService dateTimeService = new DateTimeService();
        dateTimeService.calculateDaysCount(new Date(2023, 10, 27), new Date(2023, 10, 28));

        Assertions.assertEquals(dateTimeService.getDaysCount(), 1);
    }
}
