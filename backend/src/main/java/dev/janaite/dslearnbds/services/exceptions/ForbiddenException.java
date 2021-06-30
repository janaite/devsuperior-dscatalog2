package dev.janaite.dslearnbds.services.exceptions;

public class ForbiddenException extends RuntimeException {
	/* used for HTTP 403: token valid, resource denied */
	private static final long serialVersionUID = 1L;

	public ForbiddenException(String msg) {
		super(msg);
	}

}
