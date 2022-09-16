package com.facebook.react.views.viewpager;

import com.facebook.react.bridge.ar;
import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: PageScrollStateChangedEvent.java */
/* loaded from: classes.dex */
class b extends com.facebook.react.uimanager.events.b<b> {

    /* renamed from: a  reason: collision with root package name */
    private final String f4198a;

    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topPageScrollStateChanged";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public b(int i, String str) {
        super(i);
        this.f4198a = str;
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), j());
    }

    private ar j() {
        ar b2 = com.facebook.react.bridge.b.b();
        b2.putString("pageScrollState", this.f4198a);
        return b2;
    }
}
