package com.coderbd.twodb.mysql.repo;

import com.coderbd.twodb.mysql.domain.Best;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BestRepo extends JpaRepository<Best, Long> {
}
