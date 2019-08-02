package com.school.project.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AttendanceDto {

    @ApiModelProperty(hidden = true)
    private Long id;

    @NotNull
    private LessonDto lesson;

    @NotNull
    private UserDto user;

    @NotNull
    @JsonProperty("isPresent")
    private boolean isPresent;
}
