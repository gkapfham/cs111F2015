//==========================================
// Gregory M. Kapfhammer
// Class Exercise
// September 17, 2015
//
// Purpose: This program sets up a window with a "drawing
// canvas". To add things to the drawing, you must
// edit the file "DrawingCanvas.java".
//==========================================

import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class DisplayDrawingCanvas {

  public static int redValue;
  public static int greenValue;
  public static int blueValue;

  public static final int WIDTH = 600;
  public static final int HEIGHT = 400;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Input the Red Value: ");
    redValue = scan.nextInt();

    System.out.print("Input the Green Value: ");
    greenValue = scan.nextInt();

    System.out.print("Input the Blue Value: ");
    blueValue = scan.nextInt();

    JFrame window = new JFrame("Gregory M. Kapfhammer " + new Date());

    // Add the drawing canvas and do necessary things to
    // make the window appear on the screen!
    window.getContentPane().add(new PaintDrawingCanvas());
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    window.setSize(WIDTH, HEIGHT);
  }

}

