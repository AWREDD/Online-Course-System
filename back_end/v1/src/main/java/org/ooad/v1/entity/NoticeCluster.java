package org.ooad.v1.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoticeCluster {

    Integer notice_id;

    Integer course_id;

    String course_name;

    Integer user_id;

    String notice_content;

    Timestamp notice_time;

    Boolean notice_email;
}
