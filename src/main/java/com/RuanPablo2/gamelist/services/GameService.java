package com.RuanPablo2.gamelist.services;

import com.RuanPablo2.gamelist.dto.GameMinDTO;
import com.RuanPablo2.gamelist.entities.Game;
import com.RuanPablo2.gamelist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}