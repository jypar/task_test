package com.example.task.services;

import com.example.task.model.Payment;

public interface PaymentService {

    String addOrUpdate(Payment user);
    String findAccount(Payment payment);

}
