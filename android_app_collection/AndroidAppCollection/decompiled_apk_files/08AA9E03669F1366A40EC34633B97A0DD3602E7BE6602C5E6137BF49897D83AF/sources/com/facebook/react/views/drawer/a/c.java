package com.facebook.react.views.drawer.a;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: DrawerSlideEvent.java */
/* loaded from: classes.dex */
public class c extends com.facebook.react.uimanager.events.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final float f3963a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topDrawerSlide";
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public c(int i, float f) {
        super(i);
        this.f3963a = f;
    }

    public float j() {
        return this.f3963a;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), k());
    }

    private ar k() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putDouble("offset", j());
        return b2;
    }
}
