package com.pfm.controler;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xiuye.jsonp.callback.manager.JsonpCallbackManager;
import com.xiuye.jsonp.execute.DefaultExecute;

@Controller
public class JsonpCallbackController {

	private Logger log = Logger.getLogger(JsonpCallbackController.class);



	/**
	 * just for jquery jsonp
	 *
	 * @param callback
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "josnp.do", method = RequestMethod.POST, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String josnp(String callback, HttpServletRequest req) {

		log.debug("josnp post ...");

		Map<String, String[]> map = req.getParameterMap();

		DefaultExecute exec = JsonpCallbackManager.defaultExecute();
		log.debug("parameters' map := " + map);
		if (map != null && !map.isEmpty() && map.containsKey("callback")) {
			if (map.size() == 2) {
				return exec.jsonp(callback);
			} else if (map.size() > 2) {
				return exec.jsonp(callback, map);
			}
		}
		return "not have jsonp callback function!";

	}

	@RequestMapping(value = "josnp.do", method = RequestMethod.GET, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String josnpGet(String callback, HttpServletRequest req) {
		log.debug("jsonp get");
		return this.josnp(callback, req);
	}

	@RequestMapping(value = "josnp.do", method = RequestMethod.PUT, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String josnpPut(String callback, HttpServletRequest req) {
		log.debug("jsonp put");
		return this.josnp(callback, req);
	}

	@RequestMapping(value = "josnp.do", method = RequestMethod.DELETE, produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String josnpDelete(String callback, HttpServletRequest req) {
		log.debug("jsonp delete");
		return this.josnp(callback, req);
	}

}
