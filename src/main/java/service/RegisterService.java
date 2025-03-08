package service;

import dto.RegisterDto;
import model.RegisterModel;
import repo.RegisterRepo;

public class RegisterService {
	
	private RegisterRepo regiterRepo = new RegisterRepo();
	private RegisterModel registerModel;
	
	public String registerUser(RegisterDto registerDTO) {
		registerModel = new RegisterModel(registerDTO.getUserType(),registerDTO.getUserEmail(),registerDTO.getUserTel(),registerDTO.getuPass(),registerDTO.isAgree());
		String response = regiterRepo.saveUser(registerModel);
		return response;
	}


}
