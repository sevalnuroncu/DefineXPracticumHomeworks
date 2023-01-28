import java.util.ArrayList;
import java.util.List;


public class ListingOperations {


    Building house1=new House("House",2000000,200, 3,1);
    Building house2=new House("House",1500000,100,2,1);
    Building house3=new House("House",1000000,80,1,1);

    Building villa1=new Villa("Villa",8000000,450,5,1);
    Building villa2=new Villa("Villa",5000000,300, 4, 1);
    Building villa3=new Villa("Villa",10000000,600,6,1);

    Building summerHouse1=new SummerHouse("Summer House",10000000,200,3,1);
    Building summerHouse2=new SummerHouse("Summer House",12000000,250,4,1);
    Building summerHouse3=new SummerHouse("Summer House",5000000,150,2,1);

    public List<Building> getHouseList(){
        List<Building> houseList=new ArrayList<>();
        houseList.add(house1);
        houseList.add(house2);
        houseList.add(house3);
        return houseList;
    }

    public List<Building> getVillaList(){
        List<Building> villaList=new ArrayList<>();
        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);
        return villaList;
    }

    public List<Building> getSummerHouseList(){
        List<Building> summerHouseList=new ArrayList<>();
        summerHouseList.add(summerHouse1);
        summerHouseList.add(summerHouse2);
        summerHouseList.add(summerHouse3);
        return summerHouseList;
    }

    public List<Building> getAllBuilding(){
        List<Building> allBuilding=new ArrayList<>();
        allBuilding.addAll(getHouseList());
        allBuilding.addAll(getVillaList());
        allBuilding.addAll(getSummerHouseList());
        return allBuilding;
    }



}
