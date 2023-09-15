package org.ooad.v1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Chapter {

    Integer chapter_id;

    Integer chapter_index;

    String chapter_title;

    Integer course_id;
}
