package com.oraclechain.eosio.dto;

import lombok.Data;

import java.util.List;

@Data
public class Receipt {

    private String receiver;
    private int code_sequence;
    private int abi_sequence;
    private int recv_sequence;
    private List<Object> auth_sequence;
    private String act_digest;
    private long global_sequence;
}
