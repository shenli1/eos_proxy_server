package com.oraclechain.eosio.dto;

import lombok.Data;

import java.util.List;

@Data
public class Act {

    private List<Authorization> authorization;
    private String hex_data;
    private TransferData data;
    private String name;
    private String account;

}
