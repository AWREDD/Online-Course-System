package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.QuizGrade;

import java.util.List;

@Mapper
public interface QuizGradeMapper {

    void insertQuizGrade(QuizGrade quizGrade);

    List<QuizGrade> selectQuizGradeByUserId(Integer user_id);

    List<QuizGrade> selectQuizGradeByCourseId(Integer course_id);

    Integer selectScoreByCourseIdAndQuizIndex(Integer course_id, Integer quiz_index);

}
