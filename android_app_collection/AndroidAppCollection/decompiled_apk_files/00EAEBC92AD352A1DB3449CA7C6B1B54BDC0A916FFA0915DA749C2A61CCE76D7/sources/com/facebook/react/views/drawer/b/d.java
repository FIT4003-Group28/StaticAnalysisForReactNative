package com.facebook.react.views.drawer.b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class d extends com.facebook.react.uimanager.events.c<d> {

    /* renamed from: f  reason: collision with root package name */
    private final int f6149f;

    public d(int i, int i2) {
        super(i);
        this.f6149f = i2;
    }

    private WritableMap k() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("drawerState", j());
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
        return "topDrawerStateChanged";
    }

    public int j() {
        return this.f6149f;
    }
}
