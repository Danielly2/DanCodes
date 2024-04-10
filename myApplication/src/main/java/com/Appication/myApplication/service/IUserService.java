package com.Appication.myApplication.service;

import com.Appication.myApplication.entity.User;
import com.Appication.myApplication.request.UserRequest;


import java.util.List;

public interface IUserService {

    public User addUser(UserRequest request) throws Exception;

    void removeUser(Long id);

    List<User> getUsers();
}
