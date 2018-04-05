package game.Point;

import base.GameObject;
import game.Bullet.Bullet;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;
import renderer.ImageRenderer;

public class Point extends GameObject implements PhysicBody, HitObject {
    public BoxCollider boxCollider;
    public RunHitObject runHitObject;
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
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
