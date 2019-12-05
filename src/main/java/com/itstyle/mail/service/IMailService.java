package com.itstyle.mail.service;

import com.itstyle.mail.common.model.Email;
import com.itstyle.mail.common.model.Result;

public interface IMailService {

	 void send(Email mail) throws Exception;

	  void sendHtml(Email mail) throws Exception;

	  void sendFreemarker(Email mail) throws Exception;

	 void sendThymeleaf(Email mail) throws Exception;

	 void sendQueue(Email mail) throws Exception;

	 void sendRedisQueue(Email mail) throws Exception;
	 
	 
	 Result listMail(Email mail);
}
