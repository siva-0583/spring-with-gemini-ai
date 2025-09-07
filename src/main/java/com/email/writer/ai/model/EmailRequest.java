package com.email.writer.ai.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EmailRequest {
	
	private String emailRequest;
	private String tone;
	public String getEmailRequest() {
		return emailRequest;
	}
	public String getTone() {
		return tone;
	}
	public void setEmailRequest(String emailRequest) {
		this.emailRequest = emailRequest;
	}
	public void setTone(String tone) {
		this.tone = tone;
	}

}
