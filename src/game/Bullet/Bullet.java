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
            15, "resources/Bullet/Untitled-1.png",
                "resources/Bullet/Untitled-113.png",
                "resources/Bullet/Untitled-114.png",
                "resources/Bullet/Untitled-115.png",
                "resources/Bullet/Untitled-116.png",
                "resources/Bullet/Untitled-117.png",
                "resources/Bullet/Untitled-118.png",
                "resources/Bullet/Untitled-9.png",
                "resources/Bullet/Untitled-10.png"

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
            System.out.println(this.position.x);
            this.velocity.set(-2,0);
        }

    }

}
