package com.javastudies.javastudiesdemo.DTOs;

import java.math.BigDecimal;

public record TransactionDTO(BigDecimal value, Long senderId, Long receiverId) {
}
