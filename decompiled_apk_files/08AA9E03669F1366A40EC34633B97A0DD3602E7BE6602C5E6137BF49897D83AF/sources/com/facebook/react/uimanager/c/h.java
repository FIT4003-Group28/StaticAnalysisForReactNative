package com.facebook.react.uimanager.c;
/* compiled from: LayoutAnimationType.java */
/* loaded from: classes.dex */
enum h {
    CREATE("create"),
    UPDATE("update"),
    DELETE("delete");
    

    /* renamed from: d  reason: collision with root package name */
    private final String f3861d;

    h(String str) {
        this.f3861d = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3861d;
    }
}
