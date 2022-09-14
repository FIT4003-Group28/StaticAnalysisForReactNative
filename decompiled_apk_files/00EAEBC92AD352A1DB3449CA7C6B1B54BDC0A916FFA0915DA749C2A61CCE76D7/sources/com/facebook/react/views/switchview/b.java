package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
/* loaded from: classes.dex */
class b extends c<b> {

    /* renamed from: f  reason: collision with root package name */
    private final boolean f6253f;

    public b(int i, boolean z) {
        super(i);
        this.f6253f = z;
    }

    private WritableMap k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", g());
        createMap.putBoolean("value", j());
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
        return "topChange";
    }

    public boolean j() {
        return this.f6253f;
    }
}
