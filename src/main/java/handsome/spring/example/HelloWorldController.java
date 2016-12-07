package handsome.spring.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//http://www.codedata.com.tw/java/java-tutorial-the-4th-class-1-spring-webmvc �Ѧ�

@Controller
public class HelloWorldController {

	@RequestMapping("/helloworld")
	public String hello(@RequestParam("user") String user, Model model){
		
		//model.addAttribute("greeting", "Hello Spring MVC");//��L��helloworld.jsp��${greeting}�A�e�{���		
		//return "helloworld";//�ݭnjsp�ɦW�@�P
		
		model.addAttribute("greeting", user);
        return "helloworld";
		
	}
	
/*	private String viewPage;
	
	public ModelAndView handleRequest(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		String user = req.getParameter("user");
        return new ModelAndView(viewPage, "user", user);
	}
	
	public void setViewPage(String viewPage) {
        this.viewPage = viewPage;
    }*/
}
