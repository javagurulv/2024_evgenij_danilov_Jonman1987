package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class DateTimeServiceTest {
    @Test
    public void getAgreementPriceTest(){
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse("Ivan",
                "Petrov", new Date(2023, 10, 27), new Date(2023, 10, 28));

        DateTimeService dateTimeService = new DateTimeService(response);

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
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse("Ivan",
                "Petrov", new Date(2023, 10, 27), new Date(2023, 10, 28));

        DateTimeService dateTimeService = new DateTimeService();
        dateTimeService.calculateDaysCount(response);

        Assertions.assertEquals(dateTimeService.getDaysCount(), 1);
    }
}
