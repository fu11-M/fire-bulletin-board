package fire.pit.system.fire.bulletin.board.entry_logs;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EntryLogRepository extends JpaRepository<Entry_Logs, Integer> {
    
}
