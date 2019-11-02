package com.oraclechain.eosio.dto;

import lombok.Data;

import java.util.List;

@Data
public class ActionParams {

    private String from;
    private String page;
    private String pageSize;
    private String to;

    private List<Symbol> symbols;

}
