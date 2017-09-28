/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.example.chess.field;

/**
 *
 * @author Armenuhi
 */
public class Point {
    public short x;
    public short y;
    
    public void setX(short x) {
        if (x > 64 || x < 1) {
            throw new IllegalArgumentException("Incorrect coordinate " + x);
        }
        this.x = x;
    }
    
    public short getX() {
        return this.x;
    }
    
    public void setY(short y) {
        if (y > 64 || y < 1) {
            throw new IllegalArgumentException("Incorrect coordinate " + y);
        }
        this.y = y;
    }
    
    public short gety() {
        return this.y;
    }
}
