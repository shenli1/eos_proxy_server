package com.oraclechain.eosio.dto;

import lombok.Data;

@Data
public class TransferData {
    private String quantity;
    private String memo;
    private String from;
    private String to;
}
