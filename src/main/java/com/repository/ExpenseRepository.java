package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.model.Expense;

public interface ExpenseRepository extends JpaRepository<Expense,Long> {
	
}
