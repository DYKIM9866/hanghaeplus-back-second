package hhp.second.lecture.service;

import hhp.second.lecture.dtos.ResultDto;
import hhp.second.lecture.dtos.StudentDto;

public interface LectureApplyService {
    ResultDto apply(StudentDto studentDto);
    ResultDto succOrNot(StudentDto studentDto);
}
