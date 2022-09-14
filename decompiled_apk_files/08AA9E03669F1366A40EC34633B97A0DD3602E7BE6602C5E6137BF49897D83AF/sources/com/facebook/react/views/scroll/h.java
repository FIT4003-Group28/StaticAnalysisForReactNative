package com.facebook.react.views.scroll;

import android.support.v4.i.j;
import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.o;
/* compiled from: ScrollEvent.java */
/* loaded from: classes.dex */
public class h extends com.facebook.react.uimanager.events.b<h> {

    /* renamed from: a  reason: collision with root package name */
    private static final j.b<h> f4038a = new j.b<>(3);

    /* renamed from: b  reason: collision with root package name */
    private int f4039b;

    /* renamed from: c  reason: collision with root package name */
    private int f4040c;

    /* renamed from: d  reason: collision with root package name */
    private double f4041d;
    private double e;
    private int f;
    private int g;
    private int h;
    private int i;
    private i j;

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public static h a(int i, i iVar, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        h a2 = f4038a.a();
        if (a2 == null) {
            a2 = new h();
        }
        a2.b(i, iVar, i2, i3, f, f2, i4, i5, i6, i7);
        return a2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void c() {
        f4038a.a(this);
    }

    private h() {
    }

    private void b(int i, i iVar, int i2, int i3, float f, float f2, int i4, int i5, int i6, int i7) {
        super.a(i);
        this.j = iVar;
        this.f4039b = i2;
        this.f4040c = i3;
        this.f4041d = f;
        this.e = f2;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
    }

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return ((i) com.facebook.j.a.a.b(this.j)).a();
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return this.j == i.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putDouble("top", 0.0d);
        b2.putDouble("bottom", 0.0d);
        b2.putDouble("left", 0.0d);
        b2.putDouble("right", 0.0d);
        ar b3 = com.facebook.react.bridge.b.b();
        b3.putDouble("x", o.c(this.f4039b));
        b3.putDouble("y", o.c(this.f4040c));
        ar b4 = com.facebook.react.bridge.b.b();
        b4.putDouble("width", o.c(this.f));
        b4.putDouble("height", o.c(this.g));
        ar b5 = com.facebook.react.bridge.b.b();
        b5.putDouble("width", o.c(this.h));
        b5.putDouble("height", o.c(this.i));
        ar b6 = com.facebook.react.bridge.b.b();
        b6.putDouble("x", this.f4041d);
        b6.putDouble("y", this.e);
        ar b7 = com.facebook.react.bridge.b.b();
        b7.a("contentInset", b2);
        b7.a("contentOffset", b3);
        b7.a("contentSize", b4);
        b7.a("layoutMeasurement", b5);
        b7.a("velocity", b6);
        b7.putInt("target", d());
        b7.putBoolean("responderIgnoreScroll", true);
        return b7;
    }
}
