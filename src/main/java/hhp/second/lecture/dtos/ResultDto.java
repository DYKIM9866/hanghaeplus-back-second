package hhp.second.lecture.dtos;

import hhp.second.lecture.ResultMsg;
import lombok.Data;

@Data
public class ResultDto {
    private boolean result;
    private ResultMsg msg;

    public ResultDto() {
    }
    public ResultDto(boolean result, ResultMsg msg) {
        this.result = result;
        this.msg = msg;
    }
}
