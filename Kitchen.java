import org.code.theater.*;
import org.code.media.*;

public class Kitchen extends Restaurant {

  private String kitchenImage;

  public Kitchen(Foods[] allFoods, String kitchenImage) {
    super(allFoods);
    this.kitchenImage = kitchenImage;
  }

  /** 
   * This method calls other methods to 
   * create the Kitchen scene
   * 
   * Precondition: required lists/arrays must have values
   * Postcondition: images, sounds, and words will be used
   */
  public void createScene() {
    drawBackground();
    drawSpoon();
    pause(1);
    makeFruitSalad();
    drawText();
    pause(1);
  }

  /** 
   * Background image will be drawn and sound will be played
   * 
   * Precondition: file names must be properly used
   * Postcondition: image and sound will be used
   */
  public void drawBackground() {
    drawImage(kitchenImage, 0, 0, getWidth());;
    pause(1);
  }

  /** 
   * text will be drawn and sound will be played
   * 
   * Precondition: file names must be properly used
   * Postcondition: image and sound will be used
   */
  public void drawText() {
    setTextStyle(Font.SANS, FontStyle.BOLD);
    setTextHeight(40);
    setTextColor("Black");
    drawText("Fruit Salad", 35, 50);
    playSound("chime.wav");
  }

  /** 
   * multiple fruit pieces will be drawn over a set grid
   * with random rotation values
   * 
   * Precondition: fruitSaladIngredients must have values
   * Postcondition: image and sound will be used
   */
  public void makeFruitSalad() {
    String[] fruitSaladIngredients = getFruitSaladIngredients();

    int x=120;
    int y=100;

    // while loops allow fruit images to be drawn on select areas
      while (x<=300) {
 
        for (int index = 0; index < fruitSaladIngredients.length; index++) {
          double random = Math.random()*100;
          drawImage(fruitSaladIngredients[index], x, y, 50, random);
          playSound("typewriter_click.wav");
          pause(0.1);
          x=x+15;
        }
        x=x+10;
        while (x>250 && y<220) {
          x=120;
          y=y+25;
          for (int index = 0; index < fruitSaladIngredients.length; index++) {
            double random2 = Math.random()*100;
            drawImage(fruitSaladIngredients[index], x, y, 50, random2);
            playSound("typewriter_click.wav");
            pause(0.1);
            x=x+15;
          }
          x=x+10;
        }
      } 
    }

  /** 
   * spoon image will be drawn and sound will be played
   * 
   * Precondition: file names must be properly used
   * Postcondition: image and sound will be used
   */
  public void drawSpoon() {
    pause(0.5);
    drawImage("spoon.png", 410, 140, 40, 50);
    playSound("typewriter_click.wav");
  }
  
  /** 
   * returns food order if it does not equal null
   * 
   * Precondition: fruitSaladOrder must exist
   * Postcondition: ingredients of salad will be returned
   */  
  private String[] getFruitSaladIngredients() {
    Foods fruitSaladOrder = getFruitSalad();

    if (fruitSaladOrder != null) {
      return fruitSaladOrder.getIngredients();
    }

    return null;
  }

  /** 
   * iterates through allFoods until its item name equals 
   * "Fruit Salad"
   * 
   * Precondition: allFoods must exist
   * Postcondition: Food object will be returned 
   */ 
  private Foods getFruitSalad() {
    for (int i=0; i<allFoods.length; i++) {
      Foods currentItem = allFoods[i];
      if (currentItem.getItemName().equals("Fruit Salad")) {
        return allFoods[i];
      }
    }

    return null;
  }
  
}