package com.oraclechain.eosio.dto;

import lombok.Data;

@Data
public class AccountDetailsBean {

    private String account_name;
    private String account_icon;
    private String eos_balance;
    private String eos_balance_usd;
    private String eos_balance_cny;
    private String eos_price_usd;
    private String eos_price_cny;
    private String eos_price_change_in_24h;
    private String eos_market_cap_usd;
    private String eos_market_cap_cny;
    private String oct_balance;
    private String oct_balance_usd;
    private String oct_balance_cny;
    private String oct_price_usd;
    private String oct_price_cny;
    private String oct_price_change_in_24h;
    private String oct_market_cap_usd;
    private String oct_market_cap_cny;
    private String eos_net_weight;
    private String eos_cpu_weight;
}
