package game.input;



import game.Bullet.Bullet;
import game.Player.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {
    public static KeyInput instance = new KeyInput();
    private Player player;
    public KeyInput(){
        player = new Player();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_S){
        player.keyPressed= true;
        }
        if(e.getKeyCode()== KeyEvent.VK_D){

        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
