package com.gloot.springbootcodetest.leaderboard.repository;

import com.gloot.springbootcodetest.leaderboard.entity.LeaderboardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeaderboardRepository extends JpaRepository<LeaderboardEntity, Integer> {
}
