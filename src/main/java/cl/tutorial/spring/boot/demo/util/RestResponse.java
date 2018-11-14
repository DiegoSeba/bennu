package cl.tutorial.spring.boot.demo.util;

public class RestResponse {

	private Integer responseCode;
	private String message;
	
	public RestResponse(Integer responseCode, String message) {
		
		this.responseCode = responseCode;
		this.message = message;
	}
	
	public RestResponse(Integer responseCode) {
		
		this.responseCode = responseCode;
		
	}

	public Integer getResponseCode() {
		return responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setResponseCode(Integer responseCode) {
		this.responseCode = responseCode;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	


	
	
	
	
	
	
}
