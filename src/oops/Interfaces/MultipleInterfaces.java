package oops.Interfaces;

interface Chargeable{
    void charge();
}
interface Playable{
    void playMusic();
}
class Smartphone implements Chargeable,Playable{
    public void charge (){
        System.out.println("Smartphone is charging");
    }
    public void playMusic(){
        System.out.println("Playing music on smartphone");
    }
}
public class MultipleInterfaces{
   public static void main(String args[]) {
        Chargeable c = new Smartphone();
        Playable p = new Smartphone();
        Smartphone s = new Smartphone();
        c.charge();
        p.playMusic();
        s.charge();
        s.playMusic();
    }
}
