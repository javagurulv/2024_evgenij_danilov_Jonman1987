package org.javaguru.travel.insurance.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Date;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class DateTimeServiceTest {
    @Mock
    private DateTimeService dateTimeService;
    @BeforeEach
    public void setUp() {
        when(dateTimeService.calculateDaysCount(new Date(2023, 10, 27), new Date(2023, 10, 28))).thenReturn(1L);
    }
    @Test
    public void calculateAgreementPriceTest(){
        long days = dateTimeService.calculateDaysCount(new Date(2023, 10, 27), new Date(2023, 10, 28));

        Assertions.assertEquals(days, 1);
    }
}
