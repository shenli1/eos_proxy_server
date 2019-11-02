package com.oraclechain.eosio.dto;

import lombok.Data;

import java.util.List;

@Data
public class ActionTrace {
    private String console;
    private String producer_block_id;
    private int creator_action_ordinal;
    private String receiver;
    private List<AccountRamDeltas> account_ram_deltas;
    private boolean context_free;
    private long elapsed;
    private String trx_id;
    private String block_time;
    private int block_num;
    private Act act;
    private long action_ordinal;
    private long closest_unnotified_ancestor_action_ordinal;
    private Receipt receipt;
    private String except;
    private String error_code;
}
