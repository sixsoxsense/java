package forth_week;

public class forth_week {
    public static void main(String[] args) {

    }
}

class SamsungPhone implements PhoneInterface {
    @Override
    public void sendCall() {

    }

    @Override
    public void receiveCall() {

    }

    public void flash() {

    }
}

class MyPhone implements PhoneInterface, AIInterface {

    @Override
    public void sendCall() {

    }

    @Override
    public void receiveCall() {

    }

    @Override
    public void recognizeSpeech() {

    }

    @Override
    public void synthesizeSpeech() {

    }

    public void turnOn() {

    }
}

interface PhoneInterface {
    void sendCall();

    void receiveCall();

    default void printLogo() {

    };
}

interface AIInterface {
    void recognizeSpeech();

    void synthesizeSpeech();
}