package game.Player;

import base.GameObject;
import base.GameObjectManager;
import base.Vector2D;
import renderer.Renderer;

import java.awt.*;

public class PlayerRotate extends GameObject {
    private Vector2D velocity;
    private Player player;


    public PlayerRotate(){

    }

    public void create(){
        for(double angle=0.0;angle<=360.0;angle+=30.0){
            this.player = new Player();
            Vector2D vector2D = new Vector2D( 0,80);
            Vector2D rotate = vector2D.rotate(angle);
            player.position.set(rotate).addUp(100,100);
            System.out.println(position.x +position.y);
            GameObjectManager.instance.add(player);
        }
    }
}
