package com.impulsetech.ImpulseExpenseTracker.repository;

import java.time.LocalDate;
import java.util.List;

import com.impulsetech.ImpulseExpenseTracker.domain.ExpenseItem;
import com.impulsetech.ImpulseExpenseTracker.domain.ExpenseType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.prepost.PreAuthorize;

@RepositoryRestResource(path = "expense-items", collectionResourceRel = "expense-items")
@PreAuthorize("hasRole('ROLE_USER')")
public interface ExpenseItemRepository extends PagingAndSortingRepository<ExpenseItem, Long> {

    List<ExpenseItem> findByNameContainingIgnoreCase(String name);

    List<ExpenseItem> findByDateBetween(LocalDate start, LocalDate end);
    
    List<ExpenseItem> findByExpenseType(ExpenseType expenseType);

    List<ExpenseItem> findByExpenseTypeAndNameContainingIgnoreCase(ExpenseType expenseType, String name);
}