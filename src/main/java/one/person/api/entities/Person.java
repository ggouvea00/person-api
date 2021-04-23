package one.person.api.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "person")
public class Person {

    @Id
    @SequenceGenerator(name = "SQ_IDT_PERSON", sequenceName = "SQ_PERSON_IDT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDT_PERSON")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "DAT_BORN")
    private LocalDate birthDate;

    @Column(name = "NATURALNESS")
    private String naturalness;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(unique = true)
    private String cpf;

    @Column(name = "CREATION_DATE")
    private LocalDate creationDate;



}
