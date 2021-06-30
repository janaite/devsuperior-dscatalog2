package dev.janaite.dslearnbds.services.exceptions;

public class UnauthorizedException extends RuntimeException {
	/* used for HTTP 401: token invalid */
	private static final long serialVersionUID = 1L;

	public UnauthorizedException(String msg) {
		super(msg);
	}

}
