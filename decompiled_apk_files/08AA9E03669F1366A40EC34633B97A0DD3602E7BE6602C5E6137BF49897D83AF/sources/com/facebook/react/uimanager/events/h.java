package com.facebook.react.uimanager.events;
/* compiled from: TouchEventType.java */
/* loaded from: classes.dex */
public enum h {
    START("topTouchStart"),
    END("topTouchEnd"),
    MOVE("topTouchMove"),
    CANCEL("topTouchCancel");
    
    private final String e;

    h(String str) {
        this.e = str;
    }

    public String a() {
        return this.e;
    }
}
