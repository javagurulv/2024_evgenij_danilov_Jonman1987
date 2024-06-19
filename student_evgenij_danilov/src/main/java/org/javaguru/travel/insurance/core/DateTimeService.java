package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class DateTimeService {
    public long calculateDaysCount(Date agreementDateFrom, Date agreementDateTo){
        return TimeUnit.DAYS.convert(agreementDateTo.getTime()
                - agreementDateFrom.getTime(), TimeUnit.MILLISECONDS);
    }
}
