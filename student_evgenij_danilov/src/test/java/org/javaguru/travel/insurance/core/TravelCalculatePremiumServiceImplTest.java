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

        TravelCalculatePremiumServiceImpl example = new TravelCalculatePremiumServiceImpl();

        Assertions.assertEquals(request.getPersonFirstName(), example.calculatePremium(request).getPersonFirstName());
    }

    @Test
    public void testGetPersonLastName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(), new Date());

        TravelCalculatePremiumServiceImpl example = new TravelCalculatePremiumServiceImpl();

        Assertions.assertEquals(request.getPersonLastName(), example.calculatePremium(request).getPersonLastName());
    }

    @Test
    public void testGetAgreementDateFrom() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(), new Date());

        TravelCalculatePremiumServiceImpl example = new TravelCalculatePremiumServiceImpl();

        Assertions.assertEquals(request.getAgreementDateFrom(), example.calculatePremium(request).getAgreementDateFrom());
    }

    @Test
    public void testGetAgreementDateTo() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(), new Date());

        TravelCalculatePremiumServiceImpl example = new TravelCalculatePremiumServiceImpl();

        Assertions.assertEquals(request.getAgreementDateTo(), example.calculatePremium(request).getAgreementDateTo());
    }
}