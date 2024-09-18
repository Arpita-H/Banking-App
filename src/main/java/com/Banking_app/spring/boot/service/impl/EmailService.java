package com.Banking_app.spring.boot.service.impl;

import com.Banking_app.spring.boot.dto.EmailDetails;

public interface EmailService {
    String sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
