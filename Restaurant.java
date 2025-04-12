import org.code.theater.*;
import org.code.media.*;

public class Restaurant extends Scene {

  public Foods[] allFoods;

  public Restaurant(Foods[] allFoods) {
    this.allFoods = allFoods;
  }

  public Foods[] getFullMenu() {
    return allFoods;
  }

  /** 
   * This method calls other methods to 
   * create the Restaurant scene
   * 
   * Precondition: required lists/arrays must have values
   * Postcondition: images, sounds, and words will be shown
   */
  public void createScene() {

    drawBackground();
    drawWords();
    otherFoods();
  }

  /** 
   * Background image will be drawn and sound will be played
   * 
   * Precondition: file names must be properly used
   * Postcondition: image and sound will be shown
   */
  public void drawBackground() {
    playSound("bloop_x.wav");
    drawImage("diningBackground.png", 0, 0, 400);
    pause(1);
  }

  /** 
   * Restaurant name will be drawn
   * 
   * Precondition: file names must be properly used
   * Postcondition: image, words, and sound will be used
   */
  public void drawWords() {
    setTextStyle(Font.SANS, FontStyle.BOLD);
    setTextHeight(40);
    setTextColor("Black");
    drawText("FRUIT CAFE", 9, 40);
    playSound("chime.wav");
    pause(1);
    drawImage("Table.png", 30, 200, 350);
    playSound("chime.wav");
    pause(1);
  }

  /** 
   * Item names of other foods will be shown
   * 
   * Precondition: allFoods must exist
   * Postcondition: item names of each value in allFoods 
   * will be shown
   */
  public void otherFoods() {
    String availableFoods = "";
    for (int i=0; i<allFoods.length; i++) {
      if (i<1) {
        availableFoods += allFoods[i].getItemName();
      } else if (i<allFoods.length) {
        availableFoods += ", " + allFoods[i].getItemName();
      } else {
        availableFoods += allFoods[i].getItemName();
      }
    }
    setTextStyle(Font.SANS, FontStyle.BOLD);
    setTextHeight(15);
    setTextColor("Black");
    drawText("Available Foods: ", 80, 100);
    drawText(availableFoods, 80, 120);
    playSound("chime.wav");
    
    
  }
  
}