import java.util.ArrayList;
import java.util.List;

public class Service {
    ListingOperations listing=new ListingOperations();

    public int totalPriceHouse(){
        int totalPriceHouse=0;
        for(Building house:listing.getHouseList()){
            totalPriceHouse+=house.getPrice();
        }
        return totalPriceHouse;
    }

    public int totalPriceVilla(){
        int totalPriceVilla=0;
        for(Building villa:listing.getVillaList()){
            totalPriceVilla+=villa.getPrice();
        }
        return totalPriceVilla;
    }

    public int totalPriceSummerHouse(){
        int totalPriceSummerHouse=0;
        for(Building summerHouse:listing.getSummerHouseList()){
            totalPriceSummerHouse+=summerHouse.getPrice();
        }
        return totalPriceSummerHouse;
    }

    public int totalPriceBuilding(){
        int totalPriceBuilding=0;
        totalPriceBuilding+=totalPriceHouse()+totalPriceVilla()+totalPriceSummerHouse();
        return totalPriceBuilding;
    }

    public double averageOfHouseArea(){
        double totalArea=0;
        for(Building house:listing.getHouseList()){
            totalArea+=house.getSquareMeters();
        }
        return totalArea/listing.getHouseList().size();
    }

    public double averageOfVillaArea(){
        double totalArea=0;
        for(Building villa:listing.getVillaList()){
            totalArea+=villa.getSquareMeters();
        }
        return totalArea/listing.getVillaList().size();
    }

    public double averageOfSummerHouseArea(){
        double totalArea=0;
        for(Building summerHouse:listing.getSummerHouseList()){
            totalArea+=summerHouse.getSquareMeters();
        }
        return totalArea/listing.getSummerHouseList().size();
    }

    public double averageOfAllBuilding(){
        double total=0;
        for(Building house:listing.getHouseList()){
            total+=house.getSquareMeters();
        }
        for(Building villa:listing.getVillaList()){
            total+=villa.getSquareMeters();
        }
        for(Building summerHouse:listing.getSummerHouseList()){
            total+=summerHouse.getSquareMeters();
        }

        return total/(listing.getHouseList().size()+listing.getVillaList().size()+listing.getSummerHouseList().size());
    }
    public List<Building> filteredCountOfRoomsAndLivingRooms(int numberOfRooms, int numberOfLivingRooms){
        List<Building> filteredBuilding=new ArrayList<>();
        for(int i=0; i<listing.getAllBuilding().size(); i++){
            if(listing.getAllBuilding().get(i).getNumberOfRooms()==numberOfRooms && listing.getAllBuilding().get(i).getNumberOfLivingRooms()==numberOfLivingRooms ){
                filteredBuilding.add(listing.getAllBuilding().get(i));

            }
        }
        return filteredBuilding;


    }




}
