package com.Jwt.Auth.Service;

import com.Jwt.Auth.Model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    List<UserModel> userModelList = new ArrayList<>();

    public UserService() {
        userModelList.add(new UserModel(UUID.randomUUID().toString(), "nagma.khan@gmail.com", "nagma@12#"));
        userModelList.add(new UserModel(UUID.randomUUID().toString(), "nazmeen.khan@gmail.com", "naaz@12#"));
        userModelList.add(new UserModel(UUID.randomUUID().toString(), "sahil.khan@gmail.com", "sahil@12#"));
        userModelList.add(new UserModel(UUID.randomUUID().toString(), "nasim.khan@gmail.com", "nasim@12#"));

    }

    public List<UserModel> getUserModelList() {
        return userModelList;
    }
}
