package test;

import java.io.IOException;

import com.gcm.sender.Message;
import com.gcm.sender.Result;
import com.gcm.sender.Sender;
import com.gcm.sender.Message.Builder;

public class GCMSender {

	public static void main(String[] args) {
		Sender sender = new Sender("AIzaSyA96fQxolm1Y4NrJ9af7o9LgIj3JVGrxoc");
		Message message = new Message.Builder()
		    .addData("message", "this is the message")
		    .addData("other-parameter", "some value")
		    .build();
		try {
			Result result = sender.send(message, "APA91bE-924V0ZOebKGS6cnRFjBlQdDhH77yAPiWNLyBGyCNZMuQiCaUdcFxi9gkFH5UyDhxliQJ5aOKTO1cpGiz6VYqvSSLbDL1L9ADQxyZbl7FEy33zjY", 1);
			System.out.println(result);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void send(){
		
	}

}
