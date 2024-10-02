package fire.pit.system.fire.bulletin.board.entry_logs;

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
public class Entry_Logs {
    @Id
    private Integer log_id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", foreignKey = @ForeignKey(name = "FK_USER_ID"))
    private Users user; // Users 엔티티를 참조하는 외래키 설정

    private LocalDateTime entry_time;
    private LocalDateTime exit_time;

    @ManyToOne
    @JoinColumn(name = "zone_id", referencedColumnName = "zone_id", foreignKey = @ForeignKey(name = "FK_ZONE_ID"))
    private Zones zone; // Zones 엔티티를 참조하는 외래키 설정
}
