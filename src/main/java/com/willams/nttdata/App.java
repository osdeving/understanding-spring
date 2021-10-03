package com.willams.nttdata;

import com.willams.nttdata.message.MessageProvider;
import com.willams.nttdata.message.MessageRenderer;
import com.willams.nttdata.message.impl.HelloWorldMessageProvider;
import com.willams.nttdata.message.impl.StandardOutputMessageRenderer;

public class App  {
    public static void main( String[] args ) {
        MessageRenderer messageRenderer = new StandardOutputMessageRenderer();
        MessageProvider messageProvider = new HelloWorldMessageProvider();

        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
