package com.facebook.react.uimanager.c;
/* compiled from: InterpolatorType.java */
/* loaded from: classes.dex */
enum e {
    LINEAR("linear"),
    EASE_IN("easeIn"),
    EASE_OUT("easeOut"),
    EASE_IN_EASE_OUT("easeInEaseOut"),
    SPRING("spring");
    
    private final String f;

    e(String str) {
        this.f = str;
    }

    public static e a(String str) {
        e[] values;
        for (e eVar : values()) {
            if (eVar.toString().equalsIgnoreCase(str)) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Unsupported interpolation type : " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f;
    }
}
