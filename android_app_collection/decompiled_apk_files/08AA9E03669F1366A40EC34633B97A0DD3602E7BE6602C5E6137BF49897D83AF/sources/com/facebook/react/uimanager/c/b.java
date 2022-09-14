package com.facebook.react.uimanager.c;
/* compiled from: AnimatedPropertyType.java */
/* loaded from: classes.dex */
enum b {
    OPACITY("opacity"),
    SCALE_XY("scaleXY");
    

    /* renamed from: c  reason: collision with root package name */
    private final String f3846c;

    b(String str) {
        this.f3846c = str;
    }

    public static b a(String str) {
        b[] values;
        for (b bVar : values()) {
            if (bVar.toString().equalsIgnoreCase(str)) {
                return bVar;
            }
        }
        throw new IllegalArgumentException("Unsupported animated property : " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3846c;
    }
}
