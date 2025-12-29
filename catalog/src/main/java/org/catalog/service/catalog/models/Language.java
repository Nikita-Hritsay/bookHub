package org.catalog.service.catalog.models;

import lombok.Getter;

@Getter
public enum Language {
    ENGLISH("en", "English"),
    SPANISH("es", "Español"),
    FRENCH("fr", "Français"),
    GERMAN("de", "Deutsch"),
    CHINESE("zh", "中文");

    private final String code;
    private final String displayName;

    // Constructor
    Language(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }
}