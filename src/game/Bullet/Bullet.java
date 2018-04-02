package game.Bullet;

import base.GameObject;
import base.Vector2D;
import renderer.ImageRenderer;

public class Bullet extends GameObject {
        public Vector2D velocity;


        public Bullet(){
            this.renderer = new ImageRenderer("resources/Bullet/bullet01.png");
            velocity = new Vector2D();
        }

    @Override
    public void run() {
        super.run();
        this.position.addUp(velocity);
        }


}
