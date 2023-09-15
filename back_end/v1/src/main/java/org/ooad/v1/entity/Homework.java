package org.ooad.v1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Homework {

    Integer homework_id;

    String homework_content;

    Integer course_id;

    Integer homework_index;

    Timestamp homework_time;

}
