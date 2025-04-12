import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    Foods fruitSmoothie = new Foods("Fruit Smoothie", "fruitSmoothie.png", null, "drink");
    Foods fruitTart = new Foods("Fruit Tart", "fruitTart.png", null, "dessert");

    String[] fruitSaladIngredients = {"pineapplePiece.png", "strawberry.png", "blueberry.png"};
    Foods fruitSalad = new Foods("Fruit Salad", "salad.png", fruitSaladIngredients, "dessert");

    Foods[] allFoods = {fruitSmoothie, fruitTart, fruitSalad};
    TableSet placemat = new TableSet("placemat.png", "placemat");
    TableSet fork = new TableSet("fork.png", "fork");
    TableSet napkin = new TableSet("napkin.png", "napkin");
    TableSet knife = new TableSet("knife.png", "knife");
    TableSet saladWithSpoon = new TableSet("saladWithSpoon.png", "salad");
    TableSet[] tableThings = {placemat, fork, napkin, knife, saladWithSpoon};

    Restaurant place = new Restaurant(allFoods);
    Kitchen theKitchen = new Kitchen(allFoods, "squareBowl.png");
    DiningRoom eat = new DiningRoom(tableThings, allFoods);

    place.createScene();
    place.pause(3);

    eat.playSound("bloop_x.wav");
    eat.drawBackground();
    eat.pause(1);
    eat.callNames("Order: Fruit Salad");
    eat.pause(1);
    eat.createScene();
    eat.pause(1);
    eat.callNames();
    
    theKitchen.createScene();
    theKitchen.pause(1);

    Theater.playScenes(theKitchen, place, eat);
    
    

    
    
    
  }
}
