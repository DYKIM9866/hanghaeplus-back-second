package hhp.second.lecture.controller;

import hhp.second.lecture.dtos.ResultDto;
import hhp.second.lecture.service.LectureApplyService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/apply")
public class LectureApplyController {

    private LectureApplyService service;
    public LectureApplyController(LectureApplyService service) {
        this.service = service;
    }
    @GetMapping("{id}")
    public ResultDto succOrNot(@PathVariable("id") long id){
        return service.succOrNot(id);
    }
    @PostMapping("{id}")
    public ResultDto apply(@PathVariable("id") long id, @RequestBody Map<String,String> body){
        return service.apply(id);
    }
}
