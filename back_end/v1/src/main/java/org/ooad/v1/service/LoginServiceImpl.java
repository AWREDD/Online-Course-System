package org.ooad.v1.service;

import org.ooad.v1.entity.Token;
import org.ooad.v1.entity.TokenUser;
import org.ooad.v1.entity.User;
import org.ooad.v1.mapper.TokenMapper;
import org.ooad.v1.mapper.TokenUserMapper;
import org.ooad.v1.mapper.UserMapper;
import org.ooad.v1.service.itf.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    UserMapper userMapper;

    @Autowired
    TokenUserMapper tokenUserMapper;

    @Autowired
    TokenMapper tokenMapper;

    @Override
    public boolean registerUser(String user_name, String user_passwd, String user_email, String user_role) {
        User user = new User();
        user.setUser_name(user_name);
        user.setUser_passwd(user_passwd);
        user.setUser_email(user_email);
        user.setUser_role(user_role);
        try {
            userMapper.insertUser(user);
        } catch (DataIntegrityViolationException e) {
            return false;
        }
        return true;
    }

    @Override
    public Token getTokenIdByMap(Integer user_id) {
        TokenUser tokenUser = tokenUserMapper.selectMapByUserId(user_id);
        if (null == tokenUser) {
            return null;
        } else {
            Integer token_id = tokenUser.getToken_id();
            return tokenMapper.selectTokenByTokenId(token_id);
        }
    }

    @Override
    public void insertTokenUser(TokenUser tokenUser) {
        tokenUserMapper.insertTokenUser(tokenUser);
    }

    @Override
    public void updateTokenUser(TokenUser tokenUser) {
        tokenUserMapper.updateTokenUser(tokenUser);
    }

    @Override
    public void insertOrUpdate(TokenUser tokenUser) {

    }


}
