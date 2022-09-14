package com.facebook.react.views.drawer.a;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: DrawerStateChangedEvent.java */
/* loaded from: classes.dex */
public class d extends com.facebook.react.uimanager.events.b<d> {

    /* renamed from: a  reason: collision with root package name */
    private final int f3964a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topDrawerStateChanged";
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public d(int i, int i2) {
        super(i);
        this.f3964a = i2;
    }

    public int j() {
        return this.f3964a;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), k());
    }

    private ar k() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putDouble("drawerState", j());
        return b2;
    }
}
