public class ZoneDTO {

    private String zoneName;
    private int currentOccupancy;

    public ZoneDTO() {}

    public ZoneDTO(String zoneName, int currentOccupancy) {
        this.zoneName = zoneName;
        this.currentOccupancy = currentOccupancy;
    }

    public String getZoneName() {
        return zoneName;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }

    public int getCurrentOccupancy() {
        return currentOccupancy;
    }

    public void setCurrentOccupancy(int currentOccupancy) {
        this.currentOccupancy = currentOccupancy;
    }
}
