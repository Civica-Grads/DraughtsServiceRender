package com.civica.grads.boardgames.web.model;

import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.Game;

public interface GameDataService {

    Game getCurrentGame();
    Board getCurrentBoard();
    
}
