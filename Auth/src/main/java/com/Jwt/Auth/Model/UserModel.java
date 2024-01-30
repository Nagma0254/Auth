package com.Jwt.Auth.Model;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class UserModel {
    private String userId;
    private String userName;
    private String password;

}
