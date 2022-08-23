package com.fastcampus.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.fastcampus.board.dto.PostDto;
import com.fastcampus.board.dto.PostsSaveRequestDto;
import com.fastcampus.board.model.entity.Board;
import com.fastcampus.board.service.PostsService;

@Controller
public class BoardController {
    // TODO BoardController는 JSP를 이용한 화면 로직과 연결되어 있습니다.
    //  다른 부분은 바꾸지 말고 TODO 부분만 작성해주시기를 권장합니다 :)
    // TODO please write code on only TODO part in BoardController

	@Autowired
	private PostsService postsService;
	
//    @RequestMapping(value="/save",method = RequestMethod.POST)
//    public String createPost(@ModelAttribute("command") PostDto postDto){
//        System.out.println("save " + postDto);
//        /* TODO: 게시물 추가 로직*/
////        boardRepository.save(postDto);
//        return "redirect:/"; // 추가 후 홈 화면으로
//    }
	
	@PostMapping("/save")
	public Long save(@RequestBody PostsSaveRequestDto requestDto) {
		return postsService.save(requestDto);
	}

//    @RequestMapping("/")
//    public String ReadAllPost(Model model){
//        // List<PostDto> postList = /* TODO 게시물 전체를 받아오는 로직 */
//
//    	Iterable<Board> boardList = boardRepository.findAll();
//    	
//        model.addAttribute("boardList", boardList);
//        return "index";
//    }
    
//    @RequestMapping("/")
//    public String ReadAllPost(Model model, Board board){
//        // List<PostDto> postList = /* TODO 게시물 전체를 받아오는 로직 */
//
//    	List<Board> boardList = boardService.getBoardList(board);
//    	
//        model.addAttribute("boardList", boardList);
//        return "index";
//    }
//    
//    @RequestMapping(value="/update",method = RequestMethod.POST)
//    public String updatePost(@ModelAttribute("command") PostDto postDto){
//        System.out.println("update " + postDto);
//        /* TODO 게시물 수정 로직 */
//        return "redirect:/";
//    }
//
//    @RequestMapping(value="/delete/{id}",method = RequestMethod.GET)
//    public String deletePost(@PathVariable int id){
//        System.out.println("삭제 " + id);
//        /* TODO 게시물 삭제 로직 */
//        return "redirect:/";
//    }
//
//    // ***************************************************************************************************
//    // ******************************************* Do not edit *******************************************
//    // 아래 부분은 수정 안하셔도 됩니다. (글 생성, 글 업데이트 창으로 연결하는 부분)
//
//    @RequestMapping(value="/createView")
//    public String ViewCreate(Model model){
//        model.addAttribute("command", new PostDto());
//        return "create";
//    }
//
//    @RequestMapping(value="/updateView/{id}")
//    public String ViewUpdate(@PathVariable int id, Model model){
//        PostDto postDto = new PostDto();
////        postDto.setPostId(id);
//        model.addAttribute("command",postDto);
//        return "update";
//    }
}
