package fire.pit.system.fire.bulletin.board.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@ToString
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동 생성 전략 사용
    private Integer user_id;
    private String name;
    private String role; // 역할(ex_ 학생, 교사 등)
    private LocalDateTime createdAt; // 사용자 등록일
    private LocalDateTime deletedAt; // 사용자 삭제일
    private String phone; // 전화번호
    private String department; // 부서

}
