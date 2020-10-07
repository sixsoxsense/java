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

interface PhoneInterface {
    public abstract void sendCall();

    public abstract void receiveCall();
}