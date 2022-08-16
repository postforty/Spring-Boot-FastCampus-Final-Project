package com.fastcampus.board;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fastcampus.board.dto.BoardRequestDto;
import com.fastcampus.board.dto.BoardResponseDto;
import com.fastcampus.board.dto.PostDto;
import com.fastcampus.board.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class BoardController {
	
	private final BoardService boardService;
	
	// TODO BoardController는 JSP를 이용한 화면 로직과 연결되어 있습니다.
    //  다른 부분은 바꾸지 말고 TODO 부분만 작성해주시기를 권장합니다 :)
    // TODO please write code on only TODO part in BoardController

//    @RequestMapping(value="/save",method = RequestMethod.POST)
//    public String createPost(@ModelAttribute("command") PostDto postDto){
//        System.out.println("save " + postDto);
//        /* TODO: 게시물 추가 로직*/
//        return "redirect:/"; // 추가 후 홈 화면으로
//    }
	
	/**
     * 게시글 생성
     */
    @PostMapping("/save")
    public Long save(@RequestBody final BoardRequestDto params) {
        return boardService.save(params);
    }

//    @RequestMapping("/")
//    public String ReadAllPost(Model model){
//        // List<PostDto> postList = /* TODO 게시물 전체를 받아오는 로직 */
//
//        // ********************************************
//        // 게시물을 받아오는 로직을 작성한 뒤엔 아래 2줄은 삭제 해주셔도 됩니다.
//        List<PostDto> postList = new ArrayList<>();
//        postList.add(new PostDto(10, "hey", "새 글", "예제"));
//        // *****************************************
//
//        model.addAttribute("postList", postList);
//        return "index";
//    }
    
    /**
     * 게시글 리스트 조회
     */
    @GetMapping("/")
    public List<BoardResponseDto> findAll() {
        return boardService.findAll();
    }

//    @RequestMapping(value="/update",method = RequestMethod.POST)
//    public String updatePost(@ModelAttribute("command") PostDto postDto){
//        System.out.println("update " + postDto);
//        /* TODO 게시물 수정 로직 */
//        return "redirect:/";
//    }
    
    /**
     * 게시글 수정
     */
    @PatchMapping("/update/{seq}")
    public Long save(@PathVariable final Long seq, @RequestBody final BoardRequestDto params) {
        return boardService.update(seq, params);
    }

    @RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
    public String deletePost(@PathVariable int id){
        System.out.println("삭제 " + id);
        /* TODO 게시물 삭제 로직 */
        return "redirect:/";
    }

    // ***************************************************************************************************
    // ******************************************* Do not edit *******************************************
    // 아래 부분은 수정 안하셔도 됩니다. (글 생성, 글 업데이트 창으로 연결하는 부분)

    @RequestMapping(value="/createView")
    public String ViewCreate(Model model){
        model.addAttribute("command", new PostDto());
        return "create";
    }

    @RequestMapping(value="/updateView/{id}")
    public String ViewUpdate(@PathVariable int id, Model model){
        PostDto postDto = new PostDto();
        postDto.setPostId(id);
        model.addAttribute("command",postDto);
        return "update";
    }
}
