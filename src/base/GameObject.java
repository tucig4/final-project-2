package base;

import renderer.Renderer;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Vector;

public class GameObject {
    //public BufferedImage image;
    public Vector2D position;
    public Renderer renderer;

    public GameObject(){
        this.position = new Vector2D();
    }

    public void run(){

    }

    public void render(Graphics graphics){
        if(this.renderer !=null){
           this.renderer.render(graphics, this.position);
        }
    }
}
