package by.itacademy.jd2.academyproject.cartask;

public class Door implements Parts {
    private final String quantity;

    public Door(String quantity) {
        this.quantity = quantity;
    }

    public String getQuantity() {
        return quantity;
    }


    @Override
    public String toString() {
        return "Door{" +
                "quantity='" + quantity + '\'' +
                '}';
    }
}