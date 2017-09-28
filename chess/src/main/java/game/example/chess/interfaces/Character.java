package game.example.chess.interfaces;

import game.example.chess.field.Point;
import game.example.common.Constants.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Armenuhi
 */
public interface Character {
  
    public boolean canMove(Point point);
    public boolean move(Point point);
    public boolean isInGame();
    public boolean removeFromGame();
    public void setColor(Color characterColor);
    public Color getColor();
    public Point getPosition();   
}
