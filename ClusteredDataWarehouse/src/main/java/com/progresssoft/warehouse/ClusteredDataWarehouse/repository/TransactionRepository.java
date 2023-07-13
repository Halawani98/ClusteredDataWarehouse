package com.progresssoft.warehouse.ClusteredDataWarehouse.repository;
import com.progresssoft.warehouse.ClusteredDataWarehouse.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long>{

}
