package com.springai.anthropic;

import java.util.UUID;

public record ChatResponse(UUID chatId, String answer) {}
