package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Homework;

import java.util.List;

@Mapper
public interface HomeworkMapper {

    List<Homework> selectHomeworkByCourseId(Integer course_id);

    Homework selectHomeworkByCourseIdAndHomeworkIndex(Integer course_id, Integer homework_index);

    void insertHomework(Homework homework);

    void updateHomework(Homework homework);
}
