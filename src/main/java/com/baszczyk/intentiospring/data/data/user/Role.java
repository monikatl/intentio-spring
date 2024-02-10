package com.baszczyk.intentiospring.data.data.user;

public enum Role {
    PARISH_PRIEST("PROBOSZCZ"), VICAR("WIKARY"), PARISHIONER("PARAFIANIN") ;


    public String role;
    Role(String role) {
      this.role = role;
    }
}
