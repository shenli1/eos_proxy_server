package com.oraclechain.eosio.constants;

public final class Variables {

    //EOS TOKEN
    public static final String EOS_TOKEN_CONTRACT_NAME = "eosio.token";
    public static final String EOS_TOKEN_CONTRACT_SYMBOL = "EOS";
    public static final String SYSTEM_CONTRACT_NAME_EOS = "eosio";
    //OCT TOKEN
    public static final String OCT_TOKEN_CONTRACT_NAME = "octtothemoon";
    public static final String OCT_TOKEN_CONTRACT_SYMBOL = "OCT";

    //区块链常量
    public static final Integer TX_EXPIRATION_IN_MILSEC = 30000;

    //THIRD PARTY
    public static final String COINMARKETCAP_ID_EOS = "eos";
    public static final String COINMARKETCAP_TICKER = "https://api.coinmarketcap.com/v1/ticker/";
    public static final String COINMARKETCAP_SPARKLINES_EOS = "https://s2.coinmarketcap.com/generated/sparklines/web/7d/usd/1765.png";
    public static final String COINMARKETCAP_SPARKLINES_OCT = "https://s2.coinmarketcap.com/generated/sparklines/web/7d/usd/1838.png";
    public static final String COINMARKETCAP_SPARKLINES_IQ = "https://s2.coinmarketcap.com/generated/sparklines/web/7d/usd/2930.png";
    public static final String NEWDEX_TICKER = "https://api.newdex.io/v1/ticker";


    //JAVA
    public static final Integer conTimeOut = 3000;
    public static final Integer reqTimeOut = 5000;
    public static final Integer moneyPrecision = 4;


    //REDIS
    public static final Integer redisCacheTimeout = 60 * 30;  //min
    public static final String redisKeyPrefixBlockchain = "Blockchain:";
    public static final String redisKeyPrefixPersonalHead = "Personal:";
    public static final String redisKeyEosCoinmarketcapMid = "ExchangeRate";
    public static final String redisKeyEosNewdexMid = "NewdexTicker";
    public static final String redisKeyPrefixPersonalTailFreeAccount = "free";
    public static final String redisKeyPrefixPersonalTailVipAccount = "vip";

    //chain
    public static final String eosChainUrl = "http://120.77.86.18:8000/v1/chain/";
    public static final String eosHistoryUrl = "http://120.77.86.18:8000/v1/history/";
    public static final String eosAccount = "cctcreator11";
    public static final String eosPrivateKey = "5KfxVMTc5breR9B37v4ehxLTpYP5Y9x8gzHWMoVbWNJZDbYcyMV";
    public static final String eosAccountVip = "cctcreator11";
    public static final String eosPrivateKeyVip = "5KfxVMTc5breR9B37v4ehxLTpYP5Y9x8gzHWMoVbWNJZDbYcyMV";

    public static final Integer SYSTEM_CONTRACT_BUYRAM_BYSIZE = 4000;
    public static final String SYSTEM_CONTRACT_DELEGATEBW_NET_BYEOS = "0.0050 CCT";
    public static final String SYSTEM_CONTRACT_DELEGATEBW_CPU_BYEOS = "0.0400 CCT";
    public static final Boolean SYSTEM_CONTRACT_DELEGATEBW_ISTRANSFER = false;

}
