package extendsPractice;

public class CellPhone {
    //Field
    String model;
    String color;

    //creater

    //method
    void powerOn() { System.out.println("turn on power");}
    void powerOff() { System.out.println("turn of power");}
    void bell() { System.out.println("bell is ringing");}
    void sendVoice(String message) { System.out.println("자기:" + message);}
    void receiveVoice(String message) {System.out.println("상대방:" + message);}
    void hangup() { System.out.println("전화를 끊습니다.");}
}
