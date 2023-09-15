package org.ooad.v1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;

@Deprecated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Grade {
    Integer grade_id;

    Integer user_id;

    Integer course_id;

    Timestamp grade_time;

    Integer grade_score;

}

