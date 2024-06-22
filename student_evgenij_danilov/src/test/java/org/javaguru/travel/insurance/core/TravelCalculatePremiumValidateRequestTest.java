package org.javaguru.travel.insurance.core;

import org.javaguru.travel.insurance.dto.TravelCalculatePremiumRequest;
import org.javaguru.travel.insurance.dto.ValidationError;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;
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
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 27));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertTrue(errors.isEmpty());
    }

    @Test
    public void firstNameIsNull(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn(null);
        when(request.getPersonLastName()).thenReturn("Petrov");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 27));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertEquals(errors.getFirst().getField(), "personFirstName");
        Assertions.assertEquals(errors.getFirst().getMessage(), "Must not be empty!");
    }

    @Test
    public void firstNameIsEmpty(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("");
        when(request.getPersonLastName()).thenReturn("Petrov");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 27));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertEquals(errors.getFirst().getField(), "personFirstName");
        Assertions.assertEquals(errors.getFirst().getMessage(), "Must not be empty!");
    }

    @Test
    public void lastNameIsPresent(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn("Petrov");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 27));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertTrue(errors.isEmpty());
    }

    @Test
    public void lastNameIsNull(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn(null);
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 27));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertEquals(errors.getFirst().getField(), "personLastName");
        Assertions.assertEquals(errors.getFirst().getMessage(), "Must not be empty!");
    }

    @Test
    public void lastNameIsEmpty(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn("");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 27));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertEquals(errors.getFirst().getField(), "personLastName");
        Assertions.assertEquals(errors.getFirst().getMessage(), "Must not be empty!");
    }

    @Test
    public void agreementDateFromIsPresent(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn("Petrov");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 27));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertTrue(errors.isEmpty());
    }

    @Test
    public void agreementDateFromIsNull(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn("Petrov");
        when(request.getAgreementDateFrom()).thenReturn(null);
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertEquals(errors.getFirst().getField(), "agreementDateFrom");
        Assertions.assertEquals(errors.getFirst().getMessage(), "Must not be empty!");
    }

    @Test
    public void agreementDateToIsNull(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn("Petrov");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 28));
        when(request.getAgreementDateTo()).thenReturn(null);

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertEquals(errors.getFirst().getField(), "agreementDateTo");
        Assertions.assertEquals(errors.getFirst().getMessage(), "Must not be empty!");
    }

    @Test
    public void agreementDateToIsPresent(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn("Petrov");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 27));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertTrue(errors.isEmpty());
    }

    @Test
    public void agreementDateToValidateValueFalse(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn("Petrov");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 28));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 27));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertEquals(errors.getFirst().getField(), "agreementDateTo");
        Assertions.assertEquals(errors.getFirst().getMessage(), "Must be greater than agreementDateFrom!");
    }

    @Test
    public void agreementDateToValidateValueTrue(){
        request = mock(TravelCalculatePremiumRequest.class);
        when(request.getPersonFirstName()).thenReturn("Ivan");
        when(request.getPersonLastName()).thenReturn("Petrov");
        when(request.getAgreementDateFrom()).thenReturn(new Date(2023, 10, 27));
        when(request.getAgreementDateTo()).thenReturn(new Date(2023, 10, 28));

        validator = new TravelCalculatePremiumRequestValidator();
        List<ValidationError> errors = validator.validate(request);

        Assertions.assertTrue(errors.isEmpty());
    }
}
