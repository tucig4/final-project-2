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
        this.
        this.velocity = new Vector2D();


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
