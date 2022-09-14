package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class c extends com.facebook.react.uimanager.events.c<c> {

    /* renamed from: f  reason: collision with root package name */
    private final double f6250f;

    public c(int i, double d2) {
        super(i);
        this.f6250f = d2;
    }

    private WritableMap k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", g());
        createMap.putDouble("value", j());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), k());
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public short c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topSlidingComplete";
    }

    public double j() {
        return this.f6250f;
    }
}
