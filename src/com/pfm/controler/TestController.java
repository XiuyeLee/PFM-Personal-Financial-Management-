package com.pfm.controler;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pfm.bean.Test;
import com.pfm.service.TestService;
import com.pfm.util.SpeechUtil;
import com.xiuye.speech.Speech;

//@EnableWebMvc
//@Configuration
//@ComponentScan({"com.pfm.controler"})
@Controller
public class TestController {

	// @Resource
	// private TestDao testDao;

	@Resource
	private TestService testService;

	// @Bean
	// public Test test123() {
	// return new Test();
	// }

	// @RequestMapping("/test.do")
	// @ResponseBody
	// public void test(HttpServletResponse res){
	//// res.setHeader("Access-Control-Allow-Origin", "*");
	// res.setHeader("Origin", "http://www.baidu.com");
	// res.setHeader("Access-Control-Allow-Credentials", "true");
	// try {
	// PrintWriter wtiter = res.getWriter();
	// wtiter.println("test();");
	// } catch (IOException e) {
	// e.printStackTrace();
	// }

	// try {
	// res.sendRedirect("http://www.baidu.com");
	// } catch (IOException e) {
	// e.printStackTrace();
	// }
	//
	// }

	@RequestMapping("boot.do")
	@ResponseBody
	String boot() {
		return "Hello World!";
	}

	@RequestMapping("mvc.do")
	public String mvc() {
		SpeechUtil.speakOnce("您打开了mvc.do!");
		return "mvc";
	}

	@RequestMapping("test2.do")
	public String test(Test test) {
		System.out.println("Project's Path := " + System.getProperty("web.root"));
		SpeechUtil.speakOnce("您需要输入信息!");
		if (test.getName() == null) {
			return "test2";
		}
		System.out.println("uuid := " + test.getUuid() + ",name := " + test.getName());

		// this.testService.save(test);
		int i = this.testService.saveTest(test);
		if (i > 0) {
			System.out.println("inset := " + true);
		} else {
			System.out.println("inset := " + false);
		}
		return "test2";
	}

	@RequestMapping("test3.do")
	@ResponseBody
	public List<Test> selectAll() {
		SpeechUtil.speakOnce("您正在下载JSON数据!");
		return this.testService.list();
	}

	@RequestMapping("test1.do")
	public String test1(Test test) {
		SpeechUtil.speakOnce("您打开了test1.");
		return "test1";
	}

	@RequestMapping("deleteAllTest.do")
	public void delete() {

		this.testService.deleteAll();
	}

	@RequestMapping("netInfo.do")
	public void netInfo(HttpServletRequest request, HttpSession session, HttpServletResponse response) {
		System.out.println("===========HttpServletRequest==============");
		System.out.println("AuthType := " + request.getAuthType());
		System.out.println("CharacterEncoding := " + request.getCharacterEncoding());
		System.out.println("ContentLength := " + request.getContentLength());
		System.out.println("ContentType := " + request.getContentType());
		System.out.println("ContextPath := " + request.getContextPath());
		System.out.println("LocalAddr := " + request.getLocalAddr());
		System.out.println("LocalName := " + request.getLocalName());
		System.out.println("LocalPort := " + request.getLocalPort());
		System.out.println("Method := " + request.getMethod());
		System.out.println("PathInfo := " + request.getPathInfo());
		System.out.println("PathTranslated := " + request.getPathTranslated());
		System.out.println("Protocol := " + request.getProtocol());
		System.out.println("QueryString := " + request.getQueryString());
		System.out.println("RemoteAddr := " + request.getRemoteAddr());
		System.out.println("RemoteHost := " + request.getRemoteHost());
		System.out.println("RemotePort := " + request.getRemotePort());
		System.out.println("RemoteUser := " + request.getRemoteUser());
		System.out.println("RequestedSessionId := " + request.getRequestedSessionId());
		System.out.println("RequestURI := " + request.getRequestURI());
		System.out.println("Scheme := " + request.getScheme());
		System.out.println("ServerName := " + request.getServerName());
		System.out.println("ServerPort := " + request.getServerPort());
		System.out.println("ServletPath := " + request.getServletPath());
		System.out.println("UserPrincipal := " + request.getUserPrincipal());
		System.out.println("===========HttpSession==============");
		System.out.println("CreationTime := " + session.getCreationTime());
		System.out.println("Id := " + session.getId());
		System.out.println("LastAccessedTime := " + session.getLastAccessedTime());
		System.out.println("MaxInactiveInterval := " + session.getMaxInactiveInterval());
		System.out.println("===========HttpServletResponse==============");
		System.out.println("BufferSize := " + response.getBufferSize());
		this.testService.deleteAll();
	}

	// @Resource
	// private Test test;
	//
	// public Test getTest() {
	// return test;
	// }
}
