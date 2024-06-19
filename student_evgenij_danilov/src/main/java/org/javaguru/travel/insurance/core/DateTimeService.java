package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.rest.TravelCalculatePremiumResponse;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

@Component
public class DateTimeService {
    long daysCount;

    public DateTimeService(){

    }

    public DateTimeService(Date agreementDateFrom, Date agreementDateTo){
        daysCount = calculateDaysCount(agreementDateFrom, agreementDateTo);
    }

    public long getDaysCount(){
        return daysCount;
    }

    public void setDaysCount(long daysCount){
        this.daysCount = daysCount;
    }

    public long calculateDaysCount(Date agreementDateFrom, Date agreementDateTo){
        daysCount = TimeUnit.DAYS.convert(agreementDateTo.getTime()
                - agreementDateFrom.getTime(), TimeUnit.MILLISECONDS);

        return daysCount; // Сделал возвращаемое значение, чтобы можно было увидеть результат калькуляции
    }
}
