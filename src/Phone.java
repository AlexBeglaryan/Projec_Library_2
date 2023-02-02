public class Phone {
    private  String brand;
    private  String model;
    private  double price;
    private  String color;
    private  String date;

        public Phone(String brand,String model,double price,String color,String date) {
            this.brand = model;
            this.model = model;
            this.price = price;
            this.color = color;
            this.date = date;

       }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
