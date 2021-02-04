package com.gloot.springbootcodetest.leaderboard;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import com.gloot.springbootcodetest.SpringBootComponentTest;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootComponentTest
public class LeaderboardRepositoryTest {
  @Autowired LeaderboardRepository repository;

  @Test
  void saveAndRetrieve() {
    LeaderboardEntryEntity entity = new LeaderboardEntryEntity(1, "g-looter", 100);
    repository.saveAll(List.of(entity));
    LeaderboardEntryEntity fromRepository = repository.findById(entity.getPos()).get();
    assertThat(fromRepository, is(entity));
  }
}
