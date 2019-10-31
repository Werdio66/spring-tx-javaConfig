package com._520.spring_tx.xml.service;

public interface IAccountService {

    /**
     *  转账
     * @param outId
     * @param inId
     * @param money
     */
    void trans(Long outId, Long inId, int money);
}
