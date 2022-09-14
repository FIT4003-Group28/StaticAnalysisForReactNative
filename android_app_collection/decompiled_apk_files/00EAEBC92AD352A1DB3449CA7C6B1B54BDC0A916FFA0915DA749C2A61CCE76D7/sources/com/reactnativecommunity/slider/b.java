package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: f  reason: collision with root package name */
    private final double f9804f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f9805g;

    public b(int i, double d2, boolean z) {
        super(i);
        this.f9804f = d2;
        this.f9805g = z;
    }

    private WritableMap l() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", g());
        createMap.putDouble("value", j());
        createMap.putBoolean("fromUser", k());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), l());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topChange";
    }

    public double j() {
        return this.f9804f;
    }

    public boolean k() {
        return this.f9805g;
    }
}
