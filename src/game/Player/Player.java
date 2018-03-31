package game.Player;

import base.FrameCounter;
import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;
import renderer.AnimationRenderer;
import renderer.ImageRenderer;
import renderer.Renderer;

import java.awt.*;


public class Player extends GameObject {
    private Renderer animationRenderer;
    private Renderer imageRender;
    public Vector2D velocity;
    private boolean isAnimation ;
    private FrameCounter frameCounter;

    public Player(){
        this.renderer = new ImageRenderer("resources/chuongngaivat.png");
        this.animationRenderer = new AnimationRenderer(
                15,
                "resources/PlayerState/Untitled-1.png",
                "resources/PlayerState/Untitled-2.png",
                "resources/PlayerState/Untitled-3.png",
                "resources/PlayerState/Untitled-4.png",
                "resources/PlayerState/Untitled-5.png",
                "resources/PlayerState/Untitled-6.png",
                "resources/PlayerState/Untitled-7.png",
                "resources/PlayerState/Untitled-8.png",
                "resources/PlayerState/Untitled-9.png",
                "resources/PlayerState/Untitled-10.png",
                "resources/PlayerState/Untitled-11.png",
                "resources/PlayerState/Untitled-12.png",
                "resources/PlayerState/Untitled-13.png",
                "resources/PlayerState/Untitled-14.png",
                "resources/PlayerState/Untitled-15.png"
        );
        this.frameCounter = new FrameCounter(50);
        this.renderer=this.animationRenderer;
        this.velocity = new Vector2D();
        }
}
