package poly.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class MainController {
	
	private Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value = "index")
	public String Index() {
		log.info(this.getClass());
		
		return "/index";
	}
	
	@RequestMapping(value = "kakao")
	public String api_test() {
		
		log.info(this.getClass());
		log.info("카카오 API 테스트 시작");
		
		return "/kakao";
	}
	
	@RequestMapping(value = "search")
	public String search() {
		
		log.info(this.getClass());
		log.info("Form을 통해 검색한 책을 제대로 검색하는지 확인하는 테스트");
		
		return "/search";
	}
	
	@RequestMapping(value = "/search/forName")
	public String searchForName(HttpServletRequest request, ModelMap model) throws Exception {
		
		log.info(this.getClass().getName() + "입력한 책 이름으로 검색 시작");
		
		String bookName = request.getParameter("bookName");
		
		model.addAttribute("bookName", bookName);
		
		log.info(bookName);
		
		return "/searchResult";
	}
			
}
