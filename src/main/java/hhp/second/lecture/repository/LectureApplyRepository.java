package hhp.second.lecture.repository;

import hhp.second.lecture.dtos.StudentDto;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

@Repository
public interface LectureApplyRepository {
    int apply(StudentDto studentDto);
    boolean inList(StudentDto studentDto);
    boolean isTime(StudentDto studentDto);
}
