/**
 * 
 */
package com.civica.grads.boardgames.web.model;

import com.civica.grads.boardgames.model.GameBoard;
import com.civica.grads.boardgames.interfaces.Board;
import com.civica.grads.boardgames.model.BoardPojo;
import com.civica.grads.boardgames.model.Game;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Bruce.Mundin
 *
 */
@Service
public class FetchDataGameDataService implements GameDataService {

    private final RestTemplate restTemplate = new RestTemplate();
    
    @Value("${url.storageService}")
    private String storageServiceURL ;
    
    /* (non-Javadoc)
     * @see com.civica.grads.boardgames.web.model.GameDataService#getCurrentGame()
     */
    @Override
    public Game getCurrentGame() {
        
        
        Game game = restTemplate.getForObject(storageServiceURL, Game.class);

        
        return game;
    }

    /* (non-Javadoc)
     * @see com.civica.grads.boardgames.web.model.GameDataService#getCurrentBoard()
     */
    @Override
    public GameBoard getCurrentBoard() {
        Board srcBoard = restTemplate.getForObject(storageServiceURL, BoardPojo.class);

        
        return new GameBoard(srcBoard);   
        }

}
