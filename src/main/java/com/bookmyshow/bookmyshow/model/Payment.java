package com.bookmyshow.bookmyshow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment extends BaseModel {
    private String refNo;
    private PaymentStatus paymentStatus;
    private int amount;
    private PaymentGatewayProvider paymentGatewayProvider;
    private PaymentMode paymentMode;

}
