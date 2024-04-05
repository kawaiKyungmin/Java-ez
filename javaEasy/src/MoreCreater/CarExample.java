package MoreCreater;

public class CarExample {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.company);
        System.out.println();

        Car car2 = new Car("그랜저");
        System.out.println(car2.company);
        System.out.println(car2.model);
        System.out.println();

        Car car3 = new Car("아반떼", "회색");
        System.out.println(car3.company);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println();

        Car car4 = new Car("소나타", "흰색",200);
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);
        System.out.println();
    }
}