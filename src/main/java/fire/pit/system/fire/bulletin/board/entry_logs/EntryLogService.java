package fire.pit.system.fire.bulletin.board.entry_logs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryLogService {
    @Autowired
    private EntryLogRepository entryLogRepository;

    public List<Entry_Logs> getAllEntryLogs() {
        return entryLogRepository.findAll();
    }
}
