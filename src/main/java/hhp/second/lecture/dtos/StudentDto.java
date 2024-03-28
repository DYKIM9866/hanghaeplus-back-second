package hhp.second.lecture.dtos;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class StudentDto {
    private long id;
    private String studentName;
    private String lectureCode;
    private long applicationTime;

    public StudentDto(long id, String lectureCode) {
        this.id = id;
        this.lectureCode = lectureCode;
    }
}
