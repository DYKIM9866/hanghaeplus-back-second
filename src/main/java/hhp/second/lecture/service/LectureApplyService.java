package hhp.second.lecture.service;

import hhp.second.lecture.dtos.ResultDto;

public interface LectureApplyService {
    ResultDto apply(long id);
    ResultDto succOrNot(long id);
}
