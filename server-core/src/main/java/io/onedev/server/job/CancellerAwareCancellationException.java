package io.onedev.server.job;

import javax.annotation.Nullable;

public class CancellerAwareCancellationException extends java.util.concurrent.CancellationException {

	private static final long serialVersionUID = 1L;
	
	private final Long cancellerId;
	
	public CancellerAwareCancellationException(@Nullable Long cancellerId) {
		this.cancellerId = cancellerId;
	}
	
	@Nullable
	public Long getCancellerId() {
		return cancellerId;
	}
	
}
