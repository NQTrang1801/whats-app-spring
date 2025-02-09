package com.socketapp.whatsapp.message;

import com.socketapp.whatsapp.file.FileUtils;
import org.springframework.stereotype.Service;

@Service
public class MessageMapper {
    public MessageResponse toMessageResponse(Message message) {
        return MessageResponse.builder()
                .id(message.getId())
                .content(message.getContent())
                .senderId(message.getSenderId())
                .receiverId(message.getReceiverId())
                .state(message.getState())
                .createdAt(message.getCreatedDate())
                // todo read the media file
                .media(FileUtils.readFileFromLocation(message.getMediaFilePath()))
                .build();
    }
}
