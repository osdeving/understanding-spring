package com.willams.nttdata.factory;

import com.willams.nttdata.message.MessageProvider;
import com.willams.nttdata.message.MessageRenderer;

import java.util.Properties;

public class MessageSupportFactory {
	private static MessageSupportFactory instance;

	private Properties properties;
	private MessageRenderer renderer;
	private MessageProvider provider;

	static {
		instance = new MessageSupportFactory();
	}

	public MessageSupportFactory() {
		this.properties = new Properties();

		try {
			properties.load(this.getClass().getResourceAsStream("/message-factory.properties"));

			String rendererClass = properties.getProperty("message.renderer.class.name");
			String providerClass = properties.getProperty("message.provider.class.name");

			renderer = (MessageRenderer) Class.forName(rendererClass).newInstance();
			provider = (MessageProvider) Class.forName(providerClass).newInstance();
		} catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static MessageSupportFactory getInstance() {
		return instance;
	}

	public MessageProvider getMessageProvider() {
		return provider;
	}

	public MessageRenderer getMessageRenderer() {
		return renderer;
	}
}
