package com.willams.nttdata.message.impl;

import com.willams.nttdata.message.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
	private static final String HELLO_WORLD = "Hello, World!";

	@Override
	public String getMessage() {
		return HELLO_WORLD;
	}
}
