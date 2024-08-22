package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.javaex.dao.GuestbookDao;
import com.javaex.vo.PersonVo;

@Controller
public class GuestbookController {
	
	//필드
	@Autowired
	private GuestbookDao guestbookDao;
	//생성자
	
	//메서드 gs
	
	//메서드 일반

	
	//리스트
	
	@RequestMapping(value="/list", method= {RequestMethod.GET, RequestMethod.POST})
	public String list(Model model) {
		
		System.out.println("list용");
		
		List<PersonVo> personList = guestbookDao.getPersonList();
		System.out.println(personList);
		
		model.addAttribute("personList",personList);
		
		
		return "/listForm";
		
	}
	
	
	
	//등록 (기능)
	
	@RequestMapping(value="/insert", method= {RequestMethod.GET, RequestMethod.POST})
	public String insert(@ModelAttribute PersonVo personVo) {
		
		System.out.println("등록이용");
		
		int count = guestbookDao.insertPerson(personVo);
		
		
		return "redirect:/list";
	}
	
	//삭제폼
	@RequestMapping(value="/deleteForm", method= {RequestMethod.GET, RequestMethod.POST})
	public String deleteForm() {
		System.out.println("삭제 폼이용");
		
		
		
		
		return "/deleteForm";
		
	}
	
	//삭제 기능
	@RequestMapping(value="/delete", method= {RequestMethod.GET, RequestMethod.POST})
	public String delete(@RequestParam(value="personId") int personId, @RequestParam(value="password") String password, Model model) {
		System.out.println("삭제 기능이용");
		
		int count = guestbookDao.deletePerson(personId, password);
	
		
		System.out.println(count);
		
		return "redirect:/list";
	}
	
	
	
	
	
	
	
	
}
