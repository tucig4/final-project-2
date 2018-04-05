package game.Bullet;

import base.GameObject;
import base.Vector2D;
import game.Point.Point;
import physic.BoxCollider;
import physic.HitObject;
import physic.PhysicBody;
import physic.RunHitObject;
import renderer.ImageRenderer;

public class Bullet extends GameObject implements PhysicBody, HitObject {
        public Vector2D velocity;
        private BoxCollider boxCollider;
        private RunHitObject runHitObject;
        public Bullet(){
            this.renderer = new ImageRenderer("resources/Bullet/bullet01.png");

            velocity = new Vector2D();
            this.boxCollider = new BoxCollider(86,74);
            this.runHitObject = new RunHitObject(Point.class);
        }

    @Override
    public void run() {
        super.run();
        this.position.addUp(velocity);
        this.boxCollider.position.set(this.position);
        this.runHitObject.run(this);
        }


    @Override
    public void getHit(GameObject gameObject) {
            if(gameObject instanceof Point){
                System.out.println("Point");
            }
        this.isAlive = false;
    }

    @Override
    public BoxCollider getBoxCollider() {
        return this.boxCollider;
    }
}
