package fire.pit.system.fire.bulletin.board;

import fire.pit.system.fire.bulletin.board.cctv_tracking_logs.Cctv_tracking_logsService;
import fire.pit.system.fire.bulletin.board.entry_logs.EntryLogService;
import fire.pit.system.fire.bulletin.board.IR_Sensor_Logs.Ir_Sensor_LogService;
import fire.pit.system.fire.bulletin.board.users.UserService;
import fire.pit.system.fire.bulletin.board.users.Users;
import fire.pit.system.fire.bulletin.board.zones.ZoneService;
import fire.pit.system.fire.bulletin.board.cctv_tracking_logs.Cctv_tracking_logs;
import fire.pit.system.fire.bulletin.board.entry_logs.Entry_Logs;
import fire.pit.system.fire.bulletin.board.IR_Sensor_Logs.Ir_Sensor_Logs;
import fire.pit.system.fire.bulletin.board.zones.Zones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DashboardController {

    @Autowired
    private Cctv_tracking_logsService cctvTrackingLogsService;

    @Autowired
    private EntryLogService entryLogService;

    @Autowired
    private Ir_Sensor_LogService irSensorLogService;

    @Autowired
    private ZoneService zoneService;

    @Autowired
    private UserService usersService;

    @GetMapping("dashboard")
    public String getDashboardData(Model model) {
        // 모든 데이터를 서비스에서 가져오기
        List<Cctv_tracking_logs> trackingLogs = cctvTrackingLogsService.getAllTrackingLogs();
        List<Entry_Logs> entryLogs = entryLogService.getAllEntryLogs();
        List<Ir_Sensor_Logs> sensorLogs = irSensorLogService.getAllIRSensorLogs();
        List<Zones> zones = zoneService.getZones();
        List<Users> users = usersService.getAllUsers();

        // 데이터를 모델에 추가
        model.addAttribute("trackingLogs", trackingLogs);
        model.addAttribute("entryLogs", entryLogs);
        model.addAttribute("sensorLogs", sensorLogs);
        model.addAttribute("zones", zones);
        model.addAttribute("users", users);

        return "dashboard"; // Thymeleaf 템플릿으로 이동
    }

    @GetMapping("/Information")
    public String getOverView(Model model) {
        // 모든 데이터를 서비스에서 가져오기
        List<Cctv_tracking_logs> trackingLogs = cctvTrackingLogsService.getAllTrackingLogs();
        List<Entry_Logs> entryLogs = entryLogService.getAllEntryLogs();
        List<Ir_Sensor_Logs> sensorLogs = irSensorLogService.getAllIRSensorLogs();
        List<Zones> zones = zoneService.getZones();
        List<Users> users = usersService.getAllUsers();

        // 데이터를 모델에 추가
        model.addAttribute("trackingLogs", trackingLogs);
        model.addAttribute("entryLogs", entryLogs);
        model.addAttribute("sensorLogs", sensorLogs);
        model.addAttribute("zones", zones);
        model.addAttribute("users", users);

        return "Monitoring_Information"; // Thymeleaf 템플릿으로 이동
    }
}
