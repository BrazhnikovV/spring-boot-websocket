package ru.brazhnikov.websocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;
import ru.brazhnikov.websocket.chat.Message;
import ru.brazhnikov.websocket.chat.OutputMessage;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ChatController {

    @MessageMapping("/chat")
    @SendTo("/topic/messages")
    public OutputMessage send(Message message) throws Exception {
        String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(message.getFrom(), message.getText(), time);
    }

}
