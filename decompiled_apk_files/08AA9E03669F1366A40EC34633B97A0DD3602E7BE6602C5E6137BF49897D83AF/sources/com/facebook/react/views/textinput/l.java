package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ReactTextInputSelectionEvent.java */
/* loaded from: classes.dex */
class l extends com.facebook.react.uimanager.events.b<l> {

    /* renamed from: a  reason: collision with root package name */
    private int f4153a;

    /* renamed from: b  reason: collision with root package name */
    private int f4154b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topSelectionChange";
    }

    public l(int i, int i2, int i3) {
        super(i);
        this.f4153a = i2;
        this.f4154b = i3;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        ar b3 = com.facebook.react.bridge.b.b();
        b3.putInt("end", this.f4154b);
        b3.putInt("start", this.f4153a);
        b2.a("selection", b3);
        return b2;
    }
}
