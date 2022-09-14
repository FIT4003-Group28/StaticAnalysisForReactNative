package com.google.firebase.crashlytics.c.h;
/* loaded from: classes.dex */
public enum v {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: b  reason: collision with root package name */
    private final int f8782b;

    v(int i) {
        this.f8782b = i;
    }

    public static v a(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int a() {
        return this.f8782b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f8782b);
    }
}
