package com.facebook.react.views.picker.a;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.b;
/* compiled from: PickerItemSelectEvent.java */
/* loaded from: classes.dex */
public class a extends b<a> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4009a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topSelect";
    }

    public a(int i, int i2) {
        super(i);
        this.f4009a = i2;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("position", this.f4009a);
        return b2;
    }
}
