package fire.pit.system.fire.bulletin.board.zones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ZoneController {

    @Autowired
    private ZoneService zoneService;

    @GetMapping("/zones")
    public List<Zones> getZones() {
        return zoneService.getZones(); // Zone 데이터만 반환
    }
}
