package com.ragheb.demo;

import java.time.Instant;

public record Bookmark(
        Long id,
        String title,
        String url,
        Instant createdAt) {}