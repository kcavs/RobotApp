import java.awt.*;
import java.awt.event.InputEvent;
public class Roboap{
    public static void main(String[]args) throws Exception{
        Robot kiersten= new Robot();
        kiersten.mouseMove(2,1090);
        kiersten.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseMove(200,1090);
        kiersten.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.keyPress(67);
        kiersten.keyRelease(67);
        kiersten.keyPress(65);
        kiersten.keyRelease(65);
        kiersten.keyPress(77);
        kiersten.keyRelease(77);
    }
}
        
 