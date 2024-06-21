package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.dto.ValidationError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TravelCalculatePremiumValidateRequestTest {
    private TravelCalculatePremiumRequestValidator validator;

    private TravelCalculatePremiumRequest request;

    @Test
    public void firstNameIsPresent(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn("Petrov");

        validator = new TravelCalculatePremiumRequestValidator();

        Assertions.assertEquals(validator.validate(request), new ArrayList<>());
    }

    @Test
    public void firstNameIsNull(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("Petrov");

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertEquals(errors.getFirst().getField(), "personFirstName");
        Assertions.assertEquals(errors.getFirst().getMessage(), "Must not be empty!");
    }

    @Test
    public void firstNameIsEmpty(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("");

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertEquals(errors.getFirst().getField(), "personFirstName");
        Assertions.assertEquals(errors.getFirst().getMessage(), "Must not be empty!");
    }
}
