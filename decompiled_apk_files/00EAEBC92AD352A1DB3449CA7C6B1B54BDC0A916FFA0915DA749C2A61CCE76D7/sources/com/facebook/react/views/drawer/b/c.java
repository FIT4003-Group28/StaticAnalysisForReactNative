package com.facebook.react.views.drawer.b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class c extends com.facebook.react.uimanager.events.c<c> {

    /* renamed from: f  reason: collision with root package name */
    private final float f6148f;

    public c(int i, float f2) {
        super(i);
        this.f6148f = f2;
    }

    private WritableMap k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("offset", j());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), k());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topDrawerSlide";
    }

    public float j() {
        return this.f6148f;
    }
}
