package com.facebook.react.views.scroll;
/* compiled from: ScrollEventType.java */
/* loaded from: classes.dex */
public enum i {
    BEGIN_DRAG("topScrollBeginDrag"),
    END_DRAG("topScrollEndDrag"),
    SCROLL("topScroll"),
    MOMENTUM_BEGIN("topMomentumScrollBegin"),
    MOMENTUM_END("topMomentumScrollEnd");
    
    private final String f;

    i(String str) {
        this.f = str;
    }

    public String a() {
        return this.f;
    }
}
