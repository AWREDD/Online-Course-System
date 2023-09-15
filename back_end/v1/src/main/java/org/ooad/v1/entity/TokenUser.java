package org.ooad.v1.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TokenUser {

    Integer map_id;

    Integer user_id;

    Integer token_id;
}
