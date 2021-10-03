package com.willams.nttdata.message.impl;

import com.willams.nttdata.message.MessageProvider;
import com.willams.nttdata.message.MessageRenderer;

public class StandardOutputMessageRenderer implements MessageRenderer {

	private MessageProvider messageProvider;

	@Override
	public void render() {
		if(messageProvider == null) {
			throw new RuntimeException("Você deve setar a propriedade messageProvider");
		}

		System.out.println(messageProvider.getMessage());
	}

	@Override
	public void setMessageProvider(MessageProvider messageProvider) {
		this.messageProvider = messageProvider;
	}

	@Override
	public MessageProvider getMessageProvider() {
		return this.messageProvider;
	}
}
