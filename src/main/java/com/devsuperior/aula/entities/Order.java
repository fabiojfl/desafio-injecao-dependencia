package com.devsuperior.aula.entities;

public class Order {

    private int code;
    private double basic;
    private double valDiscount;

    public Order() {}

    public Order(int code, double basic, double valDiscount) {
        this.code = code;
        this.basic = basic;
        this.valDiscount = valDiscount;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBasic() {
        return basic;
    }

    public void setBasic(double basic) {
        this.basic = basic;
    }

    public double getValDiscount() {
        return valDiscount;
    }

    public void setValDiscount(double valDiscount) {
        this.valDiscount = valDiscount;
    }
}
