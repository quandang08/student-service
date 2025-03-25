package com.amu.student.dto.respone;

import com.amu.student.entities.Student;
import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FullSchoolResponse {
    private String name;
    private String email;

    List<Student> students;
}
