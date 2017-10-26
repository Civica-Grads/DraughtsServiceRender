/**
 * 
 */
package com.civica.grads.boardgames.web.model;

import com.civica.grads.boardgames.model.Board;
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
    public Board getCurrentBoard() {
        Board board = restTemplate.getForObject(storageServiceURL, Board.class);

        
        return board;    }

}
