package com.school.project.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LessonDto {

    private Long id;

    private String thema;

    private List<SubjectDto> subjects;

    private Date date;

    private GroupDto group;

    private UserDto teacher;
}
