package game.Bullet;

import base.FrameCounter;
import base.GameObject;
import base.Vector2D;
import game.Player.Player;
import renderer.AnimationRenderer;
import renderer.ImageRenderer;
import renderer.Renderer;

public class Bullet extends GameObject {
    Player player;
    private Renderer imageRender;
    private FrameCounter frameCounter;
    AnimationRenderer animationRenderer;
    Vector2D velocity;
    public static boolean playerPressed=false;

    public Bullet(){
        velocity = new Vector2D();
        this.renderer = new ImageRenderer("resources/Bullet/bullet.png");
        animationRenderer = new AnimationRenderer(
            15,"resources/Bullet/01.png",
                "resources/Bullet/02.png",
                "resources/Bullet/03.png",
                "resources/Bullet/04.png",
                "resources/Bullet/05.png",
                "resources/Bullet/06.png",
                "resources/Bullet/07.png",
                "resources/Bullet/08.png",
                "resources/Bullet/09.png",
                "resources/Bullet/10.png",
                "resources/Bullet/11.png",
                "resources/Bullet/12.png",
                "resources/Bullet/13.png",
                "resources/Bullet/14.png",
                "resources/Bullet/15.png",
                "resources/Bullet/16.png",
                "resources/Bullet/17.png",
                "resources/Bullet/18.png",
                "resources/Bullet/19.png",
                "resources/Bullet/20.png",
                "resources/Bullet/21.png",
                "resources/Bullet/Untitled-9.png",
                "resources/Bullet/Untitled-10.png",
                "resources/Bullet/Untitled-11.png",
                "resources/Bullet/Untitled-12.png",
                "resources/Bullet/Untitled-13.png",
                "resources/Bullet/Untitled-14.png"
                );
        this.renderer = this.animationRenderer;
        }

    @Override
    public void run() {
        super.run();
        this.position.addUp(this.velocity);
        if(playerPressed==true) {
            checkBulletposition();
        }
    }

    public void checkBulletposition(){
        if(animationRenderer.getCurrentIndex()==0){
            System.out.println(this.position.x +" "+ this.position.y);
            this.velocity.set(this.position.x-200,this.position.y-200);
        }

    }

}
