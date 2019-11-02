package com.oraclechain.eosio.dto;


import lombok.Data;

import java.util.List;

@Data
public class GetActionResult {

    private long last_irreversible_block;
    private List<Action> actions;
}
