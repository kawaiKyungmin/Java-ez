package getterAndSetter;

public class GetterSetterExample {
    public static void main(String args[]){
        GetterSetter gs = new GetterSetter();


        gs.setName("hi");
        System.out.println(gs.getName());
        gs.setSpeed(100);
        System.out.println(gs.getSpeed());
        gs.setSpeed(-100);
        System.out.println(gs.getSpeed());
    }
}
