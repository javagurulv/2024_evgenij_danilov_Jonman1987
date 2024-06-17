package org.javaguru.travel.insurance.core;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class TravelCalculatePremiumServiceImplAIEachFieldTest {
    private final TravelCalculatePremiumService service = new TravelCalculatePremiumServiceImpl();

    @Test
    void testCalculatePremium_FirstName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "John", "Doe",
                new Date(2023, 10, 27),
                new Date(2023, 11, 10)
        );
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals("John", response.getPersonFirstName());
    }

    @Test
    void testCalculatePremium_LastName() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "John", "Doe",
                new Date(2023, 10, 27),
                new Date(2023, 11, 10)
        );
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals("Doe", response.getPersonLastName());
    }

    @Test
    void testCalculatePremium_AgreementDateFrom() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "John", "Doe",
                new Date(2023, 10, 27),
                new Date(2023, 11, 10)
        );
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(new Date(2023, 10, 27), response.getAgreementDateFrom());
    }

    @Test
    void testCalculatePremium_AgreementDateTo() {
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "John", "Doe",
                new Date(2023, 10, 27),
                new Date(2023, 11, 10)
        );
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        assertEquals(new Date(2023, 11, 10), response.getAgreementDateTo());
    }
}
