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
    /*
    private static final double XPOS = 300.0;   // horizontal center of lollipop
    private static final double YPOS = 180.0;   // vertical center of lollipop
    private static final double STICK = 200.0;  // length of the lollipop stick
    private static final double SIZE = 80.0;    // size of lollipop
    */
    /**
     * Constructor for objects of class Lollipop
     */
    public Lollipop()
    {
        // initialise instance variables
        UI.initialise();     // bring up the GUI
        UI.addButton("Draw", this::drawLollipops);   // call the drawLollipop method
        UI.addButton("Quit", UI::quit);
    }

    /**
     * Draw a lollipop
     */
    public void doDrawLollipop(double x, double y, double size, double stick) {
        // declare variables
        double left = x - size/2;   // left most pos of lollipop
        double top = y - size/2;    // top most pos of lollipop
        double bottom = y + stick;  // bottom most pos of lollipop
        
        
        // draw the stick
        UI.setColor(Color.black);
        UI.setLineWidth(size/8.0);  // stick 1/8th size of lollipop
        UI.drawLine(x, y, x, bottom);
        
        // draw the lollipop
        UI.setLineWidth(1.0);
        UI.setColor(Color.red);
        UI.fillOval(left, top, size, size);
    }
    
    /**
     * Calls the doDrawLollipop method with a number of different parameters
     * 
     */
    public void drawLollipops() {
        // ask user for diameter
        double diameter = UI.askDouble("Diameter: ");
        
        this.doDrawLollipop(300, 180, diameter, 200);
        this.doDrawLollipop(100, 50, diameter/4, 20);
        this.doDrawLollipop(200, 100, diameter/2, 100);
        this.doDrawLollipop(400, 150, diameter/3, 50);
    }
}
