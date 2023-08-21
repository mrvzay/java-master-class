public class Main {

    public static void main(String[] args) {

        SmartKitchen kitchen = new SmartKitchen();

//        kitchen.getDishWasher().setHasWorkTodo(true);
//        kitchen.getIceBox().setHasWorkTodo(true);
//        kitchen.getBrewMaster().setHasWorkTodo(true);
//
//        kitchen.getDishWasher().doDishes();
//        kitchen.getIceBox().orderFood();
//        kitchen.getBrewMaster().brewCoffee();

        kitchen.setKitchenState(true, false, true);
        kitchen.doKitchenWork();

    }
}
