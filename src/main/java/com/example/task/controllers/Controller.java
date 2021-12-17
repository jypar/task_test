package com.example.task.controllers;

import com.example.task.model.Payment;
import com.example.task.services.PaymentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class Controller {

    private PaymentService paymentService;
    private final Logger logger = LoggerFactory.getLogger("logging info");

    @Autowired
    public Controller(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping(value = "/pay")
    public String save(@RequestBody String request) throws JsonMappingException,JsonProcessingException {
        logger.info("request body for pay:" + request);
        ObjectMapper objectMapper = new ObjectMapper();
        Payment pay = objectMapper.readValue(request,Payment.class);
        return paymentService.addOrUpdate(pay);
    }

    @GetMapping(value = "/check")
    public String check(@RequestBody  String  request) throws JsonMappingException, JsonProcessingException {
        logger.info("request body for check:" + request);
        ObjectMapper objectMapper = new ObjectMapper();
        Payment payment = objectMapper.readValue(request,Payment.class);
        return paymentService.findAccount(payment);
    }
}
