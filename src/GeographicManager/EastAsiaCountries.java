package GeographicManager;

public class EastAsiaCountries extends Country {

    private String countryTerrain;

    public EastAsiaCountries(String countryCode, String countryName, double totalArea, String countryTerrain) {
        super(countryCode, countryName, totalArea);
        this.countryTerrain = countryTerrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }

    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public void display() {
        super.display();
        System.out.printf(" %-15s%n", countryTerrain);
    }
}
