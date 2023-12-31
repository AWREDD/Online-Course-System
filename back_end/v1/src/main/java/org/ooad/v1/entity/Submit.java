package org.ooad.v1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Submit {

    Integer submit_id;

    String pic_url;

    Integer user_id;

    String user_name;

    Integer course_id;

    String submit_type;

    Integer submit_index;

    Timestamp submit_time;

    Integer submit_checked;


}
