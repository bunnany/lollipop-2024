import ecs100.*;        // import the ecs100 lib
import java.awt.Color;  // Use different colours
/**
 * Class demonstration to draw a lollipop for our first GUI
 *
 * @author NYB
 * @version 1
 */
public class Lollipop
{
    // instance variables
    private static final double XPOS = 300.0;   // horizontal center of lollipop
    private static final double YPOS = 180.0;   // vertical center of lollipop
    private static final double STICK = 200.0;  // length of the lollipop stick
    private static final double SIZE = 80.0;    // size of lollipop

    /**
     * Constructor for objects of class Lollipop
     */
    public Lollipop()
    {
        // initialise instance variables
        UI.initialise();     // bring up the GUI
        UI.addButton("Draw", this::doDrawLollipop);   // call the drawLollipop method
        UI.addButton("Quit", UI::quit);
    }

    /**
     * Draw a lollipop
     */
    public void doDrawLollipop() {
        // declare variables
        
        // draw the stick
        UI.setColor(Color.black);
        UI.setLineWidth(10.0);
        UI.drawLine(XPOS, YPOS, XPOS, YPOS+STICK);
        
        // draw the lollipop
        UI.setLineWidth(1.0);
        UI.setColor(Color.red);
        UI.fillOval(XPOS-SIZE/2, YPOS-SIZE/2, SIZE, SIZE);
    }
}
