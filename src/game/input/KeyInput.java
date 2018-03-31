package game.input;



import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener {
    public static KeyInput instance = new KeyInput();
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()== KeyEvent.VK_S){

        }
        if(e.getKeyCode()== KeyEvent.VK_D){

        }
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
