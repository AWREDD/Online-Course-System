package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Course;
import org.ooad.v1.entity.Enroll;
import org.ooad.v1.entity.User;

import java.util.List;

@Mapper
public interface EnrollMapper {

    List<Integer> selectUsersByCourseId(Integer course_id);

    List<Integer> selectCoursesByUserId(Integer user_id);

    void insertEnroll(Enroll enroll);
}
