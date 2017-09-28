/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game.example.chess.player;

import game.example.chess.characters.Soldier;
import game.example.chess.interfaces.Character;
import game.example.chess.interfaces.Player;
import java.util.List;

/**
 *
 * @author Armenuhi
 */
public class BlackPlayer implements Player {
    // 8 Soldiers
    public Soldier soldier1 = null;
    public Soldier soldier2 = null;
    public Soldier soldier3 = null;
    public Soldier soldier4 = null;
    public Soldier soldier5 = null;
    public Soldier soldier6 = null;
    public Soldier soldier7 = null;
    public Soldier soldier8 = null;
    
    public BlackPlayer () {
        soldier1 = new Soldier();
    }

    @Override
    public List<Character> getCharacters() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
