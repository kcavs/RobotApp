import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.*;
import java.awt.Image;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File; 

public class Roboap{
    public static void main(String[]args) throws Exception{
        Robot kiersten= new Robot();
        kiersten.mouseMove(2,1090);
        kiersten.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseMove(200,1090);
        kiersten.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.delay(500);
        kiersten.keyPress(67);
        kiersten.keyRelease(67);
        kiersten.delay(500);
        kiersten.keyPress(65);
        kiersten.keyRelease(65);
        kiersten.delay(500);
        kiersten.keyPress(77);
        kiersten.keyRelease(77);
        kiersten.delay(500);
        kiersten.keyPress(10);
        kiersten.keyRelease(10);
        kiersten.delay(1500);
        kiersten.mouseMove(1250,530);
        kiersten.delay(500);
        kiersten.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.delay(2500);
        kiersten.mouseMove(1250,950);
        kiersten.delay(500);
        kiersten.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.delay(500);
        kiersten.mouseMove(750,125);
        kiersten.delay(500);
        kiersten.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.delay(500);
        kiersten.mouseMove(750,250);
        kiersten.delay(500);
        kiersten.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.delay(1200);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        Rectangle bounds = new Rectangle(screenSize);
        BufferedImage image= kiersten.createScreenCapture(bounds); 
        File file = new File("myScreenShot.png");
        ImageIO.write(image,"png", file);
        System.out.println("A screenshot is captured to " + file.getPath()); 

    }
}
        
 