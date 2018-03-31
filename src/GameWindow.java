import game.input.KeyInput;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GameWindow extends JFrame{
    GameCanvas gameCanvas;
    private long lastTime =0;

    public GameWindow(){ // constructor
        this.setup();
        this.setupCanvas();
        this.listener();
        this.setVisible(true); // thiet lap nhin thay cho Jframe
    }
    private void setup(){
        this.setSize(1000,1000); // Thiet lap kich co cho JFrame
    }
    private void setupCanvas(){
        this.gameCanvas = new GameCanvas();
        this.add(this.gameCanvas); // them giay ve vao khung tranh
    }
    private void listener(){
        this.keyLister();
        this.windowListener();
    }
    // keyboard listener...
    private void keyLister(){
        this.addKeyListener(KeyInput.instance);
    }

    private void windowListener(){ // Methods nay dung de dong cua so window
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
    public void gameLoop(){
        while (true){
            long currentTime = System.nanoTime();
            if(currentTime - this.lastTime >= 17_000_000){
                this.gameCanvas.runAll();
                this.gameCanvas.renderAll();
                this.lastTime = currentTime;
            }
        }
    }
}
