package game.input;



import game.Bullet.Bullet;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {
    public static KeyInput instance = new KeyInput();
    private Bullet bullet;
    public KeyInput(){
        bullet = new Bullet();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_S){
        bullet.playerPressed=true;
        }
        if(e.getKeyCode()== KeyEvent.VK_D){

        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
