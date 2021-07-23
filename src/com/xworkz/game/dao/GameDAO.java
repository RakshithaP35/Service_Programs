package com.xworkz.game.dao;

import com.xworkz.service.transformer.dto.GameDTO;

public interface GameDAO {
	boolean save(GameDTO dto);

}
