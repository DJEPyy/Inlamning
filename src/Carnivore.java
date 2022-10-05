public class Carnivore extends PlantBase {
  private static final double extraFoodIntake = 0.2;

  public Carnivore(String name, double height) {
    super(name, height, FoodType.PROTEIN_DRINK,0.1);
  }

  //Här nyttjas polymorfism
  @Override
  public double calculateFoodIntake() {
    return getBaseFoodIntake() + (extraFoodIntake * getHeight());
  }
}

