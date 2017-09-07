package com.prs.dps.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.CloseStatus;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

import java.util.Date;

/**
 * Created by ffulauh on 2017/5/23.
 */
public class MyHandler extends TextWebSocketHandler {

    private static final Logger logger= LoggerFactory.getLogger(MyHandler.class);

    @Override
    public void afterConnectionEstablished(WebSocketSession session) throws Exception {
        logger.debug("connection established");
        session.sendMessage(new TextMessage("connection established"));
        super.afterConnectionEstablished(session);
    }

    @Override
    public void handleTextMessage(WebSocketSession session, TextMessage message)throws Exception{
//        logger.debug();
        session.sendMessage(new TextMessage(new Date()+""));
    }

    @Override
    public void handleTransportError(WebSocketSession session, Throwable exception) throws Exception {
        if(session.isOpen()){
            session.close();
        }
        logger.debug("handleTransportError--{}",exception.getMessage());
        super.handleTransportError(session, exception);
    }

    @Override
    public void afterConnectionClosed(WebSocketSession session, CloseStatus status) throws Exception {
        logger.debug("connection closed, because {}",status.getReason());
        super.afterConnectionClosed(session, status);
    }
}
