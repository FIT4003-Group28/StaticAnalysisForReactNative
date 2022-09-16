package com.facebook.react.views.slider;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ReactSlidingCompleteEvent.java */
/* loaded from: classes.dex */
public class c extends com.facebook.react.uimanager.events.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final double f4058a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topSlidingComplete";
    }

    @Override // com.facebook.react.uimanager.events.b
    public boolean b() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public c(int i, double d2) {
        super(i);
        this.f4058a = d2;
    }

    public double j() {
        return this.f4058a;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), k());
    }

    private ar k() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("target", d());
        b2.putDouble("value", j());
        return b2;
    }
}
