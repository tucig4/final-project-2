package game.background;

import Utils.Utils;
import base.GameObject;
import renderer.ImageRenderer;

public class BackGround extends GameObject{
    public BackGround(){
        this.renderer = new ImageRenderer("resources/Background/solid-white-fabric_large.jpg");
    }
}
