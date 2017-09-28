/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.example.chess.board;

import game.example.chess.field.Point;
import game.example.common.Constants;

/**
 *
 * @author Armenuhi
 */
public class ChessBoard {
    
    private Point[][] squareSet;
    public Character[][] pieceSet ;
    
    public void setAvailable(boolean available) {
        
    }
    
    public boolean isAvailable(Point p) {
        return false;
    }
    
    public Character getCharacter(Point p) {
        if (isAvailable(p)) {
            // TBD custom exception
            throw new IllegalArgumentException("The position is not free " + 
                    "x = " + p.x + ", y = " + p.y);
        }
        return null;
    }
    
    public Character setCharacter() {
        return null;
    }
 
}
