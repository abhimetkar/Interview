package com.springboot.exception;

public class StudentException {

		private int status;
		private String message;
		private long timeStamp;
		private String errorCode;
		public StudentException() {
			super();
			// TODO Auto-generated constructor stub
		}
		public StudentException(int status, String message, long timeStamp, String errorCode) {
			super();
			this.status = status;
			this.message = message;
			this.timeStamp = timeStamp;
			this.errorCode = errorCode;
		}
		public int getStatus() {
			return status;
		}
		public void setStatus(int status) {
			this.status = status;
		}
		public String getMessage() {
			return message;
		}
		public void setMessage(String message) {
			this.message = message;
		}
		public long getTimeStamp() {
			return timeStamp;
		}
		public void setTimeStamp(long timeStamp) {
			this.timeStamp = timeStamp;
		}
		public String getErrorCode() {
			return errorCode;
		}
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
		
		

}
