package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Grade;

import java.util.List;


@Mapper
public interface GradeMapper {

    Grade selectGradeByUserIdAndCourseId(Integer user_id, Integer course_id);

    List<Grade> selectGradesByCourseId(Integer course_id);
}
