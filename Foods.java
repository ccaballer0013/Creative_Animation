import org.code.theater.*;
import org.code.media.*;

public class Foods {

  private String itemName;
  private String image;
  private String[] ingredients;
  private String type;

  public Foods(String itemName, String image, String[] ingredients, String type) {
    this.itemName = itemName;
    this.image = image;
    this.ingredients = ingredients;
    this.type = type;
  }

  public String getItemName() {
    return itemName;
  }

  public String getImage() {
    return image;
  }

  public String[] getIngredients() {
    return ingredients;
  }

  public String getType() {
    return type;
  }
  
}