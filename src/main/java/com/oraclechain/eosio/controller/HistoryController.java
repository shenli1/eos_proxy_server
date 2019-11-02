package com.oraclechain.eosio.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.oraclechain.eosio.constants.Variables;
import com.oraclechain.eosio.dto.*;
import com.oraclechain.eosio.utils.EosErrorUtils;
import com.oraclechain.eosio.utils.HttpClientUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Slf4j
@RestController
public class HistoryController {

    //Get information related to an account.
    @CrossOrigin
    @PostMapping("get_key_accounts")
    public MessageResult get_key_accounts(@RequestBody String body) throws Exception {

        String result= HttpClientUtils.ocPost(Variables.eosHistoryUrl+ "get_key_accounts", body );
        return EosErrorUtils.handleEosResponse(result, "get_key_accounts");
    }


    //Get information related to an account.
    @CrossOrigin
    @PostMapping("get_actions")
    public TransferHistoryBean get_actions(@RequestBody String body) throws Exception {

        log.info("[get_actions] " + body);
        ActionParams params = JSONObject.parseObject(body,ActionParams.class);
        Map<String,String> getActionMap = new HashMap<String,String>();
        int page = Integer.parseInt(params.getPage());
        int pageSize = Integer.parseInt(params.getPageSize());
        /*
        int pos = -1 - page * pageSize;
        int offset = 0 - pageSize;
        getActionMap.put("pos",String.valueOf(pos));
        getActionMap.put("offset",String.valueOf(offset));
        */

        getActionMap.put("account_name",params.getFrom());
        String result= HttpClientUtils.ocPost(Variables.eosHistoryUrl+ "get_actions", JSON.toJSONString(getActionMap) );
        GetActionResult actionResult = JSONObject.parseObject(result,GetActionResult.class);

        HashSet<String> trxSet = new HashSet<String>();
        List<ActionsBean> actionsBeanList = new ArrayList<ActionsBean>();
        for( Action action : actionResult.getActions() ){
            String trxId = action.getAction_trace().getTrx_id();
            if( trxSet.contains(trxId) ){
                continue;
            }
            ActionsBean actionsBean = new ActionsBean();
            actionsBean.setBlockNum(action.getAction_trace().getBlock_num());
            actionsBean.setDoc(action.getAction_trace().getAct());
            actionsBean.setTrxid(trxId);
            actionsBeanList.add(actionsBean);
            trxSet.add(trxId);
        }
        TransferHistoryBean historyBean = new TransferHistoryBean();
        historyBean.setCode("0");
        historyBean.setMsg("success");
        DataBeanX dataBeanX = new DataBeanX();
        dataBeanX.setHasMore(false);
        dataBeanX.setPage(1);
        dataBeanX.setPageSize(actionsBeanList.size());
        dataBeanX.setActions(actionsBeanList);
        historyBean.setData(dataBeanX);

        //return JSON.toJSONString(historyBean);
        return historyBean;
    }

    //Get information related to an account.
    @CrossOrigin
    @PostMapping("get_transaction")
    public MessageResult get_transaction(@RequestBody String body) throws Exception {

        String result= HttpClientUtils.ocPost(Variables.eosHistoryUrl+ "get_transaction", body );
        return EosErrorUtils.handleEosResponse(result, "get_transaction");
    }



}