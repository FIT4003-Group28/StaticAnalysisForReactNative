package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.c<e> {

    /* renamed from: f  reason: collision with root package name */
    private float f6345f;

    /* renamed from: g  reason: collision with root package name */
    private float f6346g;

    public b(int i, float f2, float f3) {
        super(i);
        this.f6345f = f2;
        this.f6346g = f3;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("width", this.f6345f);
        createMap2.putDouble("height", this.f6346g);
        createMap.putMap("contentSize", createMap2);
        createMap.putInt("target", g());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), j());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topContentSizeChange";
    }
}
