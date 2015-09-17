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

    // fill the first half (left-to-right) with the user's color
    page.setColor(userColor);
    page.fillRect(0,0,DisplayDrawingCanvas.WIDTH/2, DisplayDrawingCanvas.HEIGHT);

    // calculate the "complementary" color of the provided color
    Color userComplementaryColor = new Color(255-DisplayDrawingCanvas.redValue,
          255-DisplayDrawingCanvas.greenValue,
          255-DisplayDrawingCanvas.blueValue);

    // fill the second half (left-to-right) with the complement of the user's color
    page.setColor(userComplementaryColor);
    page.fillRect(DisplayDrawingCanvas.WIDTH/2,0,DisplayDrawingCanvas.WIDTH/2, DisplayDrawingCanvas.HEIGHT);
  }
}
