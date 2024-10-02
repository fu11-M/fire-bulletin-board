package fire.pit.system.fire.bulletin.board.IR_Sensor_Logs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Ir_Sensor_LogService {
    @Autowired
    private Ir_Sensor_LogRepository ir_sensor_logRepository;

    public List<Ir_Sensor_Logs> getAllIRSensorLogs() {
        return ir_sensor_logRepository.findAll();
    }
}
