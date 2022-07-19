package kr.hs.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.hs.study.dto.DataBean;
import kr.hs.study.service.dataInterface;

@Controller
public class TestController {
	
	@Autowired
	private dataInterface  service1;
	
	@GetMapping("input_data")
	public String input_data() {
		return "input_data";
	}
	@PostMapping("input_pro")
	public String input_pro(DataBean bean) {
		service1.insert(bean);
		
		return "result";
	}
	@GetMapping("read_data")
	public String read_data(Model model) {
		List<DataBean> list=service1.select();
		model.addAttribute("list", list);
		System.out.println("list size:"+list.size());
		return "result2";
		
	}
	@GetMapping("/update_data")
	public String update_data_form() {
		return "update_data_form";
	}
	
	@PostMapping("/update_pro")
	public String update_pro(DataBean dto) {
		service1.update(dto);
		return "result";
	}
	
	@GetMapping("/delete_data")
	public String delete_data(DataBean bean) {
		service1.delete(bean);
		return "result3";
	}

}
