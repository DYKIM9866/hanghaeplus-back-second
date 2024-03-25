package hhp.second.lecture.dtos;

import lombok.Data;

@Data
public class StudentDto {
    private long id;
    private String studentName;
    private String lectureCode;
    private long applicationTime;
}
