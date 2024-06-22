package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.dto.TravelCalculatePremiumResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.BeforeEach;
import java.math.BigDecimal;
import java.util.Date;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TravelCalculatePremiumServiceImplTest {
    @Mock
    private DateTimeService dateTimeService;

    @Mock
    private TravelCalculatePremiumRequestValidator validator;

    @InjectMocks
    private TravelCalculatePremiumServiceImpl service;

    private TravelCalculatePremiumRequest request;

    @BeforeEach
    public void setUp() {
        validator = new TravelCalculatePremiumRequestValidator();
        request = new TravelCalculatePremiumRequest("Ivan",
                "Petrov", new Date(2023, 10, 27), new Date(2023, 10, 28));
        when(dateTimeService.calculateDaysCount(request.getAgreementDateFrom(), request.getAgreementDateTo())).thenReturn(1L);
    }
    @Test
    public void testGetPersonFirstName() {
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getPersonFirstName(), request.getPersonFirstName());
    }

    @Test
    public void testGetPersonLastName() {
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getPersonLastName(), request.getPersonLastName());
    }

    @Test
    public void testGetAgreementDateFrom() {
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getAgreementDateFrom(), request.getAgreementDateFrom());
    }

    @Test
    public void testGetAgreementDateTo() {
        TravelCalculatePremiumResponse response = service.calculatePremium(request);

        Assertions.assertEquals(response.getAgreementDateTo(), request.getAgreementDateTo());
    }

    @Test
    public void testGetAgreementPrice() {
        TravelCalculatePremiumResponse response = service.calculatePremium(request);
        response.setAgreementPrice(new BigDecimal(service.calculateDaysCount(request)));

        Assertions.assertEquals(response.getAgreementPrice(), new BigDecimal(1));
    }
}