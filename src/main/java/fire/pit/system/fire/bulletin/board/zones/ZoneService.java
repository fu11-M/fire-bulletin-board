package fire.pit.system.fire.bulletin.board.zones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneService {

    @Autowired
    private ZoneRepository zoneRepository;

    // 단순히 Zone 데이터를 불러오는 메소드
    public List<Zones> getZones() {
        return zoneRepository.findAll(); // 모든 Zone 데이터를 불러옴
    }
}
