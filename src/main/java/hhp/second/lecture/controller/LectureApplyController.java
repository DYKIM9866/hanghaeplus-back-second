package hhp.second.lecture.controller;

import hhp.second.lecture.dtos.ResultDto;
import hhp.second.lecture.dtos.StudentDto;
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
    public ResultDto succOrNot(@PathVariable("id") long id,@RequestParam String lectureCode){
        return service.succOrNot(new StudentDto(id, lectureCode));
    }
    @PostMapping
    public ResultDto apply(@RequestBody StudentDto body){
        return service.apply(body);
    }
}
