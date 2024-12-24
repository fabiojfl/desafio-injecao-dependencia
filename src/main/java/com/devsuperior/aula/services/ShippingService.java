package com.devsuperior.aula.services;

import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shipment(double basic){
        if (basic <= 100.00){
            return basic + 20.00;
        } else if(basic > 100.00 && basic <= 200.00){
            return basic + 12.00;
        }else {
            return basic;
        }

    }
}
