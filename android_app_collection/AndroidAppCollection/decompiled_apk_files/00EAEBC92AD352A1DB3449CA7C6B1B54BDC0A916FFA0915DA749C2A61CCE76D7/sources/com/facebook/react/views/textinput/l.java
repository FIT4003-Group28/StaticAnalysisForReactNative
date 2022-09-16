package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
class l extends com.facebook.react.uimanager.events.c<l> {

    /* renamed from: f  reason: collision with root package name */
    private int f6375f;

    /* renamed from: g  reason: collision with root package name */
    private int f6376g;

    public l(int i, int i2, int i3) {
        super(i);
        this.f6375f = i2;
        this.f6376g = i3;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("end", this.f6376g);
        createMap2.putInt("start", this.f6375f);
        createMap.putMap("selection", createMap2);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), j());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topSelectionChange";
    }
}
