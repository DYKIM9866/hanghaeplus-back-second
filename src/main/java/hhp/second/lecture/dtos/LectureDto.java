package hhp.second.lecture.dtos;

import lombok.Data;

@Data
public class LectureDto {
    private String lectureCode;
    private String lectureName;
    private long startApplication;
    private long finishApplication;
}
