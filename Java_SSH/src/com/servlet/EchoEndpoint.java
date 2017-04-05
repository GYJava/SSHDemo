package com.servlet;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.Future;

import javax.websocket.CloseReason;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.RemoteEndpoint;
import javax.websocket.SendHandler;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;


@ServerEndpoint("/echo")
public class EchoEndpoint   implements RemoteEndpoint.Async {
	
	
	@OnOpen
	//OnOpen 在这个端点一个新的连接建立时被调用
	public void onOpen(Session session) throws IOException {
		System.out.println("onOpen");
	}
	
	
	
	@OnClose
	//在连接被终止时调用
	 public void onClose(Session session, CloseReason reason) {
		 System.out.println("OnClose");
	} 
	
	@OnError
	public void onError(Throwable t) {
		System.out.println("onError");
	}

	@OnMessage
	 public String onMessage(String s) {
		System.out.println("OnMessage");
		return null;
	}



	@Override
	public void flushBatch() throws IOException {
		// TODO Auto-generated method stub
		System.out.println("flushBatch");
	}



	@Override
	public boolean getBatchingAllowed() {
		// TODO Auto-generated method stub
		System.out.println("getBatchingAllowed");
		return false;
	}



	@Override
	public void sendPing(ByteBuffer arg0) throws IOException, IllegalArgumentException {
		// TODO Auto-generated method stub
		System.out.println("sendPing");
	}



	@Override
	public void sendPong(ByteBuffer arg0) throws IOException, IllegalArgumentException {
		// TODO Auto-generated method stub
		System.out.println("sendPong");
	}



	@Override
	public void setBatchingAllowed(boolean arg0) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("setBatchingAllowed");
	}



	@Override
	public long getSendTimeout() {
		// TODO Auto-generated method stub
		System.out.println("getSendTimeout");
		return 0;
	}



	@Override
	public Future<Void> sendBinary(ByteBuffer arg0) {
		// TODO Auto-generated method stub
		System.out.println("sendBinary");
		return null;
	}



	@Override
	public void sendBinary(ByteBuffer arg0, SendHandler arg1) {
		// TODO Auto-generated method stub
		System.out.println("sendBinary");
	}



	@Override
	public Future<Void> sendObject(Object arg0) {
		// TODO Auto-generated method stub
		System.out.println("sendObject");
		return null;
	}



	@Override
	public void sendObject(Object arg0, SendHandler arg1) {
		// TODO Auto-generated method stub
		System.out.println("sendObject");
	}



	@Override
	public Future<Void> sendText(String arg0) {
		// TODO Auto-generated method stub
		System.out.println("sendText");
		return null;
	}



	@Override
	public void sendText(String arg0, SendHandler arg1) {
		// TODO Auto-generated method stub
		System.out.println("sendText");
	}



	@Override
	public void setSendTimeout(long arg0) {
		// TODO Auto-generated method stub
		System.out.println("setSendTimeout");
	} 
	
	
	
//	@Message
//	 public void receiveMessage(String s) {
//		 System.out.println(s);
//	 } 
	
	

}
