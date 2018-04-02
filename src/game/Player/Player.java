package game.Player;

import Utils.Utils;
import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;
import game.Bullet.Bullet;
import renderer.ImageRenderer;
import renderer.Renderer;

import java.awt.*;
import java.awt.geom.AffineTransform;


public class Player extends GameObject {
    private Bullet bullet;
    private double angle=0;
    private Renderer imageRender;
    private Image image;
    public static boolean keyPressed = false;
    public Player(){
         image = Utils.loadImage("resources/PlayerState/crank.png");
        //this.imageRender = new ImageRenderer("resources/PlayerState/crank.png");
        bullet = GameObjectManager.instance.recycle(Bullet.class);
        this.renderer= imageRender;
        }

    @Override
    public void run() {
        super.run();
        rotateBullet();

    }

    @Override
    public void render(Graphics graphics) {
        super.render(graphics);
        Graphics2D g2d = (Graphics2D) graphics;
        AffineTransform origXform = g2d.getTransform();
        AffineTransform newXform = (AffineTransform) (origXform.clone());
        int xRot = (int) this.position.x;
        int yRot = (int) this.position.y;
        newXform.rotate(Math.toRadians(angle), xRot, yRot);
        g2d.setTransform(newXform);
        g2d.drawImage(image, (int) this.position.x, (int) this.position.y, null);
        g2d.setTransform(origXform);
    }

    public void rotateBullet(){
        angle+=5;
        Vector2D vector2D = new Vector2D(0,300);
        vector2D = vector2D.rotate(angle);
        System.out.println(vector2D.y +" "+ vector2D.x);
        bullet.position.set(this.position.add(vector2D));
        if(keyPressed) {
            System.out.println("------");
            bullet.velocity.set(-vector2D.y, vector2D.x);
        }
    }
}
