package com.oraclechain.eosio.dto;

import lombok.Data;

@Data
public class Authorization {

    private String actor;
    private String permission;

}
