public class JavaEnums {
    enum Direction{North,East,West,South}
    enum Car{
        audi(100),maruti(200);
        int price;
        Car(int price){
            this.price = price;
        }
    }
    public static void main(String args[]){
        System.out.println(Direction.valueOf("West").ordinal());
        System.out.println(Car.valueOf("audi"));
        for(Car car : Car.values()){
            System.out.println(car+" "+ car.price);
        }


    }

}
