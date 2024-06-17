package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

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
}