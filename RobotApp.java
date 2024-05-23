import java.awt.*;
import java.awt.event.InputEvent;
public class RobotApp{
    public static void main(String[]args) throws Exception{
        Robot kiersten= new Robot();
        kiersten.mouseMove(300,70);
        kiersten.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        kiersten.keyPress(77);
        kiersten.keyRelease(77);
        kiersten.keyPress(73);
        kiersten.keyRelease(73);
        kiersten.keyPress(75);
        kiersten.keyRelease(75);
        kiersten.keyPress(69);
        kiersten.keyRelease(69);
        kiersten.keyPress(32);
        kiersten.keyRelease(32);
        kiersten.keyPress(84);
        kiersten.keyRelease(84);
        kiersten.keyPress(72);
        kiersten.keyRelease(72);
        kiersten.keyPress(69);
        kiersten.keyRelease(69);
        kiersten.keyPress(32);
        kiersten.keyRelease(32);
        kiersten.keyPress(77);
        kiersten.keyRelease(77);
        kiersten.keyPress(79);
        kiersten.keyRelease(79);
        kiersten.keyPress(85);
        kiersten.keyRelease(85);
        kiersten.keyPress(83);
        kiersten.keyRelease(83);
        kiersten.keyPress(69);
        kiersten.keyRelease(69);
        kiersten.keyPress(13);
        kiersten.keyRelease(13);
    }
}
        
 