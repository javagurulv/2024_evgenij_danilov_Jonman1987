package org.javaguru.travel.insurance.core;
import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.dto.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class TravelCalculatePremiumServiceImplAIOneTest {
    private DateTimeService dateTimeService = new DateTimeService();
    private TravelCalculatePremiumRequestValidator validator = new TravelCalculatePremiumRequestValidator();
    private final TravelCalculatePremiumService service = new TravelCalculatePremiumServiceImpl(dateTimeService, validator);

    @Test
    void testCalculatePremium() {
        // Arrange
        TravelCalculatePremiumRequest request = new TravelCalculatePremiumRequest(
                "John", "Doe",
                new Date(2023, 10, 27),
                new Date(2023, 11, 10)
        );

        // Act
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        // Assert
        assertEquals("John", response.getPersonFirstName());
        assertEquals("Doe", response.getPersonLastName());
        assertEquals(new Date(2023, 10, 27), response.getAgreementDateFrom());
        assertEquals(new Date(2023, 11, 10), response.getAgreementDateTo());
    }
}
