package one.person.api.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    @NotEmpty
    @Size(min = 2, max = 100)
    private String name;

    private String gender;

    private String email;

    @NotEmpty
    private String cpf;

    @NotNull
    private String birthDate;

    private String naturalness;

    private String nationality;

}
