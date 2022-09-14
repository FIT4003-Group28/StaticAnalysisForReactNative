package com.facebook.react.views.checkbox;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ReactCheckBoxEvent.java */
/* loaded from: classes.dex */
class b extends com.facebook.react.uimanager.events.b<b> {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f3958a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topChange";
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public b(int i, boolean z) {
        super(i);
        this.f3958a = z;
    }

    public boolean j() {
        return this.f3958a;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), k());
    }

    private ar k() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("target", d());
        b2.putBoolean("value", j());
        return b2;
    }
}
