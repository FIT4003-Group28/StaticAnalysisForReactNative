package com.google.ar.core;
/* compiled from: PG */
/* loaded from: classes5.dex */
public enum Module {
    AUGMENTED_FACE_IMPROVED_LIP_EYE(0),
    NORMAL_NET(1),
    DEPTH_NET(2);
    
    final int nativeCode;

    Module(int i) {
        this.nativeCode = i;
    }

    static Module forNumber(int i) {
        Module[] values;
        for (Module module : values()) {
            if (module.nativeCode == i) {
                return module;
            }
        }
        StringBuilder sb = new StringBuilder(53);
        sb.append("Unexpected value for native Module, value=");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }
}
