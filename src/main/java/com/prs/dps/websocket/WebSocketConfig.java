package com.prs.dps.websocket;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.*;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;
//import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

/**
 * Created by ffulauh on 2017/5/23.
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer{
//    extends WebSocketMessageBrokerConfigurationSupport
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        registry.addHandler(myHandler(), "/myHandler")
                .setAllowedOrigins("*").withSockJS();
//                .addInterceptors(new HttpSessionHandshakeInterceptor());
//        registry.addHandler(myHandler(),"/myHandler");

    }

    @Bean
    public ServletServerContainerFactoryBean createWebSocketContainer(){
        ServletServerContainerFactoryBean container=new ServletServerContainerFactoryBean();
        container.setMaxTextMessageBufferSize(8192);
        container.setMaxBinaryMessageBufferSize(8192);
        return container;
    }

//    @Override
//    protected void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
//        stompEndpointRegistry.addEndpoint("/myHandler").withSockJS()
//                .setStreamBytesLimit(512*1024)
//                .setHttpMessageCacheSize(1000)
//                .setDisconnectDelay(30*1000);
//    }

    @Bean
    public WebSocketHandler myHandler() {
        return new MyHandler();
    }
}

/**
 * the XML configuration equivalent
 <beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xmlns:websocket="http://www.springframework.org/schema/websocket"
    xsi:schemaLocation="
        http://www.springframework.org/schema/beans
        http://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/websocket
        http://www.springframework.org/schema/websocket/spring-websocket.xsd">

 <websocket:handlers>
    <websocket:mapping path="/myHandler" handler="myHandler"/>
    <websocket:sockjs/>
    <websocket:handshake-interceptors>
        <bean class="org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor"/>
    </websocket:handshake-interceptors>
 </websocket:handlers>

 <bean class="org.springframework...ServletServerContainerFactoryBean">
    <property name="maxTextMessageBufferSize" value="8192"/>
    <property name="maxBinaryMessageBufferSize" value="8192"/>
 </bean>

 <bean id="myHandler" class="org.springframework.samples.MyHandler"/>

 </beans>
 */
