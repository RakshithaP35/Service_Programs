package com.xworkz.service.transformer;

import com.xworkz.service.GameService;
import com.xworkz.service.GameServiceImpl;
import com.xworkz.service.transformer.dto.GameDTO;

public class GameTester {

	public static void main(String[] args) {
		
		GameDTO dto = new GameDTO("nfs","10","EA sports", 0 , 500.00, false); 

		
		GameService gameService = new GameServiceImpl();
		boolean Saved = gameService.validateAndSave(dto);
		System.out.println(Saved);
		
		
	}

}
