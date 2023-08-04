public class Customer {
    private String name;
    Dress dress = new Dress();

    public Customer(String name) {
        super();
        this.name =name;
    }

    public void update(){
        System.out.println("Hey "+ name +", Red Dress is now available in the FashionWorld store!");
    }

    public void registeredDress(Dress dr){
        dress = dr;
    }
}
