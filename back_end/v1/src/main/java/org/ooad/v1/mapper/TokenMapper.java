package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.Token;

import java.sql.Timestamp;

@Mapper
public interface TokenMapper {

    Token selectTokenByTokenId(Integer token_id);

    Token selectTokenByTokenContent(String token_content);

    void insertToken(String token_content, Long starttime);


}
