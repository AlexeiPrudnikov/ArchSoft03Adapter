public class Adapter extends Target{
    Adaptee adaptee;
    @Override
    public void request() {

    }
    public Adapter (Adaptee adaptee) {
        this.adaptee = adaptee;
    }
}
