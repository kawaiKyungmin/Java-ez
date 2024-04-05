package thisTrain;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();

        Car car2 = new Car("차1");
        System.out.println(car2.model + car2.color + car2.maxSpeed);
        Car car3 = new Car("차2", "검은색");
        System.out.println(car3.model + car3.color + car3.maxSpeed);
        Car car4 = new Car("차3", "검은색", 300);
        System.out.println(car3.model + car3.color + car3.maxSpeed);
    }
}
