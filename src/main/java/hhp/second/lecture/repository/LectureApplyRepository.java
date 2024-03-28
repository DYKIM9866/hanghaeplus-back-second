package hhp.second.lecture.repository;

import hhp.second.lecture.dtos.StudentDto;

public interface LectureApplyRepository {
    int apply(StudentDto studentDto);
    boolean inList(StudentDto studentDto);
    boolean isTime(StudentDto studentDto);
}
