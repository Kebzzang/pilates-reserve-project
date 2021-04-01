package com.keb.club_pila.dto.course;

import com.keb.club_pila.model.entity.course.Teacher;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CourseDto {
    private Long id;
    private String title;
    private String content;
    private Teacher teacher;
}
