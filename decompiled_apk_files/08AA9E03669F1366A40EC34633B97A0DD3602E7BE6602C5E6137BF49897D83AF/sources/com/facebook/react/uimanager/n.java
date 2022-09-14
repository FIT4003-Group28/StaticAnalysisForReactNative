package com.facebook.react.uimanager;

import android.support.v4.i.j;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: OnLayoutEvent.java */
/* loaded from: classes.dex */
public class n extends com.facebook.react.uimanager.events.b<n> {

    /* renamed from: a  reason: collision with root package name */
    private static final j.b<n> f3928a = new j.b<>(20);

    /* renamed from: b  reason: collision with root package name */
    private int f3929b;

    /* renamed from: c  reason: collision with root package name */
    private int f3930c;

    /* renamed from: d  reason: collision with root package name */
    private int f3931d;
    private int e;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topLayout";
    }

    public static n a(int i, int i2, int i3, int i4, int i5) {
        n a2 = f3928a.a();
        if (a2 == null) {
            a2 = new n();
        }
        a2.b(i, i2, i3, i4, i5);
        return a2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void c() {
        f3928a.a(this);
    }

    private n() {
    }

    protected void b(int i, int i2, int i3, int i4, int i5) {
        super.a(i);
        this.f3929b = i2;
        this.f3930c = i3;
        this.f3931d = i4;
        this.e = i5;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        com.facebook.react.bridge.ar b2 = com.facebook.react.bridge.b.b();
        b2.putDouble("x", o.c(this.f3929b));
        b2.putDouble("y", o.c(this.f3930c));
        b2.putDouble("width", o.c(this.f3931d));
        b2.putDouble("height", o.c(this.e));
        com.facebook.react.bridge.ar b3 = com.facebook.react.bridge.b.b();
        b3.a("layout", b2);
        b3.putInt("target", d());
        rCTEventEmitter.receiveEvent(d(), a(), b3);
    }
}
