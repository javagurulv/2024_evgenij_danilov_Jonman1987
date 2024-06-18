package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

@Component
class TravelCalculatePremiumServiceImpl implements TravelCalculatePremiumService {
    @Override
    public TravelCalculatePremiumResponse calculatePremium(TravelCalculatePremiumRequest request) {
        TravelCalculatePremiumResponse response = new TravelCalculatePremiumResponse(request.getPersonFirstName(), request.getPersonLastName(),
                request.getAgreementDateFrom(), request.getAgreementDateTo());

        response.setAgreementPrice(calculateAgreementPrice(response));

        return response;
    }

    private BigDecimal calculateAgreementPrice(TravelCalculatePremiumResponse response){
        return new BigDecimal(TimeUnit.DAYS.convert(response.getAgreementDateTo().getTime()
                - response.getAgreementDateFrom().getTime(), TimeUnit.MILLISECONDS));
    }
}
