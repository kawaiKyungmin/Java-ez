package MoreCreater;

public class Car {
    //필드
    String company = "현대 자동차";
    String model;
    String color;
    int maxSpeed;


    //생성자
    public Car(){

    }public Car(String model){
        this.model = model;//매개 변수와 필드의 이름이 같다면 this.을 삽입한다.
    }public Car(String model, String color){
        this.model = model;
        this.color = color;
    }public Car(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
