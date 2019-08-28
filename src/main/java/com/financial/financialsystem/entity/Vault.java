package com.financial.financialsystem.entity;

import java.util.Date;

/**
 * `vid` int(11) NOT NULL AUTO_INCREMENT COMMENT '金库编号',
 *   `balance` double(255,0) DEFAULT NULL 可提现金额,
 *   `capital` double(255,0) DEFAULT NULL 不可提现金额,
 *   `createdDate` datetime DEFAULT NULL,
 *   `states` DEFAULT NULL COMMENT '状态1是正常，0是没钱',
 */

public class Vault {
    private Integer vid,states;
    private Date createdDate;
    private double balance,capital;

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getStates() {
        return states;
    }

    public void setStates(Integer states) {
        this.states = states;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }
}
