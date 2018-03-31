package game.Player;

import base.FrameCounter;
import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;
import renderer.ImageRenderer;
import renderer.Renderer;

import java.awt.*;


public class Player extends GameObject implements Renderer{

   // private Renderer imageRender;
    public Vector2D velocity;

    public Player(){
        this.renderer = new ImageRenderer("resources/chuongngaivat.png");
        this.velocity = new Vector2D();

    }
    public void create() {
        for (double angle = 0.0; angle <= 360.0; angle += 30.0) {
            //this.player = new Player();
            Vector2D vector2D = new Vector2D(0, 80);
            Vector2D rotate = vector2D.rotate(angle);
            this.position.set(rotate);
            System.out.println(this.position.x);

        }
    }
    @Override
    public void run() {
        super.run();
        //this.position.addUp(this.velocity);
    }

    @Override
    public void render(Graphics graphics, Vector2D position) {
        System.out.println(this.position.x);
        graphics.drawImage((Image)renderer,(int)this.position.x,(int)this.position.y,null);
    }
}
