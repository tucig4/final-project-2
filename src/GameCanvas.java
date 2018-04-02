import base.GameObject;
import base.GameObjectManager;
import game.Bullet.Bullet;
import game.Player.Player;
import game.background.BackGround;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class GameCanvas extends JPanel{
    Player player;
    BufferedImage backBuffered;
    Graphics graphics;
    Bullet bullet;


    public GameCanvas(){
        this.setup();
        this.setupBackBuffered();
        this.setupBackground();
        this.setupPlayer();
        this.setupBullet();
       // this.setPlayerRotate();
    }

    private void setup(){
        this.setSize(1000,1000);
        this.setVisible(true);
    }

    private void setupBackBuffered(){
        this.backBuffered = new BufferedImage(1000,1000,BufferedImage.TYPE_4BYTE_ABGR);  // du tru 1 buc anh tren RAM
        this.graphics = this.backBuffered.getGraphics(); // lan chup nhanh cua lan ve cuoi cung va dung de ve trong backbuffered
    }
    private void setupPlayer(){
        Player player = GameObjectManager.instance.recycle(Player.class);
        player.position.set(500,500);

        }
    private void setupBullet(){

       // this.bullet.position.set(500,500);
       // GameObjectManager.instance.add(this.bullet);
    }


    private void setupBackground(){
        BackGround backGround = new BackGround();
        backGround.position.set(500,500);
        GameObjectManager.instance.add(backGround);
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(this.backBuffered,0,0,null); // cai ham nay dung de ve 1 anh

    }

    public void runAll(){
        GameObjectManager.instance.runAll();
    }

    public void renderAll(){
        GameObjectManager.instance.renderAll(this.graphics);
        this.repaint();
    }

}
