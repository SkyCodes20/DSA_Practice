package oops.method_overriding;

class TV {

    void changeChannel (){
        System.out.println("TV channel is changed");
    }
    void switchON (){
        System.out.println("TV is switched ON");
    }
}

class smartTV extends TV{

    @Override
    void changeChannel (){
        System.out.println("SmartTV channel is changed");
    }
    @Override
    void switchON (){
        System.out.println("smartTV is switched ON");
    }
    void switchOFF (){
        System.out.println("smartTV is Switched OFF");
    }
}

class oldTV extends smartTV{

    @Override
    void changeChannel (){
        System.out.println("oldTV channel is changed");
    }
    void switchON (){
        System.out.println("oldTV is switched ON");
    }
}

public class overriding {
    public static void main(String[] args) {

        TV t = new TV ();
        t.changeChannel();
        t.switchON();

        smartTV T = new smartTV();
        T.switchOFF();

        TV  tv = new smartTV();  // Dynamic method dispatch
        tv.switchON();
        tv.changeChannel();

        oldTV o = new oldTV();
        o.changeChannel();
        o.switchON();

        smartTV s = new oldTV(); // Dynamic method dispatch
        s.switchON();
        s.switchOFF();
        s.changeChannel();

        TV tt = new oldTV(); // Dynamic method dispatch

        tt.switchON();
        tt.changeChannel();


    }
}

