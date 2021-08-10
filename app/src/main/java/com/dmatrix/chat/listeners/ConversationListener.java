package com.dmatrix.chat.listeners;

import com.dmatrix.chat.models.User;

public interface ConversationListener {
    void onConversationClicked(User user);
}
