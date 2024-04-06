package getterAndSetter;

public class GetterSetter {
    private String name;
    private int speed;

    public void setName(String name){
        if(this.name != name){
            this.name = name;
        }
    }

    public void setSpeed(int speed){
        if(speed>0){
            this.speed = speed;
        }else{
            this.speed = 0;
        }
    }

    public String getName(){
        return name;
    }

    public int getSpeed(){
        return speed;
    }
}
