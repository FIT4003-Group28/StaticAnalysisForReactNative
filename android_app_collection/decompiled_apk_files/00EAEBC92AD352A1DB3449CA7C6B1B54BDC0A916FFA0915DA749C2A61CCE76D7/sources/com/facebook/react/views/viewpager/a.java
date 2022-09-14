package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
class a extends com.facebook.react.uimanager.events.c<a> {

    /* renamed from: f  reason: collision with root package name */
    private final int f6404f;

    /* renamed from: g  reason: collision with root package name */
    private final float f6405g;

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i, int i2, float f2) {
        super(i);
        this.f6404f = i2;
        this.f6405g = (Float.isInfinite(f2) || Float.isNaN(f2)) ? 0.0f : f2;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("position", this.f6404f);
        createMap.putDouble("offset", this.f6405g);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), j());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topPageScroll";
    }
}
