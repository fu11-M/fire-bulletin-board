package fire.pit.system.fire.bulletin.board.IR_Sensor_Logs;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Ir_Sensor_Logs {
    @Id
    private Integer sensor_log_id; // 센서 로그 고유 ID
    private Integer count_in; // 구역으로 들어온 인원 수
    private Integer count_out; // 구역에서 나간 인원 수
    private Integer current_count; // 현재 건물 내 인원 수
    private LocalDateTime timestamp; // 로그 기록 시간
}
