public class Cactus extends PlantBase {
  public Cactus(String name, double height) {
    super(name, height, FoodType.MINERAL_WATER,0.2);
  }

  //Här nyttjas polymorfism
  @Override
  public double calculateFoodIntake() {
    return getBaseFoodIntake();
  }
}
