package com.RuanPablo2.gamelist.repositories;

import com.RuanPablo2.gamelist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}