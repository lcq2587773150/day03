package cn.tbs.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
    private Integer id;
    private Double money;
    private Integer uid;
    private Date ordertime;
    private User user;

    public Order() {
    }

    public Order(Integer id, Double money, Integer uid, Date ordertime) {
        this.id = id;
        this.money = money;
        this.uid = uid;
        this.ordertime = ordertime;
    }
}
