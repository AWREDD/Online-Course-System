package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Lesson;

import java.util.List;

@Mapper
public interface LessonMapper {

    List<Lesson> selectLessonsByChapterId(Integer chapter_id);

    Lesson selectLessonByLessonId(String lesson_id);

    void insertLesson(Lesson lesson);

    void insertLessonId(String lesson_id);

    void updateLesson(Lesson lesson);

    void updateLessonAll(String lesson_id, Integer lesson_index, String lesson_title, String lesson_description, Integer lesson_score, Integer chapter_id);

    void updateLessonOg(String lesson_id, String lesson_title, String lesson_description, Integer lesson_score);

    void addLessonViewcountByLessonId(Integer lesson_id);

    void deleteLesson(Integer chapter_id, Integer lesson_id);


}
