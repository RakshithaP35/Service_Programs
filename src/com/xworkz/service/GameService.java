package com.xworkz.service;

import com.xworkz.service.transformer.dto.GameDTO;

public interface GameService {
	
	boolean validateAndSave(GameDTO dto);

}
