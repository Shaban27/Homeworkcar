package transport;

public class Train extends Transport {

    public String travelTime;
    public String departureStationName;
    public String endingStation;
    public String tripPrace;
    public String numberOfWagons;



    public String getTripPrace() {
        return tripPrace;
    }

    public void setTripPrace(String tripPrace) {
        this.tripPrace = tripPrace;
    }

    public String getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(String travelTime) {
        this.travelTime = travelTime;
    }

    public String getDepartureStationName() {
        return departureStationName;
    }

    public void setDepartureStationName(String departureStationName) {
        this.departureStationName = departureStationName;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public void setEndingStation(String endingStation) {
        this.endingStation = endingStation;
    }

    public String getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(String numberOfWagons) {
        this.numberOfWagons = numberOfWagons;
    }

    public Train(String brand,
                String model,
                String yearOfIssue,
                String productionCountry,
                String maximumMovementSpeed,
                String travelTime,
                String departureStationName,
                String endingStation,
                String tripPrace,
                String numberOfWagons) {
        super(brand, model, yearOfIssue, productionCountry, maximumMovementSpeed);
         this.tripPrace = tripPrace;
          this.travelTime = travelTime;
            this.departureStationName = departureStationName;
            this.endingStation = endingStation;
               if (numberOfWagons == null) {
            this.numberOfWagons = travelTime;
        } else {
            this.numberOfWagons = numberOfWagons;

        }
    }}






