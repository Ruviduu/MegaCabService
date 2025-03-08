package service;

import dto.LoginDto;
import model.LoginModel;
import repo.LoginRepo;



public class LoginService {
	
	private LoginRepo loginRepo = new LoginRepo();
	private LoginModel loginModel;
	
	public String validateUser(LoginDto loginDto) {
		 loginModel = new LoginModel(loginDto.getUserType(),loginDto.getEmail(), loginDto.getPassword());
		 String response = loginRepo.checkUser(loginModel);
		 return response;
	}

	}
	

