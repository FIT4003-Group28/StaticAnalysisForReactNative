package com.facebook.react.uimanager;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* loaded from: classes.dex */
public class p extends com.facebook.react.uimanager.events.c<p> {
    private static final androidx.core.util.f<p> j = new androidx.core.util.f<>(20);

    /* renamed from: f  reason: collision with root package name */
    private int f6036f;

    /* renamed from: g  reason: collision with root package name */
    private int f6037g;

    /* renamed from: h  reason: collision with root package name */
    private int f6038h;
    private int i;

    private p() {
    }

    public static p b(int i, int i2, int i3, int i4, int i5) {
        p a2 = j.a();
        if (a2 == null) {
            a2 = new p();
        }
        a2.a(i, i2, i3, i4, i5);
        return a2;
    }

    protected void a(int i, int i2, int i3, int i4, int i5) {
        super.a(i);
        this.f6036f = i2;
        this.f6037g = i3;
        this.f6038h = i4;
        this.i = i5;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", q.a(this.f6036f));
        createMap.putDouble("y", q.a(this.f6037g));
        createMap.putDouble("width", q.a(this.f6038h));
        createMap.putDouble("height", q.a(this.i));
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("layout", createMap);
        createMap2.putInt("target", g());
        rCTEventEmitter.receiveEvent(g(), d(), createMap2);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        return "topLayout";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void i() {
        j.a(this);
    }
}
