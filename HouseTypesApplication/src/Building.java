public class Building {
    private String type;
    private int price;
    private int squareMeters;
    private int numberOfRooms;
    private int numberOfLivingRooms;



    public Building(String type, int price, int squareMeters, int numberOfRooms, int numberOfLivingRooms ) {
        this.type=type;
        this.price=price;
        this.squareMeters=squareMeters;
        this.numberOfRooms=numberOfRooms;
        this.numberOfLivingRooms=numberOfLivingRooms;
    }

    @Override
    public String toString() {
        String output = "{Type: " + type + ", Price: " + price +
                ", SquareMeters: " + squareMeters + ", Number of Rooms: "+numberOfRooms +", Number of LivingRooms: "+numberOfLivingRooms+"}";

        return output;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSquareMeters() {
        return squareMeters;
    }

    public void setSquareMeters(int squareMeters) {
        this.squareMeters = squareMeters;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public int getNumberOfLivingRooms() {
        return numberOfLivingRooms;
    }

    public void setNumberOfLivingRooms(int numberOfLivingRooms) {
        this.numberOfLivingRooms = numberOfLivingRooms;
    }
}
