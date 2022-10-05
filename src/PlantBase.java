abstract public class PlantBase implements Plant {
  private final double baseFoodIntake;
  private final String name;
  private final double height;
  private final FoodType typeOfFood;

  public PlantBase(String name, double height, FoodType typeOfFood, double baseFoodIntake) {
    this.name = name;
    this.height = height;
    this.typeOfFood = typeOfFood;
    this.baseFoodIntake = baseFoodIntake;
  }

  // Här nyttjas inkapsling eftersom fältet är private
  public String getName() {
    return name;
  }

  // Här nyttjas inkapsling eftersom fältet är private
  public double getHeight() {
    return height;
  }

  // Här nyttjas inkapsling eftersom fältet är private samtidigt som enum översätts till ett läsbart värde
  public String getTypeOfFood() {
    switch (typeOfFood) {
      case MINERAL_WATER:
        return "mineralvatten";
      case PROTEIN_DRINK:
        return "proteindryck";
      default:
        return "vatten";
    }
  }

  // Här nyttjas inkapsling eftersom fältet är private
  public double getBaseFoodIntake() {
    return baseFoodIntake;
  }

  public String getFeedingInstructions() {
    return getName() + " behöver " + calculateFoodIntake() + "l av typen " + getTypeOfFood();
  }

  abstract public double calculateFoodIntake();
}


