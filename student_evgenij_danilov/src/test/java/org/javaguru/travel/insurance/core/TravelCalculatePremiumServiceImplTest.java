package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class TravelCalculatePremiumServiceImplTest {

    @Test
    public void testGetPersonFirstName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(2023, 10, 27), new Date(2023, 10, 28));
        DateTimeService dateTimeService = new DateTimeService();
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl(dateTimeService);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }

    @Test
    public void testGetPersonLastName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(2023, 10, 27), new Date(2023, 10, 28));
        DateTimeService dateTimeService = new DateTimeService();
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl(dateTimeService);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }

    @Test
    public void testGetAgreementDateFrom() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(2023, 10, 27), new Date(2023, 10, 28));
        DateTimeService dateTimeService = new DateTimeService();
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl(dateTimeService);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

    @Test
    public void testGetAgreementDateTo() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(2023, 10, 27), new Date(2023, 10, 28));
        DateTimeService dateTimeService = new DateTimeService();
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl(dateTimeService);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }

    @Test
    public void testGetAgreementPrice() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(2023, 10, 27), new Date(2023, 10, 28));
        DateTimeService dateTimeService = new DateTimeService();
        TravelCalculatePremiumServiceImpl service = new TravelCalculatePremiumServiceImpl(dateTimeService);

        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        response.setAgreementPrice(new BigDecimal(service.calculateDaysCount(request)));

        Assertions.assertEquals(response.getAgreementPrice(), new BigDecimal(1));
    }
}