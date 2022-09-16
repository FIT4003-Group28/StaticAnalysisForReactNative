package com.facebook.react.views.drawer.a;

import com.facebook.react.uimanager.events.RCTEventEmitter;
/* compiled from: DrawerClosedEvent.java */
/* loaded from: classes.dex */
public class a extends com.facebook.react.uimanager.events.b<a> {
    @Override // com.facebook.react.uimanager.events.b
    public String a() {
        return "topDrawerClosed";
    }

    @Override // com.facebook.react.uimanager.events.b
    public short f() {
        return (short) 0;
    }

    public a(int i) {
        super(i);
    }

    @Override // com.facebook.react.uimanager.events.b
    public void a(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(d(), a(), com.facebook.react.bridge.b.b());
    }
}
