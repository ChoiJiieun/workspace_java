package ch12_exception;

public class BizException extends Exception{
	private String errCode = "";
	
	public BizException(String errCode, String errMsg) {
		super();
		this.errCode = errCode;
	}
	
	public BizException(String errMsg) {
		super(errMsg);
	}
	
	public BizException() {
		
	}
	
	public BizException(Exception e) {
		super(e);
	}

	public String getErrCode() {
		return errCode;
	}
	
}
