public class Main {
    public static void main(String[] args) {
        ListingOperations listingOperations=new ListingOperations();
        Service service=new Service();
        System.out.println("----------------LISTING OPERATIONS-------------------");
        System.out.println("List of House: "+listingOperations.getHouseList().toString());
        System.out.println("List of Villa: "+listingOperations.getVillaList().toString());
        System.out.println("List of Summer House: "+listingOperations.getSummerHouseList().toString());

        System.out.println("\n----------------PRICE OPERATIONS-------------------");
        System.out.println("Total Price of Houses: "+service.totalPriceHouse());
        System.out.println("Total Price of Villas: "+service.totalPriceVilla());
        System.out.println("Total Price of Summer Houses: "+service.totalPriceSummerHouse());
        System.out.println("Total Price of All Building: "+service.totalPriceBuilding());

        System.out.println("\n----------------AVERAGE AREA OPERATIONS-------------------");
        System.out.println("Average area of houses: "+service.averageOfHouseArea());
        System.out.println("Average area of villas: "+service.averageOfVillaArea());
        System.out.println("Average area of summer houses: "+service.averageOfSummerHouseArea());
        System.out.println("Average area of all building: "+service.averageOfAllBuilding());

        System.out.println("All buildings filtered by number of rooms and living rooms: "
                +service.filteredCountOfRoomsAndLivingRooms(3,1).toString());
    }
}