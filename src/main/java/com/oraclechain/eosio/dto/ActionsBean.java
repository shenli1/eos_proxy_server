package com.oraclechain.eosio.dto;
import lombok.Data;

@Data
public class ActionsBean {

    private Act doc;
    private int blockNum;
    private String trxid;
}
