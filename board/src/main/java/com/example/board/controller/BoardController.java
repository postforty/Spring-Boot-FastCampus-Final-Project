package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
	
//    private final BoardService boardService;

    @GetMapping("/")
    public String list() {
    	
    	log.info("list..................");
        return "index";
    }
//
//    @PostMapping("")
//    public WishListDto add(@RequestBody WishListDto wishListDto){
//        log.info("{}", wishListDto);
//        return wishListService.add(wishListDto);
//    }
//
//    @GetMapping("/all")
//    public List<WishListDto> findAll(){
//        return wishListService.findAll();
//    }
//
//    @DeleteMapping("/{index}")
//    public void delete(@PathVariable int index){
//        wishListService.delete(index);
//    }
//
//    @PostMapping("/{index}")
//    public void addVisit(@PathVariable int index){
//        wishListService.addVisit(index);
//    }

}
