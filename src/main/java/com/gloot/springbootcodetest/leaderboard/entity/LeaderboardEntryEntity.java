package com.gloot.springbootcodetest.leaderboard.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "leaderboardentry")
@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
public class LeaderboardEntryEntity {
    @Id
    private Integer pos;

    private String nick;

    private Integer score;

    @ManyToOne
    @JoinColumn(name = "leaderboard_id", nullable = false)
    private LeaderboardEntity leaderboardEntity;
}
