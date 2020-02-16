public class Receiver implements Text {
    @Override
    public void receiveText(String text) {
        System.out.println("Receiver received: " + text);
    }
}
