package com.javastudies.javastudiesdemo.repositories;

import com.javastudies.javastudiesdemo.domain.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
