package com.financial.financialsystem.entity;


import java.util.Date;

/**
 * `cid` int(11) NOT NULL AUTO_INCREMENT COMMENT '身份证表编号',
 *   `uid` int(11) DEFAULT NULL COMMENT '用户表编号',
 *   `cName` varchar(255) DEFAULT NULL COMMENT '真实姓名',
 *   `cardID` int(11) DEFAULT NULL COMMENT '身份证号',
 *   `catedate` datetime DEFAULT NULL,
 */

public class IdCard {
    private Integer cid,uid;
    private Date caredate;
    private String cName,cardID;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Date getCaredate() {
        return caredate;
    }

    public void setCaredate(Date caredate) {
        this.caredate = caredate;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }
}
