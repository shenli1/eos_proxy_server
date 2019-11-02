package com.oraclechain.eosio.dto;

import lombok.Data;

import java.util.List;

@Data
public class DataBeanX {

    private int page;
    private int pageSize;
    private boolean hasMore;
    private List<ActionsBean> actions;
}
