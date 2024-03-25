package hhp.second.lecture.service;

import hhp.second.lecture.ResultMsg;
import hhp.second.lecture.dtos.ResultDto;
import hhp.second.lecture.repository.LectureApplyRepository;
import org.springframework.stereotype.Service;

@Service
public class LectureApplyServiceImpl implements LectureApplyService{

    private LectureApplyRepository repository;
    public LectureApplyServiceImpl(LectureApplyRepository repository) {
        this.repository = repository;
    }
    @Override
    public ResultDto apply(long id) {
        if(!inList(id)){
            return new ResultDto(false,ResultMsg.FAILED);
        }
        int result = repository.apply(id);
        return new ResultDto(true, ResultMsg.SUCCESS);
    }
    @Override
    public ResultDto succOrNot(long id) {
        boolean result = inList(id);
        ResultDto resultDto;
        if(result){
            resultDto = new ResultDto(true,ResultMsg.SUCCESS);
        }else{
            resultDto = new ResultDto(true,ResultMsg.FAILED);
        }
        return resultDto;
    }
    private boolean inList(long id){
        return repository.inList();
    }

}
