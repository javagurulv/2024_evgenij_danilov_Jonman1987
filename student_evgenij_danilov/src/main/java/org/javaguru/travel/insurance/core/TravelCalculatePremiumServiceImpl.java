package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {
    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse(request.getPersonFirstName(), request.getPersonLastName(),
                request.getAgreementDateFrom(), request.getAgreementDateTo());

        response.setAgreementPrice(BigDecimal.valueOf(response.getAgreementDateTo().getTime()
                - response.getAgreementDateFrom().getTime()));

        return response;
    }
}
