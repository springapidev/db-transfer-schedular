package com.coderbd.twodb.mssql.repo;


import com.coderbd.twodb.mssql.domain.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepo extends JpaRepository<Test, Long> {
}
