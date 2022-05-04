package com.santander.prueba3.service.mapper;

import com.santander.prueba3.domain.User;
import com.santander.prueba3.domain.UserPasswordHistory;
import java.time.Instant;
import org.springframework.stereotype.Service;

@Service
public class UserPasswordHistoryMapper {

    public UserPasswordHistory userToUserPasswordHistory(User user) {
        UserPasswordHistory userPasswordHistory = new UserPasswordHistory();
        userPasswordHistory.setUserId(user.getId());
        userPasswordHistory.setResetDate(Instant.now());
        userPasswordHistory.setPassword(user.getPassword());
        userPasswordHistory.setUser(user);
        return userPasswordHistory;
    }
}
