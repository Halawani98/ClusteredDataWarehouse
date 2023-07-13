package com.progresssoft.warehouse.ClusteredDataWarehouse.service;

import com.progresssoft.warehouse.ClusteredDataWarehouse.model.Transaction;
import com.progresssoft.warehouse.ClusteredDataWarehouse.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * @author Anas Al-Halawani
 */
@Service
public class TransactionService {
    private final TransactionRepository transactionRepository;

    @Autowired
    public TransactionService(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    public Transaction persistTransaction(Transaction transaction) {
        return transactionRepository.save(transaction);
    }
}
