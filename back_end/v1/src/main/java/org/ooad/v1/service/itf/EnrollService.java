package org.ooad.v1.service.itf;

import org.ooad.v1.entity.Course;
import org.ooad.v1.entity.Enroll;

import java.util.List;

public interface EnrollService {
    List<Integer> selectUserIdsByCourseId(Integer course_id);

    void sendEmails(List<String> emails, String content);

    List<Course> selectCoursesByUserId(Integer user_id);

    void insertEnroll(Enroll enroll);
}
