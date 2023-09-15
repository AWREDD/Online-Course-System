package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Comment;

import java.util.List;

@Mapper
public interface CommentMapper {

    List<Comment> selectCommentsByCourseId(Integer course_id);

    void insertComment(Comment comment);


}
