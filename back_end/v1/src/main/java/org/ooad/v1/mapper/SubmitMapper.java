package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Submit;

import java.util.List;

@Mapper
public interface SubmitMapper {

    List<Submit> selectSubmitsByCourseIdAndSubmitIndex(Integer course_id, Integer submit_index);

    void insertSubmit(Submit submit);

    void updateSubmitChecked(Integer student_id, Integer course_id, Integer submit_index);

    Submit selectSubmitByStudentIdCourseIdAndSubmitIndex(Integer student_id, Integer course_id, Integer submit_index);

    List<Submit> selectSubmitsByUserId(Integer user_id);

    List<Submit> selectSubmitsByUserIdChecked(Integer user_id);

    List<Submit> selectSubmitsByUserIdUnchecked(Integer user_id);

}
