package com.amu.student.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
    private Long schoolId;
}
