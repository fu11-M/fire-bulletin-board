package fire.pit.system.fire.bulletin.board.zones;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Zones {
    @Id
    private Integer zone_id; // 구역 고유 ID
    private String zone_name; // 구역 이름
    private Integer current_occupancy; // 현재 구역 내 인원 수

    public Object getZonesId() {
        return this.zone_id;
    }

    public String getZoneName() {
        return this.zone_name;
    }


    public int getCurrentOccupancy() {
        return this.current_occupancy;
    }
}
