package com.facebook.react.views.textinput;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: ReactContentSizeChangedEvent.java */
/* loaded from: classes.dex */
public class b extends com.facebook.react.uimanager.events.b<e> {

    /* renamed from: a  reason: collision with root package name */
    private float f4129a;

    /* renamed from: b  reason: collision with root package name */
    private float f4130b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topContentSizeChange";
    }

    public b(int i, float f, float f2) {
        super(i);
        this.f4129a = f;
        this.f4130b = f2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        ar b3 = com.facebook.react.bridge.b.b();
        b3.putDouble("width", this.f4129a);
        b3.putDouble("height", this.f4130b);
        b2.a("contentSize", b3);
        b2.putInt("target", d());
        return b2;
    }
}
