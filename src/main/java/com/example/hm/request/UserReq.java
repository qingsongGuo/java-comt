package com.example.hm.request;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class UserReq {
    private String account;
   private String password;
}
