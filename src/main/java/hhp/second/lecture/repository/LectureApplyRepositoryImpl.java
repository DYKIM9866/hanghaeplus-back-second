package hhp.second.lecture.repository;

import hhp.second.lecture.dtos.StudentDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class LectureApplyRepositoryImpl implements LectureApplyRepository {

    private final SqlSession sqlSession;
    public LectureApplyRepositoryImpl(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

    @Override
    public int apply(StudentDto studentDto) {
        return sqlSession.insert("apply", studentDto);
    }

    @Override
    public boolean inList(StudentDto studentDto) {
        Integer result = sqlSession.selectOne("inList", studentDto);
        return result != null && result > 0 ;
    }

    @Override
    public boolean isTime(StudentDto studentDto) {
        Integer result = sqlSession.selectOne("isTime", studentDto);
        return result != null && result > 0;
    }
}
