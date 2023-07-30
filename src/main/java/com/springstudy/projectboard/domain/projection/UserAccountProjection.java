package com.springstudy.projectboard.domain.projection;

import com.springstudy.projectboard.domain.UserAccount;
import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDateTime;

@Projection(name = "withoutPassword", types = UserAccount.class)
public interface UserAccountProjection {
    Long getUserId();
    String getEmail();
    String getNickname();
    String getMemo();
    LocalDateTime getCreatedAt();
    String getCreatedBy();
    LocalDateTime getModifiedAt();
    String getModifiedBy();
}
