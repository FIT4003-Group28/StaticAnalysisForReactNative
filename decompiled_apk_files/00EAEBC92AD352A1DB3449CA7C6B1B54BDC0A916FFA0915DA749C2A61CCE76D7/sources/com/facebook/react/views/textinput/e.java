package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class e extends com.facebook.react.uimanager.events.c<e> {

    /* renamed from: f  reason: collision with root package name */
    private String f6361f;

    /* renamed from: g  reason: collision with root package name */
    private int f6362g;

    public e(int i, String str, int i2) {
        super(i);
        this.f6361f = str;
        this.f6362g = i2;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("text", this.f6361f);
        createMap.putInt("eventCount", this.f6362g);
        createMap.putInt("target", g());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), j());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topChange";
    }
}
