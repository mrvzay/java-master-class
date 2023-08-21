public class SmartKitchen {

    private CoffeeMaker brewMaster;
    private Refrigerator iceBox;
    private DishWasher dishWasher;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {

        brewMaster.setHasWorkTodo(coffeeFlag);
        iceBox.setHasWorkTodo(fridgeFlag);
        dishWasher.setHasWorkTodo(dishWasherFlag);
    }

    public void doKitchenWork() {

        brewMaster.brewCoffee();
        iceBox.orderFood();
        dishWasher.doDishes();
    }

}

class CoffeeMaker {

    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void brewCoffee() {

        if (hasWorkTodo) {
            System.out.println("Brewing Coffee");
            hasWorkTodo = false;
        }
    }
}

class Refrigerator {

    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void orderFood() {

        if (hasWorkTodo) {
            System.out.println("Ordering Food");
            hasWorkTodo = false;
        }
    }
}

class DishWasher {

    private boolean hasWorkTodo;

    public void setHasWorkTodo(boolean hasWorkTodo) {
        this.hasWorkTodo = hasWorkTodo;
    }

    public void doDishes() {

        if (hasWorkTodo) {
            System.out.println("Washing Dishes");
            hasWorkTodo = false;
        }
    }
}


