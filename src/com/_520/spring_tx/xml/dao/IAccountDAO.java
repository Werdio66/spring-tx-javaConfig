package com._520.spring_tx.xml.dao;

public interface IAccountDAO {

    /**
     *  转出
     * @param outId
     * @param money
     */
    void transOut(Long outId, int money);

    /**
     *  转入
     * @param inId
     * @param money
     */
    void transIn(Long inId, int money);

}
