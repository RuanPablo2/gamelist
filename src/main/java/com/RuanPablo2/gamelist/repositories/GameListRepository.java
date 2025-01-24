package com.RuanPablo2.gamelist.repositories;

import com.RuanPablo2.gamelist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {

}