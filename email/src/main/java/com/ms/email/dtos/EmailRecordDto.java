package com.ms.email.dtos;

import java.util.UUID;

// STUDY : Record
public record EmailRecordDto(UUID userId, String emailTo, String subject, String text) {

}
