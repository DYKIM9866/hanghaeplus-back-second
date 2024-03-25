package hhp.second.lecture.repository;

import org.springframework.stereotype.Repository;

@Repository
public class LectureApplyRepositoryImpl implements LectureApplyRepository{
    @Override
    public int apply(long id) {
        return 0;
    }

    @Override
    public boolean inList() {
        return false;
    }
}
