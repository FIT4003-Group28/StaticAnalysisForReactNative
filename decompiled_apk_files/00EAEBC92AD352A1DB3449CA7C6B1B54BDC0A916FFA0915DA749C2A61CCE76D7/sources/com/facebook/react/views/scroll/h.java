package com.facebook.react.views.scroll;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.q;
/* loaded from: classes.dex */
public class h extends com.facebook.react.uimanager.events.c<h> {
    private static final androidx.core.util.f<h> o = new androidx.core.util.f<>(3);

    /* renamed from: f  reason: collision with root package name */
    private int f6229f;

    /* renamed from: g  reason: collision with root package name */
    private int f6230g;

    /* renamed from: h  reason: collision with root package name */
    private double f6231h;
    private double i;
    private int j;
    private int k;
    private int l;
    private int m;
    private i n;

    private h() {
    }

    private void a(int i, i iVar, int i2, int i3, float f2, float f3, int i4, int i5, int i6, int i7) {
        super.a(i);
        this.n = iVar;
        this.f6229f = i2;
        this.f6230g = i3;
        this.f6231h = f2;
        this.i = f3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = i7;
    }

    public static h b(int i, i iVar, int i2, int i3, float f2, float f3, int i4, int i5, int i6, int i7) {
        h a2 = o.a();
        if (a2 == null) {
            a2 = new h();
        }
        a2.a(i, iVar, i2, i3, f2, f3, i4, i5, i6, i7);
        return a2;
    }

    private WritableMap j() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", 0.0d);
        createMap.putDouble("bottom", 0.0d);
        createMap.putDouble("left", 0.0d);
        createMap.putDouble("right", 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", q.a(this.f6229f));
        createMap2.putDouble("y", q.a(this.f6230g));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble("width", q.a(this.j));
        createMap3.putDouble("height", q.a(this.k));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble("width", q.a(this.l));
        createMap4.putDouble("height", q.a(this.m));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", this.f6231h);
        createMap5.putDouble("y", this.i);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", g());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(g(), d(), j());
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean a() {
        return this.n == i.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.c
    public short c() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String d() {
        i iVar = this.n;
        c.d.k.a.a.a(iVar);
        return i.a(iVar);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void i() {
        o.a(this);
    }
}
