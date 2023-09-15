package org.ooad.v1.service.itf;

import org.ooad.v1.entity.Pic;
import org.ooad.v1.entity.Submit;

import java.util.List;

public interface CdnService {

    void insertPic(Pic pic);

    Pic selectPicById(Integer pic_id);

    Pic selectPicByUrl(String pic_url);

    List<Submit> selectSubmitsByCourseIdAndSubmitIndex(Integer course_id, Integer submit_index);

    Submit selectSubmitByStudentIdCourseIdAndSubmitIndex(Integer student_id, Integer course_id, Integer submit_index);

    List<Submit> selectSubmitsByUserId(Integer user_id);
}
