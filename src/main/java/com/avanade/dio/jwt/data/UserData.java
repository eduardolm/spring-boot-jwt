package com.avanade.dio.jwt.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class UserData implements Serializable {

    private String userName;
    private String password;
}
