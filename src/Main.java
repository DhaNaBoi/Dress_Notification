public class Main {
    public static void main(String[] args) {
        Dress redDress = new Dress();

        Customer c1 = new Customer("Lizza");
        redDress.register(c1);
        c1.registeredDress(redDress);

        redDress.restock("Red Dress");
    }
}

