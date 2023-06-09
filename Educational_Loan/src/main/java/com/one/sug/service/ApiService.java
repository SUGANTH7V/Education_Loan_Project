package com.one.sug.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.one.sug.model.LoanApplicationModel;
import com.one.sug.model.UserModel;
import com.one.sug.repository.LoanApplicationRepository;
import com.one.sug.repository.UserRepository;
@Service
public class ApiService implements ApiServiceImpl {
	@Autowired
	UserRepository apiRepo;
	@Autowired
	LoanApplicationRepository apiRepo1;

	@Override
	public String login(String email, String password) {
		UserModel user = apiRepo.findByEmail(email);
		if (user == null) {
			return "Email not Found";
		} else {
			if (user.getPassword().equals(password)) {
				return "Login Successful";
			} else {
				return "Password Wrong";
			}
		}
	}

	@Override
	public UserModel signup(UserModel u) {
		return apiRepo.save(u);
	}

	@Override
	public List<LoanApplicationModel> getAllLoans() {
		return apiRepo1.findAll();
	}

	@Override
	public List<UserModel> getAllUsers() {
		return apiRepo.findAll();	}

	@Override
	public LoanApplicationModel viewLoan(int user) {
		return apiRepo1.findById(user).get();
	}

	@Override
	public String delect(int id) {
		apiRepo.deleteById(id);
		return "Details Deleted";
	}
	@Override
	public LoanApplicationModel saveLoan(LoanApplicationModel l) {
		return apiRepo1.save(l);
	}

	@Override
	public LoanApplicationModel updateLoan(LoanApplicationModel l, int id) {
		return apiRepo1.saveAndFlush(l);
	}

	@Override
	public void deleteLoan(int id) {
		apiRepo1.deleteById(id);
	}

	
	
}
