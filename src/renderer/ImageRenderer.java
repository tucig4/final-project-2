package renderer;

import base.Vector2D;
import Utils.Utils;
import java.awt.*;
import java.awt.image.BufferedImage;

public class ImageRenderer implements Renderer {
    private BufferedImage image;

    public ImageRenderer(String path) {
        this.image = Utils.loadImage(path);
    }

    @Override
    public void render(Graphics graphics, Vector2D position) {
        if (this.image != null) {
            graphics.drawImage(this.image, (int)position.x - this.image.getWidth() / 2, (int)position.y - this.image.getHeight() / 2, null);
        }
    }
}
