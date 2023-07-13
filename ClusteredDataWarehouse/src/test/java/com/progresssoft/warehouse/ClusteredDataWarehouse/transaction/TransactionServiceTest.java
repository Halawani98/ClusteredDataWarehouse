package com.progresssoft.warehouse.ClusteredDataWarehouse.transaction;


import com.progresssoft.warehouse.ClusteredDataWarehouse.model.Transaction;
import com.progresssoft.warehouse.ClusteredDataWarehouse.repository.TransactionRepository;
import com.progresssoft.warehouse.ClusteredDataWarehouse.service.TransactionService;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;

import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;


@ExtendWith(MockitoExtension.class)
public class TransactionServiceTest {


    @Mock
    private TransactionRepository transactionRepository;

    private TransactionService underTest;

    @BeforeEach
    void setUp(){underTest =  new TransactionService(transactionRepository); }

    @Test
    void canAddTransaction() {

        //given
        Transaction transaction = new Transaction("USD", "JOD", LocalDateTime.now(), 5000);

        //when
        underTest.persistTransaction(transaction);

        //then
        ArgumentCaptor<Transaction> transactionArgumentCapture = ArgumentCaptor.forClass(Transaction.class);

       verify(transactionRepository).save(transactionArgumentCapture.capture());

       Transaction capturedTransaction = transactionArgumentCapture.getValue();


        assertThat(capturedTransaction).isEqualTo(transaction);


    }


}
