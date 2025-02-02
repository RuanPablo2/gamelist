package com.RuanPablo2.gamelist.services;

import com.RuanPablo2.gamelist.dto.GameListDTO;
import com.RuanPablo2.gamelist.entities.GameList;
import com.RuanPablo2.gamelist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public GameListDTO findById(Long id){
        GameList result = gameListRepository.findById(id).get();
        return new GameListDTO(result);
    }


}