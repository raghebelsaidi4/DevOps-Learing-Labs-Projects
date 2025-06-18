package com.ragheb.demo;

public record CreateBookmarkRequest(
        String title,
        String url) {}