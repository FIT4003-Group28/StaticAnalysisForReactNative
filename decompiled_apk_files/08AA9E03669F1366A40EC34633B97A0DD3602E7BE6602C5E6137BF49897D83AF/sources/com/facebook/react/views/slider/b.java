package com.facebook.react.views.slider;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ReactSliderEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.b<b> {

    /* renamed from: a  reason: collision with root package name */
    private final double f4056a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f4057b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topChange";
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public b(int i, double d2, boolean z) {
        super(i);
        this.f4056a = d2;
        this.f4057b = z;
    }

    public double j() {
        return this.f4056a;
    }

    public boolean k() {
        return this.f4057b;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), l());
    }

    private ar l() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("target", d());
        b2.putDouble("value", j());
        b2.putBoolean("fromUser", k());
        return b2;
    }
}
