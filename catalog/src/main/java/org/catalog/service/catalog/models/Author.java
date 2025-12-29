package org.catalog.service.catalog.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Author extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String country;

    @Column
    private Status status;

    @Column(name = "birth_date")
    private LocalDateTime birthDate;

}
