package org.javaguru.travel.insurance.core;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
class TravelPremiumUnderwriting {
    private DateTimeService dateTimeService;

    BigDecimal calculateDaysCount(TravelCalculatePremiumRequest request) {
        return new BigDecimal(dateTimeService.calculateDaysCount(request.getAgreementDateFrom(), request.getAgreementDateTo()));
    }
}
