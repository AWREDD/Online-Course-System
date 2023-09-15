package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Chapter;

import java.util.List;

@Mapper
public interface ChapterMapper {

    List<Chapter> selectChaptersByCourseId(Integer course_id);

    Chapter selectChapterByChapterId(Integer chapter_id);

    Chapter selectChapterByCourseIdAndChapterName(Integer course_id, String chapter_name);

    Chapter selectChapterByCourseIdAndChapterIndex(Integer course_id, Integer chapter_index);

    void insertChapter(Chapter chapter);

    void updateChapter(Chapter chapter);

    void deleteChapterByCourseIdAndChapterIndex(Integer course_id, Integer chapter_index);
}
