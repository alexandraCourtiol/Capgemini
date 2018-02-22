package com.test.capgemini;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	 private static final Logger logger = LogManager.getLogger(MyRestController.class);
	
	@RequestMapping(value = "/{myRequestParam}", method = RequestMethod.GET)
	@ResponseBody
    public String home(@PathVariable(name="myRequestParam") String myRequestParam) {
		logger.info("Request Paramater : " + myRequestParam);
		if(myRequestParam.equals("YES_I_CAN")) {
			return "YES_I_CAN_AND_DID_IT";
		}
		else {
			return "NOTHING_TO_SAY";
		}
    }
}
