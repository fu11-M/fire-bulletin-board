package fire.pit.system.fire.bulletin.board.cctv_tracking_logs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cctv_tracking_logsService {
    @Autowired
    private Cctv_tracking_logsRepository cctv_tracking_logsRepository;

    public List<Cctv_tracking_logs> getAllTrackingLogs() {
        return cctv_tracking_logsRepository.findAll();
    }
}
