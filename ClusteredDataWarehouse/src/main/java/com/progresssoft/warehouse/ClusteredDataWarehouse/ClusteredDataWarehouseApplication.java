package com.progresssoft.warehouse.ClusteredDataWarehouse;
import com.progresssoft.warehouse.ClusteredDataWarehouse.model.Transaction;
import com.progresssoft.warehouse.ClusteredDataWarehouse.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.LocalDateTime;
/**
 * @author Anas Al-Halawani
 */
@SpringBootApplication
@EnableJpaRepositories
public class ClusteredDataWarehouseApplication implements CommandLineRunner {
	private final TransactionService transactionService;
	private static final Logger logger = LogManager.getLogger(ClusteredDataWarehouseApplication.class);
	@Autowired
	public ClusteredDataWarehouseApplication(TransactionService transactionService) {
		this.transactionService = transactionService;
	}
	public static void main(String[] args) {
		SpringApplication.run(ClusteredDataWarehouseApplication.class, args);
	}

	@Override
	public void run(String... args) {
		try {
			String fromCurrencyISOCode = "USD";
			String toCurrencyISOCode = "JOD";
			LocalDateTime timeStamp = LocalDateTime.now();
			double dealAmount = 5000;
			Transaction persistedTransaction = transactionService.persistTransaction(new Transaction(fromCurrencyISOCode, toCurrencyISOCode, timeStamp, dealAmount));
			logger.info("Transaction persisted: {}", persistedTransaction);
		} catch (Exception ex) {
			logger.error("An error occurred while processing the transaction", ex);
		}
	}
}