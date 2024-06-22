package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.util.Date;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class TravelPremiumUnderwritingTest {
    @Mock
    private DateTimeService dateTimeService;

    @InjectMocks
    private TravelPremiumUnderwriting underwriting;

    private TravelCalculatePremiumRequest request;

    @BeforeEach
    public void setUp() {
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getAgreementDateFrom()).thenReturn(new Date());
        when(request.getAgreementDateTo()).thenReturn(new Date());
        when(dateTimeService.calculateDaysCount(request.getAgreementDateFrom(), request.getAgreementDateTo())).thenReturn(1L);
    }

    @Test
    public void calculateAgreementPriceTest(){
        BigDecimal days = underwriting.calculateDaysCount(request);

        Assertions.assertEquals(days, new BigDecimal(1L));
    }
}
