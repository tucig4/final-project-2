package base;

import java.awt.*;
import java.util.Vector;

public class GameObjectManager {
    public static GameObjectManager instance = new GameObjectManager();
    private Vector<GameObject> vector;
    private Vector<GameObject> temp;

    private GameObjectManager(){
        vector = new Vector<>();
        temp = new Vector<>();
    }

    public void runAll(){ // ham dung de chay tat ca cac gameobject
        this.vector
                .stream()
                .forEach(gameObject -> gameObject.run()); // duyet tung phan tu va cho chay ham run
        this.vector.addAll(this.temp); //them tat ca cac phan tu trong temp vao vector
        this.temp.clear(); // xoa phan tu trong temp
    }

    public void renderAll(Graphics graphics){
        this.vector
                .stream()
                .forEach(gameObject -> gameObject.render(graphics));
    }
    public <T extends GameObject> T recycle(Class<T> cls) {
        T t = (T) this.vector
                .stream()
                .filter(gameObject -> cls.isInstance(gameObject)) // kt gameObject co kieu == kieu mong muon hay ko
                .findFirst()
                .orElse(null);
        if (t == null) { //chua ton tai con nay trong vector
            try {
                t = cls.newInstance(); //tao moi mot con
                this.add(t); //add vao vector
                return t;
            } catch (InstantiationException e) {
                e.printStackTrace();
                return null;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return null;
            }
        }

        return t;
    }
    public void add(GameObject gameObject){ // ham nay dung de them gameObject vao temp
        this.temp.add(gameObject);
    }
}
