package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.q;
/* loaded from: classes.dex */
public class b extends c<b> {

    /* renamed from: f  reason: collision with root package name */
    private final int f5893f;

    /* renamed from: g  reason: collision with root package name */
    private final int f5894g;

    public b(int i, int i2, int i3) {
        super(i);
        this.f5893f = i2;
        this.f5894g = i3;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("width", q.a(this.f5893f));
        createMap.putDouble("height", q.a(this.f5894g));
        rCTEventEmitter.receiveEvent(g(), "topContentSizeChange", createMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topContentSizeChange";
    }
}
