package com.willams.nttdata;

import com.willams.nttdata.factory.MessageSupportFactory;
import com.willams.nttdata.message.MessageProvider;
import com.willams.nttdata.message.MessageRenderer;
import com.willams.nttdata.message.impl.HelloWorldMessageProvider;
import com.willams.nttdata.message.impl.StandardOutputMessageRenderer;

public class App  {
    public static void main( String[] args ) {
        MessageRenderer messageRenderer = MessageSupportFactory.getInstance().getMessageRenderer();
        MessageProvider messageProvider = MessageSupportFactory.getInstance().getMessageProvider();

        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
