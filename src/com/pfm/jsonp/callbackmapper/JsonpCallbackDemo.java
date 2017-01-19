package com.pfm.jsonp.callbackmapper;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import net.sf.json.JSONArray;

import org.springframework.stereotype.Component;

import com.pfm.bean.Test;
import com.pfm.dao.mybatis.TestMapper;
import com.xiuye.jsonp.callback.AbstractJsonpCallback;

@Component
public class JsonpCallbackDemo extends AbstractJsonpCallback {

	@Resource
	private TestMapper testDao;

	public String test1(){
		return "{msg : 'json no parameter'}";
	}
	/**
	 * 返回必须是json字符串
	 * @param map
	 * @return
	 */
	public String test2(Map<String,String[]> map){
		System.out.println("jsonp parameter := " + map);
		return "{msg : 'json have parameter'}";

	}

	public String test3(){

		List<Test> list = this.testDao.findAll();
		JSONArray object = JSONArray.fromObject(list);

		return object.toString();

	}

}
