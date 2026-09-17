// Abstract class
abstract class Device {
    // Variable
    String brand = "Samsung";

    // Abstract method
    abstract void turnOn();

    // Concrete method
    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Interface 1
interface Camera {
    int MAX_ZOOM = 10; // public static final

    void takePhoto(); // abstract and public method

    private void cameraInfo() { // concrete method
        System.out.println("Camera is ready");
    }
}

// Interface 2
interface MusicPlayer {

    String TYPE = "Digital"; // public static final

    void playMusic(); // abstract and public method

    default void musicInfo() { // concrete method
        System.out.println("Music player is ready");
    }

}

// Child class
class Smartphone extends Device implements Camera, MusicPlayer {
    // multiple inheritance
    // Implementing abstract method of Device
    private void cameraInfo() {
        System.out.println("overridden camera info");
    }

    void turnOn() {
        System.out.println("Smartphone is turned ON");
    }

    // Implementing abstract method of Camera
    public void takePhoto() {
        System.out.println("Taking photo...");
    }

    // Implementing abstract method of MusicPlayer
    public void playMusic() {
        System.out.println("Playing music...");
    }
}

// Main class
public class Abstract_Interface {
    public static void main(String[] args) {
        // MusicPlayer.TYPE ="abc";
        Smartphone s = new Smartphone();
        s.turnOn();
        s.showBrand();
        s.takePhoto();
        s.playMusic();
        s.cameraInfo();
        s.musicInfo();
        System.out.println("Maximum Zoom: " + Camera.MAX_ZOOM);
        System.out.println("Music Type: " + MusicPlayer.TYPE);
    }
}