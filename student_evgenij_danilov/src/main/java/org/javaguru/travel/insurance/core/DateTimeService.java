package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;

import java.util.concurrent.TimeUnit;

public class DateTimeService {
    long daysCount;

    public DateTimeService(){

    }

    public DateTimeService(TravelCalculatePremiumResponse response){
        daysCount = calculateAgreementPrice(response);
    }

    public long getDaysCount(){
        return daysCount;
    }

    public void setDaysCount(long daysCount){
        this.daysCount = daysCount;
    }

    public long calculateAgreementPrice(TravelCalculatePremiumResponse response){
        daysCount = TimeUnit.DAYS.convert(response.getAgreementDateTo().getTime()
                - response.getAgreementDateFrom().getTime(), TimeUnit.MILLISECONDS);

        return daysCount; // Сделал возвращаемое значение, чтобы можно было увидеть результат калькуляции
    }
}
