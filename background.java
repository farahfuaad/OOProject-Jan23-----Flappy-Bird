import java.awt.*;
import java.awt.image.BufferedImage;

public class background {
    private Image bg;

    private int xLoc = 0, yLoc = 0;

    public background(int initialWidth, int initialHeight) {
        bg = Toolkit.getDefaultToolkit().getImage(this.getClass().getResource("resources/background.png"));
        scaleBackground(initialWidth, initialHeight);
    }

    public void scaleBackground(int width, int height) {
        bg = bg.getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    public Image getBg(){
        return bg;
    }

    public int getWidth() {
        return bg.getWidth(null);
    }

    public int getHeight() {
        return bg.getHeight(null);
    }

    public void setX(int x) {
        xLoc = x;
    }

    public int getX() {
        return xLoc;
    }

    public void setY(int y) {
        yLoc = y;
    }

    public int getY() {
        return yLoc;
    }

    public Rectangle getRectangle() {
        return (new Rectangle(xLoc, yLoc, bg.getWidth(null), bg.getHeight(null)));
    }

    public BufferedImage getBI() {
        BufferedImage bi = new BufferedImage(bg.getWidth(null), bg.getHeight(null), BufferedImage.TYPE_INT_ARGB);
        Graphics g = bi.getGraphics();
        g.drawImage(bg, 0, 0, null);
        g.dispose();
        return bi;
    }
}
