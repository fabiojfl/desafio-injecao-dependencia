package com.devsuperior.aula.services;

import com.devsuperior.aula.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class OrderService {
    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discount =  order.getBasic() * order.getValDiscount()/100;
        return shippingService.shipment(order.getBasic()) - discount;
    }

    public int code(Order order){
        return order.getCode();
    }

}
