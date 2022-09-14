package com.facebook.react.views.picker.d;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
/* loaded from: classes.dex */
public class a extends c<a> {

    /* renamed from: f  reason: collision with root package name */
    private final int f6194f;

    public a(int i, int i2) {
        super(i);
        this.f6194f = i2;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f6194f);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), j());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topSelect";
    }
}
