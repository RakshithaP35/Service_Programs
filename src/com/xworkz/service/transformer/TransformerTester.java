package com.xworkz.service.transformer;


import com.xworkz.service.TransformerImpl;
import com.xworkz.service.TransformerService;
import com.xworkz.service.transformer.dto.TransformerDTO;

public class TransformerTester {

	public static void main(String[] args) {
		TransformerDTO trans = new TransformerDTO("Rakshitha", "Bangalore", "Cool Type", "Rare", "Always","sometimes","i like to talk more , i like to sleep , i like to watch series");
		
		TransformerService gameService = new TransformerImpl();
		boolean Saved = gameService.validateAndSave(trans);
		System.out.println(Saved);

	}

}
