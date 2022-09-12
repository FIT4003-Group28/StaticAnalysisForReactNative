package com.google.ar.core;
/* compiled from: PG */
/* loaded from: classes5.dex */
public enum ModuleAvailability {
    SUPPORTED_INSTALLED(0),
    SUPPORTED_PENDING_IMMEDIATE_INSTALL(10),
    SUPPORTED_NOT_INSTALLED(11),
    SUPPORTED_PENDING_DEFERRED_INSTALL(20),
    UNKNOWN_ERROR(50);
    
    final int nativeCode;

    ModuleAvailability(int i) {
        this.nativeCode = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ModuleAvailability forNumber(int i) {
        ModuleAvailability[] values;
        for (ModuleAvailability moduleAvailability : values()) {
            if (moduleAvailability.nativeCode == i) {
                return moduleAvailability;
            }
        }
        StringBuilder sb = new StringBuilder(65);
        sb.append("Unexpected value for native ModuleAvailability, value=");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
