package org.catalog.service.catalog.models;

public enum Status {
    ACTIVE("active", "Active"),
    ARCHIVED("archived", "Archived"),
    DELETED("deleted", "Deleted");

    private final String code;
    private final String displayName;

    Status(String code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }
}
