package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
/* compiled from: PageScrollEvent.java */
/* loaded from: classes.dex */
class a extends com.facebook.react.uimanager.events.b<a> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4196a;

    /* renamed from: b  reason: collision with root package name */
    private final float f4197b;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topPageScroll";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(int i, int i2, float f) {
        super(i);
        this.f4196a = i2;
        this.f4197b = (Float.isInfinite(f) || Float.isNaN(f)) ? BitmapDescriptorFactory.HUE_RED : f;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putInt("position", this.f4196a);
        b2.putDouble("offset", this.f4197b);
        return b2;
    }
}
