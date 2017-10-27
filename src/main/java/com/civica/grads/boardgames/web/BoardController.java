package com.civica.grads.boardgames.web;

import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.model.GameBoard;
import com.civica.grads.boardgames.web.model.GameDataService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BoardController {

    
    @Autowired
    private GameDataService dameDataService;

    
    @RequestMapping("/json")
    GameBoard getBoard() throws GameException {
        
        return dameDataService.getCurrentBoard() ;
    }
    
    

}