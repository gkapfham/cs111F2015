//=================================================
// Draw two boxes that display a color and the complement of the color.
//=================================================

import java.awt.*;
import javax.swing.JApplet;

public class PaintDrawingCanvas extends JApplet {

  //-------------------------------------------------
  // Use Graphics methods to add content to the drawing canvas
  //-------------------------------------------------
  public void paint(Graphics page) {
    // create the color based on the input values from the user
    Color userColor = new Color(DisplayDrawingCanvas.redValue,
        DisplayDrawingCanvas.greenValue, DisplayDrawingCanvas.blueValue);

    // fill entire background cyan
    page.setColor(userColor);
    page.fillRect(0,0,DisplayDrawingCanvas.WIDTH/2, DisplayDrawingCanvas.HEIGHT);

  }
}
