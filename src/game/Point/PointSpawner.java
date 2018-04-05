package game.Point;

import base.GameObject;
import base.GameObjectManager;

import java.util.Random;

public class PointSpawner extends GameObject {
    private Random random = new Random();

    public PointSpawner(){

    }
    public void create(){
        Point point = GameObjectManager.instance.recycle(Point.class);
        point.position.set(random.nextInt(1)+100,random.nextInt(1)+100);
    }
}
