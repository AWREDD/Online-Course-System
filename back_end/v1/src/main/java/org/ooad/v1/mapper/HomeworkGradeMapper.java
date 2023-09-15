package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.HomeworkGrade;

import java.util.List;

@Mapper
public interface HomeworkGradeMapper {

    void insertHomeworkGrade(HomeworkGrade homeworkGrade);

    List<HomeworkGrade> selectHomeworkGradeByUserId(Integer user_id);

    List<HomeworkGrade> selectHomeworkGradeByCourseId(Integer course_id);

    Integer selectScoreByCourseIdAndHomeworkIndex(Integer course_id, Integer homework_index);


}
