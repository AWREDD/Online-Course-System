package org.ooad.v1.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.ooad.v1.entity.TokenUser;

@Mapper
public interface TokenUserMapper {

    TokenUser selectMapByUserId(Integer user_id);


    void insertTokenUser(TokenUser tokenUser);

    void updateTokenUser(TokenUser tokenUser);
}
