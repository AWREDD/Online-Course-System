package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.HomeworkGrade;
import org.ooad.v1.entity.VideoGrade;

import java.util.List;

@Mapper
public interface VideoGradeMapper {


    void insertVideoGrade(VideoGrade videoGrade);

    List<VideoGrade> selectVideoGradeByCourseIdAndUserId(Integer course_id, Integer user_id);

    Integer selectChapterGradeByChapterIndexCourseIdAndUserId(Integer chapter_index, Integer course_id, Integer user_id);


}
