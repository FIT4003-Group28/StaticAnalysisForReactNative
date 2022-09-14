package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
class c extends com.facebook.react.uimanager.events.c<c> {

    /* renamed from: f  reason: collision with root package name */
    private final int f6407f;

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int i, int i2) {
        super(i);
        this.f6407f = i2;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f6407f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), j());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topPageSelected";
    }
}
