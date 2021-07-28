package knowyourcustomer.technicaltest.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class KnowYourCustomerExceptionHandler {
	
	@ExceptionHandler()
	public ResponseEntity<KnowYourCustomerErrorResponse> handleException(NotFoundException exc) {
		KnowYourCustomerErrorResponse response = new KnowYourCustomerErrorResponse();
		response.setStatus(HttpStatus.NOT_FOUND.value());
		response.setMessage(exc.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler()
	public ResponseEntity<KnowYourCustomerErrorResponse> handleException(Exception exc) {
		KnowYourCustomerErrorResponse response = new KnowYourCustomerErrorResponse();
		response.setStatus(HttpStatus.BAD_REQUEST.value());
		response.setMessage(exc.getMessage());
		response.setTimeStamp(System.currentTimeMillis());
		return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
	}

}
