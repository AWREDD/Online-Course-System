package org.ooad.v1.service.itf;


import org.ooad.v1.entity.HomeworkGrade;
import org.ooad.v1.entity.QuizGrade;
import org.ooad.v1.entity.Submit;
import org.ooad.v1.entity.VideoGrade;

import java.util.List;

public interface GradeService {

    Integer selectChapterGradeByChapterIndexCourseIdAndUserId(Integer chapter_index, Integer course_id, Integer user_id);

    Integer selectHomeworkGradeByCourseIdAndHomeworkIndex(Integer course_id, Integer homework_index);

    Integer selectQuizGradeByCourseIdAndQuizIndex(Integer course_id, Integer quiz_index);

    List<VideoGrade> selectVideoGradesByCourseIdAndUserId(Integer course_id, Integer user_id);

    List<QuizGrade> selectQuizGradesByUserId(Integer user_id);

    List<HomeworkGrade> selectHomeworkGradesByUserId(Integer user_id);

    void insertHomeworkGrade(HomeworkGrade homeworkGrade);

    void insertVideoGrade(VideoGrade videoGrade);

    void insertQuizGrade(QuizGrade quizGrade);

    void insertSubmit(Submit submit);

    void updateHomeworkChecked(Integer student_id, Integer course_id, Integer submit_index);
}
