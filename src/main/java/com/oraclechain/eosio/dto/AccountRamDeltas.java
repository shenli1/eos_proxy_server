package com.oraclechain.eosio.dto;


import lombok.Data;

@Data
public class AccountRamDeltas {

    private long delta;
    private String account;
}
