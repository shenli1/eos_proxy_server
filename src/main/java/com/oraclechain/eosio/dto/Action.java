package com.oraclechain.eosio.dto;

import lombok.Data;

import java.util.List;

@Data
public class Action {

    private String block_time;
    private int block_num;
    private ActionTrace action_trace;
    private long account_action_seq;
    private long global_action_seq;

}
