package practicalfour;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/**
* This class produces simple graphical output.
* The program will display a complementary color scheme.
*
* <p>Bugs: This program has no known bugs.
*
* @author Janyl Jumadinova
*/
public class DisplayComplementaryDrawingCanvas extends Application {

  // define the CANVAS_HEIGHT and CANVAS_WIDTH of the graphic
  public static final int CANVAS_WIDTH = 600;
  public static final int CANVAS_HEIGHT = 400;

  // define the maximum RGB value that is possible
  public static final int RGB_MAXIMUM = 255;

  /**
  * The start method will input values from a file and display the canvas.
  * The program will display a complementary color scheme, using some
  * methods that are provided by another Java class.
  *
  */
  public void start(Stage primaryStage) {
    // declare the starting file and scanner
    File colorValuesInputFile = null;
    Scanner scanner = null;
    // connect the scanner to the input file
    try {
      colorValuesInputFile = new File("input/color_values.txt");
      scanner = new Scanner(colorValuesInputFile);
    } catch (FileNotFoundException noFile) {
      System.out.println("Unable to locate file");
    }
    // *TODO: Read in the RED color value using scanner
    int redValue =
    // *TODO: Read in the GREEN color value
    int greenValue =
    // *TODO: Read in the BLUE color value
    int blueValue =

    // Create the color based on the input values from the user
    Color userColor = Color.rgb(redValue, greenValue, blueValue);

    // TODO: Draw a rectangle starting at (0,0) with dimensions CANVAS_WIDTH/2 and CANVAS_HEIGHT

    // TODO: fill the first half (left-to-right) of the canvas with the user's color
    // make calls to setFill method with the correct parameters

    // *TODO: calculate the "complementary" color of the provided color
    // and then create a new Color object called userComplementaryColor.
    // Refer to notes in the practical assignment sheet about this calculation.
    // Make sure to add your own calculation to the right side of the equal sign!
    Color userComplementaryColor =

    // TODO: fill the second half (left-to-right) of the canvas
    // with the complement of the user's color
    // Draw a second rectangle and make calls to setFill with the correct parameters

    // *TODO: add your rectangle objects to the root
    Group root = new Group();

    // Add root to the scene
    Scene scene = new Scene(root, CANVAS_WIDTH, CANVAS_HEIGHT);

    // set the stage
    // *TODO: change the name to your own
    primaryStage.setTitle("Colors by Janyl Jumadinova" + new Date());
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /** Launches the canvas scene.
  */
  public static void main(String[] args) {
    launch(args);
  }
}
