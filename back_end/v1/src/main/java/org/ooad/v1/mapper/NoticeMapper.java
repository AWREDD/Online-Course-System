package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Notice;

import java.util.List;

@Mapper
public interface NoticeMapper {

    List<Notice> selectNoticesByUserId(Integer user_id);

    List<Notice> selectNoticesByCourseId(Integer course_id);

    void insertNotice(Notice notice);

    void updateNotice(Notice notice);
}
