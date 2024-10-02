package fire.pit.system.fire.bulletin.board.cctv_tracking_logs;

import fire.pit.system.fire.bulletin.board.users.Users;
import fire.pit.system.fire.bulletin.board.zones.Zones;
import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Cctv_tracking_logs {
    @Id
    private Integer tracking_log_id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", foreignKey = @ForeignKey(name = "FK_USER_ID"))
    private Users user; // Users 클래스의 user_id를 참조하는 외래키

    @ManyToOne
    @JoinColumn(name = "zone_id", referencedColumnName = "zone_id", foreignKey = @ForeignKey(name = "FK_ZONE_ID"))
    private Zones zone; // Zones 클래스의 zone_id를 참조하는 외래키

    private LocalDateTime timestamp;

    @Lob
    @Column(name = "movement_path", columnDefinition = "text")
    private String movement_path;
}
