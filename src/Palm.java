public class Palm extends PlantBase {
  public Palm(String name, double height) {
    super(name, height, FoodType.WATER, 0.5);
  }

  // Här nyttjas polymorfism
  @Override
  public double calculateFoodIntake() {
    return getHeight() * getBaseFoodIntake();
  }
}


