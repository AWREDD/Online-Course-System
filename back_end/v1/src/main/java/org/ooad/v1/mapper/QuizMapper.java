package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Quiz;

import java.util.List;

@Mapper
public interface QuizMapper {

    List<Quiz> selectQuizByCourseId(Integer course_id);

    Quiz selectQuizByCourseIdAndQuizIndex(Integer course_id, Integer quiz_index);

    void insertQuiz(Quiz quiz);

    void updateQuiz(Quiz quiz);

}
