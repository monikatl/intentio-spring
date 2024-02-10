package com.baszczyk.intentiospring.data.data.user;

import lombok.Data;

@Data
public class LoginDto {
  private String usernameOrEmail;
  private String password;
}
