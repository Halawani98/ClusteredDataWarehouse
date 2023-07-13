package com.progresssoft.warehouse.ClusteredDataWarehouse.model;
import lombok.Data;

import java.time.LocalDateTime;
import javax.persistence.*;

/**
 * @author Anas Al-Halawani
 */
@Entity
@Table(name= "transactions")
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long transactionId;
    private String fromCurrencyIsoCode;
    private String toCurrencyIsoCode;
    private LocalDateTime dealTimestamp;
    private double dealAmount;

    public Transaction( String fromCurrencyISOCode, String toCurrencyISOCode, LocalDateTime dealTimeStamp, double dealAmount) {
        this.fromCurrencyIsoCode = fromCurrencyISOCode;
        this.toCurrencyIsoCode = toCurrencyISOCode;
        this.dealTimestamp = dealTimeStamp;
        this.dealAmount = dealAmount;
    }

}
