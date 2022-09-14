package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: PageSelectedEvent.java */
/* loaded from: classes.dex */
class c extends com.facebook.react.uimanager.events.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4199a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topPageSelected";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c(int i, int i2) {
        super(i);
        this.f4199a = i2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("position", this.f4199a);
        return b2;
    }
}
