package hhp.second.lecture;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Controller Test 먼저 작성
 * 특강신청이 실패
 * 특강신청이 성공
 * 특강신청 완료 여부 조회
 */
@ExtendWith(MockitoExtension.class)// JUnit5 와 Mockito를 연동하기 위해 사용
@WebMvcTest(controllers = {LectureApplyController.class})
public class LectureApplyControllerTest {

    @InjectMocks
    private LectureApplyController controller;  //가짜객체(service) 주입을 위해 @InjectMocks사용
    @Mock
    private LectureApplyService service;    //가짜 객체 생성을 위해 @Mock생성
    @Autowired
    private MockMvc mockMvc;

    @DisplayName("특강 신청 성공")
    @Test
    void 특강_신청_성공() throws Exception {
        mockMvc.perform(post("/apply"))
                .andExpect(status().isOk());
    }


}
