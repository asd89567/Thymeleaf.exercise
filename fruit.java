package com.thymeleaf;

public class fruit {
    private  Integer id;
    private String Dname;
    private Integer price;
    private Integer count;
    private String remark;

    public fruit() {
    }

    public fruit(Integer id, String dname, Integer price, Integer count, String remark) {
        this.id = id;
        Dname = dname;
        this.price = price;
        this.count = count;
        this.remark = remark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDname() {
        return Dname;
    }

    public void setDname(String dname) {
        Dname = dname;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "fruit{" +
                "id=" + id +
                ", Dname='" + Dname + '\'' +
                ", price=" + price +
                ", count=" + count +
                ", remark='" + remark + '\'' +
                '}';
    }
}