package com.example.board.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.model.entity.Board;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
//@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {
	
//    private final BoardService boardService;
	
	@RequestMapping("/test")
    public String testBoardList(Model model) {
        List<Board> boardList = new ArrayList<Board>();

        // �ӽ� �Խù� 10��
        for (int i = 1; i < 11; i++) {
            Board board = new Board();
            board.setSeq(new Long(i));
            board.setTitle("����" + i);
            board.setWriter("�ۼ���" + i);
            board.setContent("�۳���" + i);
            board.setRegDate(LocalDateTime.now());
            board.setCnt(0L);
            boardList.add(board);
        }
        log.info("test..................");
        log.info(boardList.toString());
        model.addAttribute("boardList", boardList);
        return "index"; // jsp ���� �̸�
    }

//    @GetMapping("/")
//    public String list() {
//    	
//    	log.info("list..................");
//        return "index";
//    }
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
