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

//-----------------------------------------------------------------------
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class ZoneService {
//
//    @Autowired
//    private ZoneRepository zoneRepository;
//
//    public List<ZoneDTO> getZones() {
//        List<Zones> zones = zoneRepository.findAll();
//        List<ZoneDTO> zoneDTOs = new ArrayList<>();
//
//        for (Zones zone : zones) {
//            ZoneDTO zoneDTO = new ZoneDTO();
//            zoneDTO.setZoneName(zone.getZoneName());
//            zoneDTO.setCurrentOccupancy(zone.getCurrentOccupancy());
//            zoneDTOs.add(zoneDTO);
//        }
//        return zoneDTOs;
//    }
//}
//-----------------------------------------------------------------------
