package com.one.sug.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.one.sug.model.LoanApplicationModel;
import com.one.sug.model.UserModel;
import com.one.sug.service.ApiServiceImpl;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@CrossOrigin("*")
public class ApiController {
	@Autowired
	ApiServiceImpl apiServImpl;
	@Tag(name="Get" ,description="get data")
	@PostMapping("/user/login")
	public String login(@RequestBody UserModel u) {
		return apiServImpl.login(u.getEmail(), u.getPassword());
	}

	@PostMapping("/user/signup")
	public UserModel signup(@RequestBody UserModel u) {
		return apiServImpl.signup(u);
	}
	
	@GetMapping("/admin/getAllLoans")
	public List<LoanApplicationModel> getAllLoans(){
		return apiServImpl.getAllLoans();
	}
	
	@GetMapping("/user/getProfile")
	public List<UserModel> getAllUsers(){
		return apiServImpl.getAllUsers();
	}
	
	@GetMapping("user/viewLoan/{user}")
	public LoanApplicationModel viewLoan(@PathVariable int user) {
		return apiServImpl.viewLoan(user);
	}
	@DeleteMapping("/user/delete/{id}")
	public String delect (@PathVariable int id)
	{
	   return apiServImpl.delect(id);
	}
	@PostMapping("/user/postLoan")
	public LoanApplicationModel saveLoan(@RequestBody LoanApplicationModel l) {
		return apiServImpl.saveLoan(l);
	}

	@PutMapping("/user/updateLoan/{id}")
	public LoanApplicationModel updateLoan(@RequestBody LoanApplicationModel l, @PathVariable int id) {
		return apiServImpl.updateLoan(l, id);
	}

	@DeleteMapping("/user/deleteLoan/{id}")
	public void deleteLoan(@PathVariable int id) {
		apiServImpl.deleteLoan(id);
	}
	@PutMapping("/user/update")
	public UserModel update(@RequestBody UserModel user) {
		return apiServImpl.signup(user);
	}
	
	
	
}
