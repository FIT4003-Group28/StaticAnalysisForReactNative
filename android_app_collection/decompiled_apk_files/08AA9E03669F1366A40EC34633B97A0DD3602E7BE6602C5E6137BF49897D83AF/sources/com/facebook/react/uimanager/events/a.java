package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.o;
/* compiled from: ContentSizeChangeEvent.java */
/* loaded from: classes.dex */
public class a extends b<a> {

    /* renamed from: a  reason: collision with root package name */
    private final int f3873a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3874b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topContentSizeChange";
    }

    public a(int i, int i2, int i3) {
        super(i);
        this.f3873a = i2;
        this.f3874b = i3;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putDouble("width", o.c(this.f3873a));
        b2.putDouble("height", o.c(this.f3874b));
        rCTEventEmitter.receiveEvent(d(), "topContentSizeChange", b2);
    }
}
