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
    private Vector2D rotate;
    public Player() {
        image = Utils.loadImage("resources/PlayerState/crank.png");
        //this.imageRender = new ImageRenderer("resources/PlayerState/crank.png");
        bullet = GameObjectManager.instance.recycle(Bullet.class);
        this.renderer = imageRender;
        this.rotate = new Vector2D(0, 1);
    }
    @Override
    public void run() {
        super.run();
        if(!keyPressed) {
            rotateBullet();
        }else {
            bulletMoving();
        }
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
        g2d.drawImage(image, (int) this.position.x-50, (int) this.position.y-30, null);
        g2d.setTransform(origXform);
    }
    public void rotateBullet(){
        angle+=5;
        Vector2D vector2D = new Vector2D(0,243);
        rotate.set(vector2D.rotate(angle));
        bullet.position.set(this.position.add(rotate));
    }
    public void bulletMoving(){
        angle+=5;
        bullet.velocity.set(-rotate.normalize().y, rotate.normalize().x).multiply(20);
        }
}
