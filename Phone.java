public abstract class Phone {

    public float screenSize;
    public int simCards;
    public int colours;
    private String imeiNumber;

    public void makeCall() {
        System.out.println("making call on phone");
    }

    public void playRadio() {
        System.out.println("paying radio over old phone");
    }

    public abstract void connectToInternet(); // no implementation
}

// Inheritance
// Polymophism
// Abstraction
// Encapsulation

class Smartphone extends Phone {
    public void makeCall() {
        System.out.println("making call on smart phone");
    }

    public void playVideos() {
        System.out.println("play videos");
    }

    @Override
    public void connectToInternet() {
        turnOnWifiAndConnect();
        System.out.println("ANDROID is connected to internet");
    }

    private void turnOnWifiAndConnect() {
        System.err.println("establishing connection");
    }

}

class Iphone extends Phone {
    public void makeCall() {
        System.out.println("making call on Iphone");
    }

    public void playGames() {
        System.out.println("play games");
    }

    @Override
    public void connectToInternet() {
        turnOnWifiAndConnect();
        System.out.println("IPHONE is connected to internet");
    }

    private void turnOnWifiAndConnect() {
        System.err.println("establishing connection");
    }

}
