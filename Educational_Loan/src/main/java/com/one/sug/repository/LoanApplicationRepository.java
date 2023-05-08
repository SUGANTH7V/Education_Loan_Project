package com.one.sug.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.one.sug.model.LoanApplicationModel;

public interface LoanApplicationRepository extends JpaRepository<LoanApplicationModel, Integer> {



}
