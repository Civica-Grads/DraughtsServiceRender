package com.civica.grads.boardgames.web.model;

import com.civica.grads.boardgames.model.Game;
import com.civica.grads.boardgames.model.GameBoard;

public interface GameDataService {

    Game getCurrentGame();
    GameBoard getCurrentBoard();
    
}
