package org.example.ebankingbackend.repositories;

import org.example.ebankingbackend.entities.Customer;
import org.example.ebankingbackend.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AccountOperationRepository extends JpaRepository<Operation,Long> {
    List<Operation>findByBankAccountId(String accountId);
    Page<Operation>findByBankAccountId(String accountId, Pageable pageable);
}
