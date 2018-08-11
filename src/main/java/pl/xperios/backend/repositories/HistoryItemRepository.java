package pl.xperios.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pl.xperios.backend.data.entity.HistoryItem;

public interface HistoryItemRepository extends JpaRepository<HistoryItem, Long> {
}
