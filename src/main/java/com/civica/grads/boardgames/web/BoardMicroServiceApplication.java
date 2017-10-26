package com.civica.grads.boardgames.web;

import com.civica.grads.boardgames.enums.Colour;
import com.civica.grads.boardgames.exceptions.GameException;
import com.civica.grads.boardgames.model.Board;
import com.civica.grads.boardgames.model.Counter;
import com.civica.grads.boardgames.model.Position;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableAutoConfiguration
public class BoardMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BoardMicroServiceApplication.class, args);
    }
    
   
//    @Bean
//    Board board() throws GameException
//    {
//        return new Board(10)
//                .placePiece(new Counter(Colour.WHITE), new Position(0,0) );
//    }
    
    
}
