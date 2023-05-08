package com.one.sug.service;

import java.util.List;

import com.one.sug.model.LoanApplicationModel;
import com.one.sug.model.UserModel;

public interface ApiServiceImpl {
	public String login(String email, String password);
	public UserModel signup(UserModel u);
	public List<LoanApplicationModel> getAllLoans();
	public List<UserModel> getAllUsers();
	public LoanApplicationModel viewLoan(int user);
	public String delect(int id);
	public LoanApplicationModel saveLoan(LoanApplicationModel l);
	public LoanApplicationModel updateLoan(LoanApplicationModel l, int id);
	public void deleteLoan(int id);
}
