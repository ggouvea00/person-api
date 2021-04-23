package one.person.api.utils;

import one.person.api.dto.request.PersonDTO;
import one.person.api.entities.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonMocks {

    private static final String NAME = "Gustavo";
    private static final String CPF_NUMBER = "470.805.111-38";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2010, 10, 1);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .cpf(CPF_NUMBER)
                .birthDate("10-10-2020")
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .name(NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .build();
    }
}
