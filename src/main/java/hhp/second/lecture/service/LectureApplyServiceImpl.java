package hhp.second.lecture.service;

import hhp.second.lecture.ResultMsg;
import hhp.second.lecture.dtos.ResultDto;
import hhp.second.lecture.dtos.StudentDto;
import hhp.second.lecture.repository.LectureApplyRepository;
import org.springframework.stereotype.Service;

@Service
public class LectureApplyServiceImpl implements LectureApplyService{

    private LectureApplyRepository repository;
    public LectureApplyServiceImpl(LectureApplyRepository repository) {
        this.repository = repository;
    }
    @Override
    public ResultDto apply(StudentDto studentDto) {
        if(inList(studentDto)){
            return new ResultDto(true,ResultMsg.ALREADY_APPLIED);
        }
        if(!isTime(studentDto)){

        }
        repository.apply(studentDto);

        return new ResultDto(true, ResultMsg.SUCCESS);
    }
    @Override
    public ResultDto succOrNot(StudentDto studentDto) {
        boolean result = inList(studentDto);
        ResultDto resultDto;
        if(result){
            resultDto = new ResultDto(true, ResultMsg.DONE_WELL);
        }else{
            resultDto = new ResultDto(false,ResultMsg.FAILED);
        }
        return resultDto;
    }
    private boolean inList(StudentDto studentDto){
        return repository.inList(studentDto);
    }
    private boolean isTime(StudentDto studentDto){
        return repository.isTime(studentDto);
    }

}
