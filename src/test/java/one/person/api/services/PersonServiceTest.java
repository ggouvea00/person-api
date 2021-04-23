package one.person.api.services;

import one.person.api.dto.mapper.PersonMapper;
import one.person.api.dto.request.PersonDTO;
import one.person.api.entities.Person;
import one.person.api.repositories.PersonRepository;
import one.person.api.services.PersonService;
import one.person.api.utils.PersonMocks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @Mock
    private PersonMapper personMapper;

    @InjectMocks
    private PersonService personService;

    @Test
    void testGivenPersonDTOThenReturnSuccessSavedMessage() {
        PersonDTO personDTO = PersonMocks.createFakeDTO();
        Person expectedSavedPerson = PersonMocks.createFakeEntity();

        when(personMapper.toModel(personDTO)).thenReturn(expectedSavedPerson);
        when(personRepository.save(any(Person.class))).thenReturn(expectedSavedPerson);

        Person personSuccess = personService.create(personDTO);

        Assertions.assertNotNull(personSuccess.getId());
    }
}
