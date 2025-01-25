package com.RuanPablo2.gamelist.controllers;

import com.RuanPablo2.gamelist.dto.GameListDTO;
import com.RuanPablo2.gamelist.dto.GameMinDTO;
import com.RuanPablo2.gamelist.services.GameListService;
import com.RuanPablo2.gamelist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

    @GetMapping(value = "/{listId}")
    public GameListDTO findById(@PathVariable Long listId){
        GameListDTO result = gameListService.findById(listId);
        return result;
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId){
        List<GameMinDTO> result = gameService.findByList(listId);
        return result;
    }
}