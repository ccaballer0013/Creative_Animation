import org.code.theater.*;
import org.code.media.*;

public class DiningRoom extends Restaurant {

  private static TableSet[] tableThings;

  public DiningRoom(TableSet[] tableThings, Foods[] allFoods) {
    super(allFoods);
    this.tableThings = tableThings;
  }  

  public static TableSet[] getTableSet() {
    return tableThings;
  }

  /** 
   * Background image will be drawn and sound will be played
   * 
   * Precondition: file names must be properly used
   * Postcondition: image and sound will be shown
   */
  public void drawBackground() {
    drawImage("wood.png", 0, 0, 400);
  }

  /** 
   * This method calls other methods to 
   * create the DiningRoom scene
   * 
   * Precondition: required lists/arrays must have values
   * Postcondition: images, sounds, and words will be shown
   */
  public void createScene() {
    callTableThings();
    pause(1);
    
    drawImage("placemat.png", 20, 100, 350);
    playSound("typewriter_click.wav");
    pause(0.5);
    drawImage("fork.png", 320, 140, 20);
    playSound("typewriter_click.wav");
    pause(0.5);
    drawImage("napkin.png", 20, 140, 110);
    playSound("typewriter_click.wav");
    pause(0.5);
    drawImage("knife.png", 50, 140, 15);
    playSound("typewriter_click.wav");
    pause(0.5);
    drawImage("saladWithSpoon.png", 110, 145, 220);
    playSound("typewriter_click.wav");
  }

  /** 
   * text will be set and drawn
   * 
   * Precondition: text will be drawn
   * Postcondition: text will not be changed
   */
  public void callNames() {
    setTextStyle(Font.SANS, FontStyle.BOLD);
    setTextHeight(30);
    setTextColor("white");
    drawText("Fruit Salad and Tableset", 25, 350);
    playSound("chime.wav");
  }

  /** 
   * String text will be set and drawn
   * 
   * Precondition: String text will not equal ""
   * Postcondition: text will not be changed
   * 
   * @param    String text    text to be printed
   */
  public void callNames(String text) {
    setTextStyle(Font.SANS, FontStyle.BOLD);
    setTextHeight(40);
    setTextColor("white");
    drawText(text, 35, 50);
    playSound("chime.wav");
  }

  /** 
   * names of table items will be drawn
   * 
   * Precondition: tableThings.length > 0
   * Postcondition: all table items will be shown
   */
  public void callTableThings() {
    setTextStyle(Font.SANS, FontStyle.BOLD);
    setTextHeight(15);
    setTextColor("white");

    String things = "";
    for (int i=0; i<tableThings.length-1; i++) {
      if (i<1) {
        things += tableThings[i].getThingName();
      } else if (i<tableThings.length) {
        things += ", " + tableThings[i].getThingName();
      } else {
        things += tableThings[i].getThingName();
      }
    }
    drawText("Table Items: ", 20, 75);
    drawText(things, 20, 85);
    playSound("chime.wav");
  }

  
}
