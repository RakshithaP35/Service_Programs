package com.xworkz.service;

import com.xworkz.service.transformer.dto.TransformerDTO;

public interface TransformerService {
	boolean validateAndSave(TransformerDTO dto);

}
