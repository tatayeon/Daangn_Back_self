package com.example.daangn.user.requestDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@NoArgsConstructor
public class LoginDTO {

    private String email;

    private String password;

    public LoginDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

}
