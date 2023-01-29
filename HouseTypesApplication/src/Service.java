import java.util.ArrayList;
import java.util.List;

public class Service {
    ListingOperations listing=new ListingOperations();


    public int totalPriceHouse(){
        //return the total prices of houses
        return totalPrice(listing.getHouseList());
    }

    public int totalPriceVilla(){
        //return the total prices of villas
        return totalPrice(listing.getVillaList());
    }

    public int totalPriceSummerHouse(){
        //return the total prices of summer houses
        return totalPrice(listing.getSummerHouseList());
    }

    public int totalPriceBuilding(){
        //return the total prices of all types of houses
        return totalPrice(listing.getAllBuilding());
    }

    public double averageOfHouseArea(){
        //return the average square meters of houses
        return averageOfBuilding(listing.getHouseList());
    }

    public double averageOfVillaArea(){
        //return the average square meters of villas
        return averageOfBuilding(listing.getVillaList());
    }

    public double averageOfSummerHouseArea(){
        //return the average square meters of summer houses
        return averageOfBuilding(listing.getSummerHouseList());
    }

    public double averageOfAllBuilding(){
        //return the average square meters of all types of houses
        return averageOfBuilding(listing.getAllBuilding());
    }
    public double averageOfBuilding(List<Building> buildings){
        //calculate total area according to entered parameter
        double totalArea=0;
        for(Building building:buildings){
            totalArea+=building.getSquareMeters();
        }
        return totalArea/buildings.size();
    }

    public int totalPrice(List<Building> buildings){
        //calculate total price according to entered parameter
        int totalPrice=0;
        for(Building building: buildings){
            totalPrice+=building.getPrice();
        }
        return totalPrice;
    }

    public List<Building> filteredCountOfRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms){
        //filters and returns houses of all types according to the number of rooms and living rooms.
        List<Building> filteredBuilding=new ArrayList<>();
        for(int i=0; i<listing.getAllBuilding().size(); i++){
            if(listing.getAllBuilding().get(i).getNumberOfRooms()==numberOfRooms && listing.getAllBuilding().get(i).getNumberOfLivingRooms()==numberOfLivingRooms ){
                filteredBuilding.add(listing.getAllBuilding().get(i));

            }
        }
        return filteredBuilding;


    }




}
