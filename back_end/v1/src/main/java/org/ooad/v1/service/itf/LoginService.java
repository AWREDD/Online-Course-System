package org.ooad.v1.service.itf;

import org.ooad.v1.entity.Token;
import org.ooad.v1.entity.TokenUser;
import org.ooad.v1.entity.User;

import java.util.List;

public interface LoginService {

    boolean registerUser(String user_name, String user_passwd, String user_email, String user_role);

    Token getTokenIdByMap(Integer user_id);

    void insertTokenUser(TokenUser tokenUser);

    void updateTokenUser(TokenUser tokenUser);

    void insertOrUpdate(TokenUser tokenUser);

}
