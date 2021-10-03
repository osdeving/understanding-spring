package com.willams.nttdata.message;

import com.willams.nttdata.message.MessageProvider;

public interface MessageRenderer {
	void render();

	void setMessageProvider(MessageProvider messageProvider);
	MessageProvider getMessageProvider();

}
