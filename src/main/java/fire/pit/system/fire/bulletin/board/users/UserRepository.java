package fire.pit.system.fire.bulletin.board.users;

import fire.pit.system.fire.bulletin.board.zones.Zones;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Integer> {
}
