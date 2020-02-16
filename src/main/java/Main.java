public class Main {

    public static void main(String[] args) {

        Receiver receiver = new Receiver();
        receiver.receiveText(MyConstants.TEXT);

        System.out.println("My key is: " + Keys.KEY);
    }
}
