package com.financial.financialsystem.entity;

/**
 * gid` '自增商品编号',
 * gName varchar(255) DEFAULT NULL COMMENT '商品名称',
 * gPrice` double DEFAULT NULL COMMENT '商品价格',
 * gTitle` varchar(255) DEFAULT NULL COMMENT '商品详情',
 * gRisk` varchar(255) DEFAULT NULL COMMENT '商品风险',
 * termDate` int(11) DEFAULT NULL COMMENT '1为3个月，2为6个月，3为12个月，4为12个月以上',
 * pid` int(11) DEFAULT NULL COMMENT '公司编号，属于外键',
 * state` varchar(255) DEFAULT NULL COMMENT '商品状态1为正常，0为下架，2为缺货',
 */

public class Goods {
    private Integer gid, pid, state, termDate;

    private String gName, gTitle, gRisk;
    private double gPrice;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getTermDate() {
        return termDate;
    }

    public void setTermDate(Integer termDate) {
        this.termDate = termDate;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgTitle() {
        return gTitle;
    }

    public void setgTitle(String gTitle) {
        this.gTitle = gTitle;
    }

    public String getgRisk() {
        return gRisk;
    }

    public void setgRisk(String gRisk) {
        this.gRisk = gRisk;
    }

    public double getgPrice() {
        return gPrice;
    }

    public void setgPrice(double gPrice) {
        this.gPrice = gPrice;
    }
}
