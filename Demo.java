public class Demo {

    // Inheritance
    // Polymophism
    // Abstraction
    // Encapsulation
    public static void main(String[] args) {
        // Phone p = new Phone();
        // p.makeCall();
        
        Phone futurePhone = new Smartphone(); // upcasting
        futurePhone.makeCall(); // runtime or dynamic polymorphism or late binding

        futurePhone.connectToInternet();
      
        futurePhone = new Iphone();
        futurePhone.makeCall();
        futurePhone.connectToInternet(); // encapsulation 
        

        Smartphone s = new Smartphone();
        s.playRadio();  // inheritance


        Iphone iphone = new Iphone();
        iphone.playRadio();

    }
}
