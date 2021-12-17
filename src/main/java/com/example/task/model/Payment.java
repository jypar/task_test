package com.example.task.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="payment")
public class Payment {

    @Id
    @Column(name="id",unique = true)
    private Long id;
    @Column(name="supplier_id")
    private Long supplier_id;
    @Column (name="account",unique = true)
    private Long account;
    @Column(name="amount")
    private Double amount;
    @Transient
    private String command;
    @Column(name="date")
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date date;

    public Payment() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Long supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", supplier_id=" + supplier_id +
                ", account=" + account +
                ", amount=" + amount +
                ", command='" + command + '\'' +
                ", date=" + date +
                '}';
    }
}
