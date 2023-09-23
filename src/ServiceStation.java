public class ServiceStation {
    public void check(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName() + ":");

        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();
        }

        if (vehicle instanceof Car) {
            ((Car) vehicle).checkEngine();
        }

        if (vehicle instanceof Truck) {
            ((Truck) vehicle).checkTrailer();
        }

        System.out.println();
    }
}