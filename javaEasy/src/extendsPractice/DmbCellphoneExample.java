package extendsPractice;

public class DmbCellphoneExample {
    public static void main(String args[]){
        //DmbCellPhone 객체 생성
        DmbCellPhone dmbCellphone = new DmbCellPhone("javaphone","black",10);

        //CellPhone으로 부터 상속받은 필드
        System.out.println("모델:" + dmbCellphone.model);
        System.out.println("색깔:" + dmbCellphone.color);

        //DmbCellPhone의 필드
        System.out.println("채널" + dmbCellphone.channel);

        //CelPhone으로 부터 상속받은 메소드 호출
        dmbCellphone.powerOn();
        dmbCellphone.bell();
        dmbCellphone.sendVoice("안녕하세요 'W'");
        dmbCellphone.receiveVoice("안녕하세용~~~");
        dmbCellphone.sendVoice("어쩌라구용");
        dmbCellphone.hangup();

        //DmbCellPhone의 메소드 호출
        dmbCellphone.turnOnDmb();
        dmbCellphone.changeChannelDmb(12);
        dmbCellphone.turnOffDmb();
    }
}
