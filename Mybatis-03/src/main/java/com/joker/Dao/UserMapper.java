package com.joker.Dao;

import com.joker.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUser();
    List<User> getUserByLimit(Map map);
}
