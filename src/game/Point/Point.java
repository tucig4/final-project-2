package game.Point;

import base.GameObject;
import game.Bullet.Bullet;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;
import renderer.ImageRenderer;

import java.awt.*;

public class Point extends GameObject implements PhysicBody, HitObject {
    public BoxCollider boxCollider;
    public RunHitObject runHitObject;
    public static int countPoint ;
    public Point(){
        this.renderer = new ImageRenderer("resources/point/point.png");
        this.boxCollider = new BoxCollider(101,93);
        this.runHitObject = new RunHitObject(Bullet.class);
    }

    @Override
    public void run() {
        super.run();
        this.boxCollider.position.set(this.position);
        this.runHitObject.run(this);

    }

    @Override
    public void getHit(GameObject gameObject) {
        this.isAlive = false;
        if(this.isAlive == false){
            countPoint++;
        }
       // System.out.println(countPoint+"----------");
    }

    @Override
    public void render(Graphics graphics) {
        super.render(graphics);
        graphics.setFont(new Font("Arial",Font.BOLD,50));
        graphics.setColor(Color.BLACK);
        graphics.drawString(String.valueOf(countPoint),900,50);

    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }


    
}
