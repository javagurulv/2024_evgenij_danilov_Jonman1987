package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Date;

class TravelCalculatePremiumServiceImplTest {

    @Test
    public void testGetPersonFirstName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(), new Date());

        TravelCalculatePremiumServiceImpl response = new TravelCalculatePremiumServiceImpl();

        Assertions.assertEquals(request.getPersonFirstName(), response.calculatePremium(request).getPersonFirstName());
    }

    @Test
    public void testGetPersonLastName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(), new Date());

        TravelCalculatePremiumServiceImpl response = new TravelCalculatePremiumServiceImpl();

        Assertions.assertEquals(request.getPersonLastName(), response.calculatePremium(request).getPersonLastName());
    }

    @Test
    public void testGetAgreementDateFrom() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(), new Date());

        TravelCalculatePremiumServiceImpl response = new TravelCalculatePremiumServiceImpl();

        Assertions.assertEquals(request.getAgreementDateFrom(), response.calculatePremium(request).getAgreementDateFrom());
    }

    @Test
    public void testGetAgreementDateTo() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(), new Date());

        TravelCalculatePremiumServiceImpl response = new TravelCalculatePremiumServiceImpl();

        Assertions.assertEquals(request.getAgreementDateTo(), response.calculatePremium(request).getAgreementDateTo());
    }

    @Test
    public void testGetAgreementPrice() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(2023, 10, 27), new Date(2023, 10, 28));

        TravelCalculatePremiumServiceImpl response = new TravelCalculatePremiumServiceImpl();

        BigDecimal bigDecimal = new BigDecimal(86400000);

        Assertions.assertEquals(bigDecimal, response.calculatePremium(request).getAgreementPrice());
    }
}