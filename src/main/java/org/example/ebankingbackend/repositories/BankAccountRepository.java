package org.example.ebankingbackend.repositories;

import org.example.ebankingbackend.entities.BankAccount;
import org.example.ebankingbackend.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankAccountRepository extends JpaRepository<BankAccount,String> {
}
